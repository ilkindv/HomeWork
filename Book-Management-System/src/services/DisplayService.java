package services;

import global.GlobalData;

public class DisplayService {
    protected static void displayBook(){
        if (GlobalData.books != null){
            for (int i = 0; i < GlobalData.books.length; i++) {
                System.out.println(GlobalData.books[i].idInfo());
            }
            }else{
                System.out.println("""
                        -----------------------
                        There are no books yet!
                        -----------------------
                        """);
        }
    }
}
