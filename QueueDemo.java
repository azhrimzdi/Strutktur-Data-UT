import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> daftar_number = new LinkedList<>();
        daftar_number.offer(1);
        daftar_number.offer(2);
        daftar_number.offer(3);
        daftar_number.offer(4);
        daftar_number.offer(5);
        daftar_number.offer(6);
        daftar_number.offer(7);
        daftar_number.offer(8);
        for(int n : daftar_number){
            System.out.print(n);
        }
        System.out.println("");
        System.out.println(daftar_number.poll());
        for(int n : daftar_number){
            System.out.print(n);
        }
        System.out.println("");
        System.out.println(daftar_number.peek());
        for(int n : daftar_number){
            System.out.print(n);
        }
        System.out.println("");
    }
}
