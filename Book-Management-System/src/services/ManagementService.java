package services;

import util.MenuUtil;
public class ManagementService {
    public static void ManageBook(){
        while (true){
            int option = MenuUtil.entryMenu();
            switch (option){
                case 0 ->{
                    System.out.println("Bye");
                    System.exit(-1);
                }
                case 1 ->
                        DisplayService.displayBook();
                case 2 ->
                        SearchService.searchByNameOrAuthor();
                case 3 ->
                        AddService.addBook();
                case 4 ->
                        UpdateService.update();
                case 5 ->
                        RemoveService.removeBook();
                default ->
                        System.out.println("Invalid option!");


            }


        }
    }
}
