package rabbitmqtest.demo.RabbitMq;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        integers.headSet(5).clear();
        for(int i : integers){
            System.out.println(i);
        }
    }
}
