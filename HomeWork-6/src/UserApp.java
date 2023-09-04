import java.util.Scanner;

public class UserApp {
    private static final String username = "Admin";
    private static final String password = "12345";
    private static int wrongPasswordCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter the password: ");
            String enteredPassword = scanner.nextLine();
            if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
                System.out.println("Xoş gəldiniz, '" + enteredUsername + "'!");
                break;
            }
            else {
                System.out.println("Username yanlışdır və ya şifrə yanlışdır.");
                wrongPasswordCount++;
                if (wrongPasswordCount >= 3){
                    System.out.println("Şifrəni 3-cü dəfədən artıq yanlış yığdınız. Çıxış edilir.");
                    break;
                }
            }
        }

    }
}
