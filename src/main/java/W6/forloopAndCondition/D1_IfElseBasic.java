package W6.forloopAndCondition;

public class D1_IfElseBasic {

    private static void multipleOf(int aNumber) {
        if (aNumber % 2 == 0) {
            System.out.println("multiple of 2");
        } else if (aNumber % 3 == 0) {
            System.out.println("multiple of 3");
        } else if (aNumber % 5 == 0) {
            System.out.println("multiple of 5");
            // else can be omitted
        } else {
            System.out.println("not multiple of 2, 3, 5");
        }
    }
    public static void main(String[] args) {
        multipleOf(17);
    }
}
