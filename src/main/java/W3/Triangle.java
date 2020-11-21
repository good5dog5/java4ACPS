package W3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        System.out.println("Please enter in the row number:");
//        int row = in.nextInt();
//        System.out.println("Please enter in the column number:");
//        int col = in.nextInt();
        int row = 5;

        for(int i=5; i>0; i--) {
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i=row; i>=1; i--){
//            for(int j=col; i<=col; j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

//        System.out.printf("The price is %s and made by %d", 50, "Jordan");
    }
}

