package W3;

public class VariableTest {

    private static void tryPrimitive() {
        byte aByte = 100;
        short aShort = 5000;
        long aLong = 5000000;
        int aInt = 5;               // Integer (whole number)
        float aFloat = 5.99f;    // Floating point number
        char aChar = 'D';         // Character
        boolean aBoolean = true;       // Boolean
        String aString = "Hello";     // String

        System.out.println("aByte: " + aByte);
        System.out.println("aShort: " + aShort);
        System.out.println("aInt: " + aInt);
        System.out.println("aLong: " + aLong);
        System.out.println("aFloat: " + aFloat);
        System.out.println("aChar: " + aChar);
        System.out.println("aBoolean: " + aBoolean);
        System.out.println("aString: " + aString);
    }

    private static void tryCasting() {

        int aInt = 20;
        long aLong = 20;

        System.out.println(((Object) aInt).getClass().getName());
        System.out.println(((Object) aLong).getClass().getName());

        System.out.println();

        System.out.println(((Object) 12).getClass().getName());
//        System.out.println(((Object) 1222222222222222).getClass().getName());
        System.out.println(((Object) 2.3).getClass().getName());
        System.out.println(((Object) 2.3f).getClass().getName());
        System.out.println(((Object) 'c').getClass().getName());
        System.out.println(((Object) "Sa").getClass().getName());
//        System.out.println(Integer.class.isInstance(20));
//        System.out.println(Integer.class.isInstance(20L));
//        System.out.println(Long.class.isInstance(20L));
//        System.out.println(Long.class.isInstance(20L));
    }

    public static void main(String[] args) {
        tryCasting();
    }
}
