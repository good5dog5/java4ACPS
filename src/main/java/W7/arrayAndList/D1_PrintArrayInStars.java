package W7.arrayAndList;


public class D1_PrintArrayInStars {

    public static void main(String[] args) {
        int[] items = {9, 7, 5, 2, 4} ;

        for (int i = 0; i < items.length; ++i) {
            System.out.printf("%d:", i);
            for(int j = 0; j < items[i]; ++j) {
                System.out.print("*");
            }
            System.out.printf("(%d)\n", items[i]);
        }
    }
}
