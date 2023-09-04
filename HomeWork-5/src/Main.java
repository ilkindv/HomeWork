import builder.CoffeeShoppe;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        /**
         * 1) Solid principles nedir her herfinin acıqlamasın qeyd edin
         * Single Responsibility Principle - Bir sinifin sadəcə bir vəzifəsi olmalıdır.
         * Open/Closed Principle - Dəyiştirilməyə qapalı, modifikasiyaya açıq olmalıdır.
         * Liskov Substitution Principle - alt siniflər, üst siniflərin yerinə işlədilə bilməlidir.
         * Interface Segregation Principle - Bir sinidin ehtiyacı olmayan Interface işlədilməməlidir.
         * Dependency Inversion Principle - Yüksək səviyyəli modullar aşağı səviyyəli modullardan asılı olmamlıdır.
         * 2) Dizayn pattern nedir ne üçün istifadə  edirik
         * Dizayn pattern kodu daha oxunaqlı, təkrar istifadə edilə bilən və saxlanmasını asanlaşdırmağa kömək edir.
         * 3) Singleton dizayn paternden istifade ederk bir clas yaradin ve istidade edin
         */
        for (int i = 0; i < 10; i++) {
            Singleton.getInstance();
        }
        /**
         * 4) Builder den istifadə edərək CoffeeShop yaradın
         */
        CoffeeShoppe coffee = new CoffeeShoppe.CoffeeShoppeBuilder("Espresso")
                .size(12)
                .syrup("Vanilla")
                .sugar(false)
                .milk(true)
                .build();
        /**
         * 5) factoriyden istifadə edərək Notification yazın
         * factory package in içində yazmışam
         * 6) abstract factoryden istifadə edərək file explorer yazın
         * file package in içində yazmışam
         */


    }

}