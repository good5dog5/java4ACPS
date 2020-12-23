package W6.forloopAndCondition;

public class P4_SumAverageRunningInt {
    public static void main(String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;
        int upperbound = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum = sum + number;
        }
        // Compute average in double. Beware that int / int produces int!
        average = (double) sum / (upperbound-lowerbound+1);
        // Print sum and average
        // The sum is {sum} and the average is {average}
        System.out.printf("The sum is %d and the average is %f",sum, average);

    }
}
