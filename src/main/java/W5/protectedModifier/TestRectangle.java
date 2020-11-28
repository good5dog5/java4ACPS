package W5.protectedModifier;


public class TestRectangle {
    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle();
       Rectangle rectangle2 = new Rectangle(3, 4, 6, 6);

        System.out.println("R1's area" + rectangle1.getArea());
        System.out.println("R2's area" + rectangle2.getArea());
        System.out.println(Rectangle.attr);

    }
}
