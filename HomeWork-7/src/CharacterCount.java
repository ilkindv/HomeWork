import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] charCounts = new int[256];
        countCharacters(input, charCounts);
        System.out.println("Number of characters in the series:");
        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > 0) {
                char c = (char) i;
                int count = charCounts[i];
                System.out.println("'" + c + "': " + count + " kez");
            }
        }

        scanner.close();
    }

    public static void countCharacters(String str, int[] charCounts) {
        for (char c : str.toCharArray()) {
            int charValue = (int) c;
            charCounts[charValue]++;
        }
    }
}
