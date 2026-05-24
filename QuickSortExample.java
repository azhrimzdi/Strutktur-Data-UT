import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class QuickSortExample{
    public static void main(String[] args) {
        List<Integer> data_list = new ArrayList<>();
        data_list.add(40);
        data_list.add(10);
        data_list.add(15);
        data_list.add(20);
        data_list.add(30);
        
        Collections.sort(data_list);
        System.err.println(data_list);

    }
}