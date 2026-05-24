import java.util.Stack;

public class BelajarStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack :" + stack);
        System.out.println(stack.pop());
        System.out.println("Stack :" + stack);
        System.err.println("Apakah ini stack kosong? : " + stack.isEmpty());
    }
}