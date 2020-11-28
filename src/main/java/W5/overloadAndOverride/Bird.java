package W5.overloadAndOverride;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("fly"); // 覆寫父類別Animal.move()的內容
    }
}
