package W7.forloopAndCondition;

public class D2_Hex2Bin {
    public static void main(String[] args) {
        String[] hexBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        String hexs = "1abc";

        for(char c : hexs.toCharArray()) {
//            System.out.println((int) c);
            int asciiVal = (int) c;

            if(asciiVal >= 48 && asciiVal <= 57) {
                System.out.printf("%s ", hexBits[((int ) c) - 48]);
            } else {
                System.out.printf("%s ", hexBits[((int ) c) - 87]);
            }
        }

    }
}
