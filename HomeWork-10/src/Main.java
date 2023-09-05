public class Main {
    public static void main(String[] args) {
        /**
         * 1.	Generics nədir, nə üçün istifadə olunur?
         * Generics, Java və digər bazı proqramlaşdırma dillərində məlumatın tipini daha geniş və
         * təhlükəsiz şəkildə təyin etmək üçün istifadə olunan bir xüsusiyyətdir.
         * Generics, kodun daha yüksək təkrarlanabilirlik, oxunaqlıq və təhlükəsizlik əldə etməsinə kömək edir.
         *
         * 2.	Genericsi class səviyəsində təyin edərək nümunə göstərin.
         * MyGeneric class ında təyin etdim
         *
         * 3.	Genericsi method səviyəsində təyin edərək nümunə göstərin.
         * MyGenericMethod class ında tıyin etdim
         *
         * 4.	Wildcard nədir? <? extends Number> və <? super Number> fərqləri nədir?
         * Wildcard - Javada bilinməyən bir tipi ifadə edir.
         * <? extends Number> - Number və onun alt tipi olan hər hansı bir tipi qəbul edir
         * <? super Number> - Number və onun üst tipi olan hər hansı bir tipi qəbul edir
         *
         * 5.	Bir generics class düzəldin. İki tip qəbul etsin, Key Value.
         *      Daha sonra həmin həmin key və value fieldlərinə istənilən tipdə dəyər göndərib onları çap edə bilək.
         */
        MyGeneric<String, Integer> myGeneric = new MyGeneric<>("Hello",12);
        System.out.println(myGeneric);

    }
}