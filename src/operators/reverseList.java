package operators;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class reverseList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(
        Arrays.asList(10, 20, 30, 40, 50));
        for (int i = 0, j = list.size() - 1; i < j; i++){
            list.add(i, list.remove(j));
        }
        System.out.println(list);
    }
}
