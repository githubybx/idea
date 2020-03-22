package rabbitmqtest.demo.RabbitMq;

import com.rabbitmq.client.*;

import java.io.IOException;

public class MsgRecv3 {
    static String My_Queue3 = "My_queue3";
    static String My_Exchange = "My_exchange";
    public static void main(String[] args) throws IOException {
        //获取连接
        Connection connection = ConnectionUtil.getConnection();
        //获取通道
        Channel channel = connection.createChannel();
        //队列声明
        channel.queueDeclare(My_Queue3,false,false,false,null);
        //绑定交换机
        String routingKey = "goods.#";
        channel.queueBind(My_Queue3,My_Exchange, routingKey);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("接收到的消息是:" + new String(body, "utf-8"));
            }
        };
        //关闭自动应答
        boolean callback = false;
        channel.basicConsume(My_Queue3,callback,defaultConsumer);
    }
}
