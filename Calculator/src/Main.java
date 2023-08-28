import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        char operator;
        Double number1,number2,result;

        Scanner c0 = new Scanner(System.in);
        System.out.println(" + -----> Toplama əməliyyatı\n" + " - -----> Çıxma əməliyyatı\n " + "* -----> Vurma əməliyyatı\n" + "/ -----> Bölmə əməliyyatı\n" + "! -----> kök alma\n" + "^ -----> qüvvətə yüksəltmə");
        System.out.println("Əməliyyatı seçin: + , - , * , / , ! və ya ^ ");
        operator = c0.next().charAt(0);

        switch (operator){
            case '+':
            case '-':
            case '*':
            case '/':
                System.out.println("1-ci rəqəmi daxil edin:");
                number1 = c0.nextDouble();

                System.out.println("2-ci rəqəmi daxil edin:");
                number2 = c0.nextDouble();

                switch (operator){
                    case '+':
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;

                    case '-':
                        if (number1 > number2){
                            result = number1 - number2;
                            System.out.println(number1 + " - " + number2 + " = " + result);
                        }else {
                            result = number1 - number2;
                            System.out.print("Cavab mənfidir!\n" + number1 + " - " + number2 + " = " + result);
                        }
                        break;

                    case '*':
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;

                    case '/':
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;

                }
                break;

            case '!':
                System.out.println("Rəqəmi daxil edin:");
                number1 = c0.nextDouble();

                result = Math.sqrt(number1);
                System.out.println("√¯" + number1 + " = " + result);
                break;
            case '^':
                System.out.println("Rəqəmi daxil edin:");
                number1 = c0.nextDouble();

                System.out.println("Qüvvəti daxil edin:");
                number2 = c0.nextDouble();

                if (number1 == 0 & number2 ==0){
                    System.out.println("Xəta");
                    break;
                }

                else if (number2 == 1.0){
                    result = number1;
                    System.out.println(number1 + "^" + number2 + " = " + result);
                    break;
                }

                else if (number2 == 0){
                    result = 1.0;
                    System.out.println(number1 + "^" + number2 + " = " + result);
                    break;
                }

                else if  (number2 == 2.0){
                    result = number1 * number1;
                    System.out.println(number1 + "^" + number2 + " = " + result);
                    break;
                }

                else {
                int i = 0;
                result = number1 * number1;
                do{
                    result = number1 * result;
                    i++;
                }
                while (i <number2 - 2);
                System.out.println(number1 + "^" + number2 + " = " + result);
                break;
                }

            default:
                System.out.println("Xəta");
                break;

        }
        }
    }

