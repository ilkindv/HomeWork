package services;

import global.GlobalData;
import model.Book;
import util.InputUtil;

public class SearchService {
    protected static void searchByNameOrAuthor(){
        String keyWord = InputUtil.inputRequiredString("Please input keyword: ");
        boolean isFind = false;
        for (int i = 0; i < GlobalData.books.length; i++) {
            if(
                    GlobalData.books[i].getName().contains(keyWord) ||
                    GlobalData.books[i].getAuthor().contains(keyWord)){
                isFind = true;
                System.out.println(GlobalData.books[i].idInfo());
            }
        }if (!isFind){
            System.out.println("""
                        ----------------
                        Book not found!
                        ----------------
                        """);
        }
    }
    protected static Book searchByIdUpdate(){
        Book book = null;
        if (GlobalData.books != null){
            int id = InputUtil.inputRequiredInt("Which book do you want update?: ");
            for (int i = 0; i < GlobalData.books.length; i++) {
                if (GlobalData.books[i].getId() == id ) {
                    book = GlobalData.books[i];
                }
            }
        }
        return book;
    }
    protected static Book searchByIdRemove(){
        Book book = null;
        if (GlobalData.books != null){
            int id = InputUtil.inputRequiredInt("Which book do you want remove?: ");
            for (int i = 0; i < GlobalData.books.length; i++) {
                if (GlobalData.books[i].getId() == id ) {
                    book = GlobalData.books[i];
                }
            }
        }
        return book;
    }
}
