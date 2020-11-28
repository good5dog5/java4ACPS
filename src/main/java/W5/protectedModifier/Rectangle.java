package W5.protectedModifier;

public class Rectangle {
    protected  int x, y;
    protected int width, height;
    protected static long attr;

    public Rectangle () {
        x = y =0;
        width = height = 0;

        System.out.println("Construct by No parameter constructor");
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        attr = 13;

        System.out.println("Construct by 4 parameters constructor");
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getArea() { return width*height; }
}
