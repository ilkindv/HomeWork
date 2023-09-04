import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\n" +
                           "b = " + b);
        /**
         * String t = “             1,e 6,e 0,e 9,e           ”; verilmish setirdeki her bir ededin kvadratlarini chap edin.
         */
        String str = "             1,e 6,e 0,e 9,e           ";
        String[] splitStr = str.trim().split(",e");
        int c = 0;
        for (String string: splitStr) {
            int number = Integer.parseInt(string.trim());
            c = (int) (c + Math.pow(number,2));
        }
        System.out.println(c);
        /**
         * 3)String str = “1,2,3,4,5,6,7,8,9”; gosterilmish setiri vergulden sonra boshluq qoyularaq chap edin.
         * Yeni -> “1, 2, 3, 4, 5, 6, 7, 8, 9”
         */
        String str2  = "1,2,3,4,5,6,7,8,9";
        String[] numbers = str2.split(",");
        String result = String.join(", ", numbers);
        System.out.println(result);
        /**
         * 4)Bizdən istifadəçi adını və şifrə tələb edən proqram tərtib edin.
         * (Proqramın içində dəyərləri static olaraq təyin edin.)
         * Daha sonra username səhv yazıldıqda username yanlışdır.
         * Şifrəni səhv yazdıqda şifrə yanlışdır desin.
         * Və şifrəni 3-cü dəfədən artıq yanlış yığarsa sistemdən çıxsın.
         * Əks halda hər biri doğrudursa “Xoş gəldiniz, ‘username’!” – deyə çap etsin.
         * Username hissəsində daxil edilən username yazılsın.
         *
         * UserApp də proqramı yazmışam
         *
         * 5) Int tipini double tipine chevirin.
         */
        int d = scanner.nextInt();
        System.out.println((double) d);
        /**
         * 6)iki int deyerinin sonuncu elementlerinin cemini tapin.
         */
        int num1 = scanner.nextInt() % 10;
        int num2 = scanner.nextInt() % 10;
        System.out.println(num1 + num2);
        /**
         * 7) String tipinde 45 yazin ve bunu int tipine chevirin. (String count = "45";)
         */
        String count = "45";
        System.out.println(Integer.parseInt(count));
        /**
         * 8) 2lik say sisteminde daxil edilmish ededi 10luga cevirin
         *
         * BinaryApp də proqramı yazmışam
         *
         * 9) Methoda 4 reqem daxil edilir eger bu reqemlerden her hansisa 2-si bir birine beraberdirse geriye true qaytarsin
         */
        while (true){
            String number = scanner.nextLine();
            char[] ch = number.toCharArray();
            if(ch.length == 4){
                for (int i = 0; i < ch.length; i++) {
                    for (int j = i + 1; j < ch.length; j++) {
                        if (ch[i] == ch[j]){
                            System.out.println(true);
                            break;
                        }else{
                            System.out.println(false);
                            break;
                        }
                    }
                }
                break;
            }else{
                System.out.println("Enter a 4-digit number!!!");
            }
        }
        /**
         * 10)  Methoda 4 reqem daxil edilir.
         * a,b,c,d eger ededler artan ardicilliqla daxil edilibse geriye true qaytarsin eks halda false
         */
        int number = scanner.nextInt();
        String numStr = Integer.toString(number);
        int length = numStr.length();

        if (length != 4) {
            System.out.println(false);
        }
        for (int i = 0; i < length - 1; i++) {
            int currentDigit = numStr.charAt(i) - '0';
            int nextDigit = numStr.charAt(i + 1) - '0';

            if (currentDigit >= nextDigit) {
                System.out.println(false);
            }else {
                System.out.println(true);
            }
        }
        /**
         * 11) Sade yoxsa murekeb ededi teyin eden proqram yazın .
         */
        System.out.print("Bir sayı girin: ");
        int number1 = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number1);

        if (isPrime) {
            System.out.println(number + " this number is prime.");
        } else {
            System.out.println(number + " this number do not prime.");
        }
        /**
         * 12)Rekursiyadan istifadə edərək factorial hesablayan proqram tərtib edin.
         */
        int factorialNum = scanner.nextInt();
        int factorial = factorial(factorialNum);
        System.out.println(factorialNum + "! = " + factorial);
    }
    public static boolean isPrimeNumber(int number1) {
        if (number1 <= 1) {
            return false;
        }
        if (number1 <= 3) {
            return true;
        }
        if (number1 % 2 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number1; i += 6) {
            if (number1 % i == 0 || number1 % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }

    public static int factorial(int factorialNum){
        if (factorialNum == 0 || factorialNum == 1){
            return 1;
        }else{
            return factorialNum * factorial(factorialNum - 1);
        }
    }
}



