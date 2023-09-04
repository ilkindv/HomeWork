import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1) Write a Java program to convert minutes into a number of years and days
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        /**
         * 2) Write a Java program that takes a number as input and prints its multiplication table upto 10.
         */
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        /**
         * 3)Daxil edilmiş sətirin tərsi ilə düzünün eyni olub olmadığını yoxlayan proqram yazın.
         *
         * Palindrome class ında proqramı yazmışam
         *
         * 4)Daxil edilən sətirdə hansı simvoldan neçə dəfə istifadə olunduğunu çap edən proqram yazın
         *
         * CharacterCount class ında proqramı yazmışam
         *
         * 5)10lug say sisteminde daxil edilmish ededi 16liga cevirin
         *
         * DecimalToHexadecimal class ında proqramı yazmışam
         *
         * 6) Method String s, char c, int count qebul edir. S-i count qeder c ile birleshdirir ve geriye return edir
         * foo(String s, char c, int count){}
         * foo(“Soz”, ‘c’, 5); -> Sozccccc
         *
         * StringConcatenation class ında proqramı yazmışam
         *
         * 7) helloWORLD sozunu HELLOworld – a cevirem proqram yazın
         *
         * ReverseCase class ında proqramı yazmışam
         */


    }
}