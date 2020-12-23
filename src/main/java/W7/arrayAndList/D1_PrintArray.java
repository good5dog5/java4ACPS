package W7.arrayAndList;


public class D1_PrintArray {

    public static void main(String[] args) {
        int[] items = {9, 7, 5, 2, 4} ;

        // Print array contents, need to handle first item and subsequent items differently
        System.out.println("The values are:");
        for (int i = 0; i < items.length; ++i) {
//            if (i == 0) {
//                // Print the first item without a leading commas
//                System.out.printf("%d", items[i]);
//            } else {
//                // Print the subsequent items with a leading commas
//                System.out.printf(", %d", items[i]);
//            }
            // or, using a one liner
            //System.out.print((i == 0) ? ...... : ......);
            System.out.print((i==0) ? items[i] : ", " + items[i]);
        }
    }
}
