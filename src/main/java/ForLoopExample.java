public class ForLoopExample {
    private static void printTriangleTrivial() {
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");

    }
    private static void printTriangle(int rows) {
        int maxLen = rows * 2 - 1;

        for (int i = 1; i <= rows; i++) {

            for(int j=1; j <= maxLen; j++) {

                if (j < i || j> 2 * rows - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printTriangleTrivial();
        printTriangle(10);
    }
}
