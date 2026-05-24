import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int [] nilai = {40,60,80,90,95,75,55,45};
        Arrays.sort(nilai);
        for(int n : nilai){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
