package W8.List;

import java.util.ArrayList;
import java.util.List;

public class D2_AddElementsAtPosition {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Now insert a color at the first and last position of the list
        // R, G, O, W, B
        // 0, 1, 2, 3, 4

        list_Strings.add(0, "Pink");
        // P, R, G, O, W, B
        // 0, 1, 2, 3, 4, 5
        list_Strings.add(5, "Yellow");
        // P, R, G, O, W, Y, B
        // 0, 1, 2, 3, 4, 5, 6
//        list_Strings.add(0, "Pink");
//        list_Strings.add(5, "Yellow");
        // Print the list
        System.out.println(list_Strings);
    }
}
