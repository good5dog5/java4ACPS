package W2;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    private static void abc() {
        for(int i =0; i<10; i++) {
            if( i==8) {
                break;
            }
        }

    }


    public static void main(String[] args) {
//        System.out.println("HelloWorld");
//        tryPrimitive();
        Character [] a = {'a', 'b', 'c'};
        List<Character> cList = new ArrayList<>();
        cList.add('a');
        cList.add('b');
        System.out.println(cList);

        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(intMax);
        System.out.println(longMax);



    }
}
