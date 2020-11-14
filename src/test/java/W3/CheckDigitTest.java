package W3;


import static org.junit.jupiter.api.Assertions.*;

public class CheckDigitTest {

    public static void main(String[] args) {

        assertEquals(CheckDigit.getCheck(159), 2);
        assertEquals(CheckDigit.getCheck(1159), 3);
        assertTrue(CheckDigit.isValid(1592));
        assertTrue(CheckDigit.isValid(15913));
    }

}