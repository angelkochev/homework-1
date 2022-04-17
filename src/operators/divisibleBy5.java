package operators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divisibleBy5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(32);
        list.add(42);
        list.add(55);
        list.add(75);

        for (int i = 0; i <= list.size(); i++) {
            if (i % 5 == 0)
            {
                System.out.println(i);
            }

            //System.out.println(list);
            //nt i = 0;
            // if (i % 5 == 0)
            //     System.out.println(list);
            // if (i >= 150);
            //12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200)
        }

    }
}

