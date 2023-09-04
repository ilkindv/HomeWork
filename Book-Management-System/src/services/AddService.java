package services;

import global.GlobalData;
import model.Book;
import util.InputUtil;

public class AddService {
    protected static void addBook(){
        int addCount = InputUtil.inputRequiredInt("How many books do you want to add?: ");
        if (GlobalData.books == null){
            GlobalData.books = new Book[addCount];
            for (int i = 0; i < GlobalData.books.length ; i++) {
                GlobalData.books[i] = InputUtil.fillbook(i);
            }
        }else{
            Book[] tempBook = GlobalData.books;
            GlobalData.books = new Book[GlobalData.books.length + addCount];
            for (int i = 0; i < GlobalData.books.length; i++) {
                if (i < tempBook.length){
                    GlobalData.books[i] = tempBook[i];
                }else{
                    GlobalData.books[i] = InputUtil.fillbook(i);
                }
            }
        }
    }
}
