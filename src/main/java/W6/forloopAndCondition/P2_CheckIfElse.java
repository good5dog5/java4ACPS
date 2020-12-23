package W6.forloopAndCondition;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

public class P2_CheckIfElse {

    // Write a program called CheckPassFail which prints "PASS"
    // if the int variable "mark" is more than or equal to 50;
    // or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.

    private static void checkPassFail(int mark) {
        System.out.printf("mark is %d", mark);
        if(mark >= 50){
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
        System.out.println("DONE");


    }

    private static void checkOddEven(int mark) {
        if(mark % 2 == 0) {
            System.out.printf("%d : %s Even\n", mark, "String");
            // format string %d -> digit
            // %s -> string
            // %f -> float
        }
        if(mark % 2 != 0) {
            System.out.printf("%d : Odd\n", mark);
        }
    }

    private static void checkOddEvenWithSwitchCase(int mark) {
        switch(mark%2) {
            case 0:
                System.out.printf("Even\n");
                break;
            case 1:
                System.out.printf("Odd\n");
                break;
        }
    }

    private static void myTest() {
//        float a = 3.7F;
        int a = 3;
        System.out.println(a == (int)Math.round(a));
    }

    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            checkOddEvenWithSwitchCase(i);
        }

    }
}
