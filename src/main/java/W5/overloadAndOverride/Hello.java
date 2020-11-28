package W5.overloadAndOverride;

public class Hello {
    static void hello() {
        System.out.println("Hello ");
    }
    static void hello(int i) {
        System.out.println("Hello " + i);
    }
    static void hello(int i, int j) {

        System.out.println("Hello " + i + " " + j);
    }
    static void hello(int i, String s) {
        System.out.println("Hello " + i + " " + s);
    }

    public static void main(String[] args) {
        hello();
        hello(1);
        hello(1, "Jordan");
        hello(12, 13);
    }
}
