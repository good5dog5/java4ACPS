import java.util.HashMap;
import java.util.Map;

public class VariableScope {
    public static void main(String[] args) {
        Map<Integer, Integer> aMap = new HashMap<>();
        aMap.put(1,3);
        aMap.put(2,3);

        System.out.println(aMap.get(1));

    }
}
