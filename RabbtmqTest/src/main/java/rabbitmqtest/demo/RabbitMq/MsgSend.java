package rabbitmqtest.demo.RabbitMq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import com.rabbitmq.client.Connection;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeoutException;

public class MsgSend {
    static String My_Exchange1 = "My_exchange1";
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {

        //获取连接
        Connection connection = ConnectionUtil.getConnection();
        //获取通道
        Channel channel = connection.createChannel();
        //存放的是未确认消息的标识
        final SortedSet<Long> confirmSet = Collections.synchronizedSortedSet(new TreeSet<Long>());

        //声明交换机
        channel.exchangeDeclare(My_Exchange1,"topic");
        //channel以confirm方式运行
        channel.confirmSelect();
        //通道增加监听
        channel.addConfirmListener(new ConfirmListener() {
            //没有问题的handleAck
            @Override
            public void handleAck(long l, boolean b) throws IOException {
              if(b){
                  System.out.println("handleAck");
                  confirmSet.headSet(l+1).clear();
              }else {
                  confirmSet.remove(l);
              }
            }
            //有问题的handleAck
            @Override
            public void handleNack(long l, boolean b) throws IOException {
                if(b){
                    confirmSet.remove(l);
                }else {
                    System.out.println("handleNack");
                    confirmSet.headSet(l+1).clear();
                }
            }
        });

        //消息
        String msg = "confirm模式下的消息";
        while (true){
            long nextPublishSeqNo = channel.getNextPublishSeqNo();
            channel.basicPublish(My_Exchange1,"goods.add",null,msg.getBytes());
            confirmSet.add(nextPublishSeqNo);
        }
    }
}
