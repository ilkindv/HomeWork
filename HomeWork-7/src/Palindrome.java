import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkStringReverse(input);

        if (isPalindrome) {
            System.out.println("The reverse of the input string is the same as the original.");
        } else {
            System.out.println("The reverse of the input string is not the same as the original.");
        }
    }

    public static boolean checkStringReverse(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
