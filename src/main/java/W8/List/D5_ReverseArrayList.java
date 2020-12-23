package W8.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D5_ReverseArrayList {
    public static void main(String[] args) {

        Integer [] intArray = {17,29,5,1,9,7,8,2,4,2324,432};
        List<Integer> intList = Arrays.asList(intArray);

        // sort the array
        Collections.reverse(intList);
        System.out.println(intList);

    }
}
