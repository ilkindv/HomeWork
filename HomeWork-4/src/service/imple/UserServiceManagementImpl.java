package service.imple;

import service.UserService;
import service.UserServiceManagement;
import util.InputUtil;
import util.MenuUtil;


public class UserServiceManagementImpl implements UserServiceManagement {
    @Override
    public void Management() {

        while (true) {
            byte option = MenuUtil.entryMenu();
            UserService userService = new UserServiceImpl();
            switch (option) {
                case 0:
                    System.exit(-1);
                    break;
                case 1:
                    userService.login();
                    break;
                case 2:
                    userService.register();
                    break;
                default:
                    System.out.println("Invalid option!!!");
                    break;
            }
        }
    }
}
