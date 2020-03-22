package rabbitmqtest.demo.RabbitMq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionUtil {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("127.0.0.1");
            connectionFactory.setPort(5672);
            connectionFactory.setUsername("ybx");
            connectionFactory.setPassword("123456");
            connectionFactory.setVirtualHost("/MyDB");
            connection = connectionFactory.newConnection();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return connection;
        }
    }
}
