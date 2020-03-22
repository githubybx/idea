package rabbitmqtest.demo.RabbitMq;

import com.rabbitmq.client.*;

import java.io.IOException;

public class MsgRecv4 {
    static String My_Queue4 = "My_queue4";
    static String My_Exchange = "My_exchange1";
    public static void main(String[] args) throws IOException {
        //获取连接
        Connection connection = ConnectionUtil.getConnection();
        //获取通道
        Channel channel = connection.createChannel();
        //队列声明
        channel.queueDeclare(My_Queue4,false,false,false,null);
        //绑定交换机
        channel.queueBind(My_Queue4,My_Exchange, "goods.#");
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("接收到的消息是:" + new String(body, "utf-8"));
            }
        };
        //关闭自动应答
        boolean callback = false;
        channel.basicConsume(My_Queue4,callback,defaultConsumer);
    }
}
