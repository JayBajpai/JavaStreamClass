import java.util.ArrayList;
import java.util.List;

public class NumberPlayListUC1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < 4 ; i++) {
            myList.add(i);
        }

        // Processing Stream
        myList.stream().forEach(n ->{
            System.out.println(" Stream For Each Value ::" +n);
        });
    }
}