package W2;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    private static void tryPrimitive() {
        byte aByte = 100;
        short aShort = 5000;
        long aLong = 5000000L;
        int aInt = 5;               // Integer (whole number)
        float aFloat = 5.99f;    // Floating point number
        char aChar = 'D';         // Character
        boolean aBoolean = true;       // Boolean
        String aString = "Hello";     // String

        System.out.println("aByte: " + aByte);
        System.out.println("aShort: " + aShort);
        System.out.println("aInt: " + aInt);
        System.out.println("aLong: " + aLong);
        System.out.println("aFloat: " + aFloat);
        System.out.println("aChar: " + aChar);
        System.out.println("aBoolean: " + aBoolean);
        System.out.println("aString: " + aString);



    }

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
