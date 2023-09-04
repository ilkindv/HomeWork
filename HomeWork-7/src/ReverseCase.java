public class ReverseCase {
    public static void main(String[] args) {
        String input = "helloWORLD";
        String reversedCase = reverseCase(input);
        System.out.println(reversedCase);
    }

    public static String reverseCase(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
        }
        return new String(charArray);
    }
}
