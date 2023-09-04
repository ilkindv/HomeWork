package helper;

import globaldata.GlobalData;
import model.User;
import util.InputUtil;

import java.time.LocalDate;

public class UserServiceHelper {
    public static User fillUser(){
        System.out.println("-----------------------");
        String username = InputUtil.Inputstring("Enter your username: ");
        String password = InputUtil.Inputstring("Enter your password: ");
        LocalDate birthday = birthdateHelper();
        return new User(username, password, birthday);
    }
    public static LocalDate birthdateHelper(){
        String inputBirthdate = InputUtil.Inputstring("Enter your birth date(YYYY-MM-DD): ");
        LocalDate parsedBirthdate = LocalDate.parse(inputBirthdate);
        int day = parsedBirthdate.getDayOfMonth();
        int month = parsedBirthdate.getMonthValue();
        int year = parsedBirthdate.getYear();
        return LocalDate.of(year, month, day);
    }
    public static void registerHelper(byte i){
        GlobalData.users[i] = fillUser();
    }
}
