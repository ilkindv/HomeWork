package util;

import java.util.Scanner;

public class InputUtil {
    public static byte Inputbyte(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextByte();
    }
    public static String Inputstring(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLine();
    }
}
