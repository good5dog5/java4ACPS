package W3;

public class CheckDigit
{
    /** Returns the check digit for num
     * Precondition: The number of digits in num is between one and six, inclusive.
     * num >= 0
     */
    public static int getCheck(int num)
    { /* implementation not shown */
        //TODO
        int cnt = 0;
        int digit;
        while(num != 0) {
            digit = num % 10;
            if(digit >= 1 && digit <=6) {
                cnt++;
            }
            num /= 10;
        }
        return cnt;
    }
    /** Returns true if numWithCheckDigit is valid, or false otherwise,
     * as described in part (a)
     * Precondition: The number of digits in numWithCheckDigit is
     * between two and seven, inclusive.
     * numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit)
    { /* to be implemented in part (a) */
        // TODO
        return false;
    }
    // There may be variables and methods not shown.
}
