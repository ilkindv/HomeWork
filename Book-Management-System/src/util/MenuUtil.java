package util;

public class MenuUtil {
    public static int entryMenu(){
        System.out.print(
                """
                        ---------------------------------
                        [1]. Display books
                        [2]. Search book
                        [3]. Add book
                        [4]. Update book
                        [5]. Remove book
                        [0]. Exit program
                        ---------------------------------
                        """
        );
        return InputUtil.inputRequiredInt("Choose option: ");
    }
    public static int editMenu(){
        System.out.print(
                """
                        ---------------------------------
                        [1]. Name
                        [2]. Description
                        [3]. Author
                        ----------------------------------
                        """
        );
        return InputUtil.inputRequiredInt("Choose option: ");
    }


}
