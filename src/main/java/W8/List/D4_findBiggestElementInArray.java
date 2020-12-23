package W8.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D4_findBiggestElementInArray {
    public static void main(String[] args) {

        Integer [] intArray = {17,29,5,1,9,7,8,2,4,9,432};
        List<Integer> intList = Arrays.asList(intArray);
        // step1: int maxNum
        // step 2: i = 0, for loop starts
        //step 3: i = 0, maxNum = 17
        //step 4: max
//        int maxNum = Integer.MIN_VALUE;
//        for (Integer integer : intList) {
//            if (maxNum < integer) {
//                maxNum = integer;
//            }
//        }
//        System.out.println(maxNum);
        //
        // sort the array
        Collections.sort(intList, Collections.reverseOrder());
        System.out.println(intList);

        // rewrite it to a function
    }
}
