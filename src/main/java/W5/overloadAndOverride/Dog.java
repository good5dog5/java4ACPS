package W5.overloadAndOverride;

public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("run"); // 覆寫父類別Animal.move()的內容
    }
}
