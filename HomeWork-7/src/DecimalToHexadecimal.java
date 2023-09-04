import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in decimal system: ");
        int decimalNumber = scanner.nextInt();
        String hexadecimalNumber = convertToHexadecimal(decimalNumber);
        System.out.println("Equivalent in hexadecimal system: " + hexadecimalNumber);
        scanner.close();
    }

    public static String convertToHexadecimal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        String hexDigits = "0123456789ABCDEF";
        String hexadecimalNumber = "";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            char hexDigit = hexDigits.charAt(remainder);
            hexadecimalNumber = hexDigit + hexadecimalNumber;
            decimalNumber /= 16;
        }

        return hexadecimalNumber;
    }
}
