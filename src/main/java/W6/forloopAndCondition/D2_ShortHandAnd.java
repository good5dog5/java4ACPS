package W6.forloopAndCondition;

public class D2_ShortHandAnd {


    private static boolean isTrue() {
        System.out.println("isTure is evaluated");
        return true;
    }

    private static boolean isFalse() {
        System.out.println("isFalse is evaluated");
        return false;
    }
    public static void main(String[] args) {
        // Since first operand is false
        // and operator is &&,
        // Evaluation stops and
        // false is returned.
        if (isFalse() || isTrue() || isTrue()) {
            System.out.println(
                    "This output " +
                    "will not " +
                    "be printed");
        }
        else {

            System.out.println(
                    "This output " +
                    "got printed actually, " +
                    " due to short circuit");
        }
    }



}
