public class StringConcatenation {
    public static void main(String[] args) {
        String result = foo("Soz", 'c', 5);
        System.out.println(result);
    }
    public static String foo(String s, char c, int count) {
        String concatenatedString = s;
        for (int i = 0; i < count; i++) {
            concatenatedString += c;
        }
        return concatenatedString;
    }
}
