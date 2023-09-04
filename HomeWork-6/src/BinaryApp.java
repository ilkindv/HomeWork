import java.util.Scanner;

public class BinaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the binary number: ");
        String binaryString = scanner.nextLine();

        // İkilik sayıyı ondalık sayıya çevirme
        int decimal = binaryToDecimal(binaryString);

        System.out.println("Decimal equivalent: " + decimal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }
}
