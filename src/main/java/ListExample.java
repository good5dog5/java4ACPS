import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    private static void arrayDemo() {
        int [] arr = new int[] {0, 1, 2, 3};
        System.out.println(Arrays.toString(arr));

        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static void listDemo() {
        List<String> list1 = new ArrayList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");
        list1.add("10");
        list1.add("11");

        List<String> list2 = new ArrayList<>(list1);
        list2.add("13");

        double size = 10;
        double count = Math.ceil(list1.size() / size);
        System.out.println("count: " + count);
        for(int i = 0; i < count; i ++) {
            int start = (int)(i * size);
            int end = (int)(start + size);
            if(end >= list1.size()) {
                end = list1.size();
            }
            List<String> subList = list1.subList(start, end);
            System.out.println("subList: " + subList.toString());
        }

        System.out.println(list1.equals(list2));
    }
    public static void main(String[] argv) {
        arrayDemo();
        listDemo();
    }
}
