import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> data = new LinkedList<>();
        data.offer(20);
        data.offer(30);
        data.offer(40);
        System.out.println("Data Queue" + data);
        System.out.println("Data yang keluar : " + data.poll());
        System.out.println("Data Queue" + data);
    }
}