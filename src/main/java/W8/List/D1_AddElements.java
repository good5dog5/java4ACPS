package W8.List;

import java.util.ArrayList;
import java.util.List;

public class D1_AddElements {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Black");
        System.out.println(list_Strings);

        // todo go through each element

        for (String list_string : list_Strings) {
            // Red, Green, Black
            // element
            System.out.println(list_string);
            // Red
            // Green
            // Black
        }
    }
}
