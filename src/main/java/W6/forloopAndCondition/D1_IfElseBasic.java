package W6.forloopAndCondition;

public class D1_IfElseBasic {

    private static void multipleOf(int aNumber) {

        if (aNumber % 2 == 0) {
            System.out.println("The number is divisible by two");
        }
        else if (aNumber % 3 == 0) {
            System.out.println("The number is divisible by three");
        }
        else {
            System.out.println("The number is not divisible by two or three");
        }

    }
    private static void multipleOfSix(int aNumber) {
        if (aNumber % 6 == 0) {
            System.out.println("The number is divisible by two and three");
        }
        else if (aNumber % 2 == 0) {
            System.out.println("The number is divisible by two");
        }
        else if (aNumber % 3 == 0) {
            System.out.println("The number is divisible by three");
        }
        else {
            System.out.println("The number is not divisible by two or three");
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++) {
            System.out.printf("i is %d ", i); // 'i is : '%d %s
            multipleOfSix(i);

        }
    }
}
