package util;

import model.Book;

import java.util.Scanner;

public class InputUtil {
    public static int inputRequiredInt(String title){
        Scanner input = new Scanner(System.in);
        System.out.print(title);
        return input.nextInt();
    }
    public static String inputRequiredString(String title){
        Scanner input = new Scanner(System.in);
        System.out.print(title);
        return  input.nextLine();
    }
    public static Book fillbook(int i ){
        System.out.println("-------------------------------");
        System.out.println(i+1 + ".Book");
        String name = InputUtil.inputRequiredString("Enter the book name: ");
        String description = InputUtil.inputRequiredString("Enter the description: ");
        String author = InputUtil.inputRequiredString("Enter the author name: ");
        System.out.println("-------------------------------");
        return new Book(i+1,name,description,author);

    }
}
