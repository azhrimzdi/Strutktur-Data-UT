import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> UrutanListAngka = new LinkedList<Integer>();
        UrutanListAngka.addFirst(15);
        UrutanListAngka.addLast(59);
        UrutanListAngka.add(1,28);
        UrutanListAngka.add(2,33);
        UrutanListAngka.add(3,47);
        System.out.println(UrutanListAngka);
        
    }
}
