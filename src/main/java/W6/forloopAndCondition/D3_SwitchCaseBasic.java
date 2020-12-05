package W6.forloopAndCondition;

public class D3_SwitchCaseBasic {
    public static void main(String[] args) {
        // Print number in word
        int number = 3;
        switch (number) {   // "int" selector
            case 1:   // "int" value
                System.out.println("ONE"); break;
            case 2:
                System.out.println("TWO"); break;
            case 3:
                System.out.println("THREE"); break;
            default:
                System.err.println("OTHER");
        }

        // Select arithmetic operation
        char operator = '*';
        int num1 = 5, num2 = 8, result;
        switch (operator) {   // "char" selector
            case '+':   // "char" value
                result = num1 + num2; break;
            case '-':
                result = num1 - num2; break;
            case '*':
                result = num1 * num2; break;
            case '/':
                result = num1 / num2; break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
