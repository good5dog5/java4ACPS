package W8.Set;

import java.util.HashSet;
import java.util.Set;

public class D1_CreateSet {
    public static void main(String[] args) {
        // Create a empty hash set
        Set<String> stringSet = new HashSet<>();

        // use add() method to add values in the hash set
        stringSet.add("Red");
        stringSet.add("Green");
        stringSet.add("Black");
        stringSet.add("White");
        stringSet.add("Pink");
        stringSet.add("Yellow");

        System.out.println("Original Hash Set: " + stringSet);
        System.out.println("Checking the above array list is empty or not! "+stringSet.isEmpty());

        stringSet.add("Yellow");

        System.out.println("Original Hash Set: " + stringSet);
    }
}
