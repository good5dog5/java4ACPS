package W5.builderPattern;

public class StringBuild {

    public static void main(String[] args) {

        String s = "AAAA" +
                "BBBB" +
                "CCCC";
        System.out.println(s);


        StringBuilder sb = new StringBuilder();

        sb.append("AAAA");
        sb.append("BBBB");
        sb.append("CCCC");

        System.out.println(sb.toString());
    }
}
