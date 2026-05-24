import java.util.Stack;
public class Belajar{
    public static void main(String[] args) {
        Stack<String> belajar_stack = new Stack<>();
        belajar_stack.push("go");
        belajar_stack.push("Python");
        belajar_stack.push("Java");
        System.out.println("Data yang paling atas = " + belajar_stack.peek());
        System.out.println("Data yang di ambil dan di hapus = " + belajar_stack.pop());
        if(!belajar_stack.isEmpty()){
            System.out.println("Data yang paling akhir = " + belajar_stack.peek());
        }
        System.out.println(belajar_stack);
    }
}
