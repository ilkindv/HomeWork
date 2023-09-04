package util;

public class MenuUtil {
    public static byte entryMenu(){
        System.out.println("""
                -----------------------
                [1] - Login
                [2] - Register
                [0] - Exit
                -----------------------
                """);
        return InputUtil.Inputbyte("Choose option: ");
    }
}
