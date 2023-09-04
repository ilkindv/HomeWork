package services;

import global.GlobalData;
import model.Book;
public class RemoveService {
    protected static void removeBook(){
        DisplayService.displayBook();
        int removedBook = SearchService.searchByIdRemove().getId();
        Book[] tempBook = GlobalData.books;
        GlobalData.books = new Book[tempBook.length - 1];
        if (tempBook != null){
            for (int i = 0; i < GlobalData.books.length; i++) {
                if (tempBook[i].getId() == removedBook){
                    tempBook[i] = null;
                }
                if (tempBook[i] != null){
                    GlobalData.books[i] = tempBook[i];
                }
                else{
                    System.out.println("Book removed");
                }
            }
        }
        else{
            System.out.println("Book not found");
        }

    }
}
