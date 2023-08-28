import java.io.Serializable;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        double number1;
        double number2;
        Object result;
        Scanner input = new Scanner(System.in);
        System.out.println("[1]. Sum\n" + "[2]. Subtraction\n" + "[3]. Multiply\n" + "[4]. Divide\n" + "[5]. Factorial\n" + "[6]. A power of n\n" + "[0]. Exit program");

        while(true){

            System.out.println("Choose option: ");
            operator = input.next().charAt(0);
            switch (operator){
                case '1':
                case '2':
                case '3':
                case '4':

                    System.out.println("Enter the first number:");
                    number1 = input.nextDouble();

                    System.out.println("Enter the second number:");
                    number2 = input.nextDouble();
                    switch (operator){

                        case '1':

                            result = Calculator.sum(number1,number2);
                            System.out.println(number1 + " + " + number2 + " = " + result);
                            break;

                        case '2':

                            result = Calculator.subtraction(number1,number2);
                            System.out.println(number1 + " - " + number2 + " = " + result);
                            break;

                        case '3':

                            result = Calculator.multiply(number1,number2);
                            System.out.println(number1 + " * " + number2 + " = " + result);
                            break;

                        case '4':

                            result = Calculator.divide(number1,number2);
                            System.out.println(number1 + " / " + number2 + " = " + result);
                            break;
                    }
                    break;
                case '5':

                    System.out.println("Enter the factorial:");
                    number1 = input.nextDouble();

                    result = Calculator.factorial(number1);
                    System.out.println( number1 + "!" + " = " + result);
                    break;

                case '6':

                    System.out.println("Enter the number to be powered:");
                    number1 = input.nextDouble();

                    System.out.println("Enter the a power of number");
                    number2 = input.nextDouble();

                    result = Calculator.power(number1,number2);
                    System.out.println(number1 + "^" + number2 + " = " + result);
                    break;

                case '0':

                    System.out.println("Exited the program");
                    System.exit(0);


            }

        }

    }
}