import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);
        numbers.push(60);
        numbers.push(70);
        numbers.push(80);
        System.out.println(numbers);
        System.out.println(numbers.pop());
        System.out.println(numbers);
        System.out.println(numbers.peek());
    }
}
