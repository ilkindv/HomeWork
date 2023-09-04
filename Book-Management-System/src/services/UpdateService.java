package services;

import model.Book;
import util.InputUtil;
import util.MenuUtil;

public class UpdateService {
    protected static void update(){
        DisplayService.displayBook();
        Book book = SearchService.searchByIdUpdate();
        int options = MenuUtil.editMenu();
        switch (options){
            case 1 -> {
                String name =InputUtil.inputRequiredString("Edit the book name: ");
                book.setName(name);
            }
            case 2 -> {
                String description =InputUtil.inputRequiredString("Edit the description: ");
                book.setDescription(description);
            }
            case 3 -> {
                String author =InputUtil.inputRequiredString("Edit the author: ");
                book.setAuthor(author);
            }
            default ->
                    System.out.println("Invalid option!");
        }
    }
}
