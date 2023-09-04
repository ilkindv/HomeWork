package service.imple;

import globaldata.GlobalData;
import helper.UserServiceHelper;
import model.User;
import service.UserService;
import util.InputUtil;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {
    @Override
    public boolean login() {
        LocalDate loginDate = LocalDate.now();
        String username = InputUtil.Inputstring("Enter username: ");
        String password = InputUtil.Inputstring("Enter password: ");

        for (User user : GlobalData.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                int age = loginDate.getYear() - user.getBirthDate().getYear();

                if (loginDate.getDayOfYear() == user.getBirthDate().getDayOfYear()) {
                    System.out.println("Happy Birthday " + user.getUsername() + "!!!");
                    System.out.println(user.toString());
                    return true;
                } else if (age >= 18) {
                    System.out.println("Login Successfully");
                    System.out.println(user.toString());
                    return true;
                } else {
                    System.out.println("You are not 18 years old");
                    return false;
                }
            }
        }

        System.out.println("User not found");
        return false;
    }

    @Override
    public boolean register() {
        if (GlobalData.users == null){
            GlobalData.users = new User[1];
            for (byte i = 0; i < GlobalData.users.length; i++) {
                UserServiceHelper.registerHelper(i);
            }
        }else {
            User[] tempUsers = GlobalData.users;
            GlobalData.users = new User[tempUsers.length + 1];
            for (byte i = 0; i < GlobalData.users.length; i++) {
                if (i < tempUsers.length) {
                    GlobalData.users[i] = tempUsers[i];
                }else {
                    UserServiceHelper.registerHelper(i);
                }
            }
        }
        return true;
    }
}
