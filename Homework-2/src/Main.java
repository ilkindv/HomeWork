
public class Main {
    public static void main(String[] args) {
        Fruit alma = new Fruit("alma");
        System.out.println(alma);

        User user = new User("Ilkin","Abdullayev");
        System.out.println(user.toString());

        User user1 = new User("Ilkin","Abdullayev");
        System.out.println(user.equals(user1));
        /*
        user i override etdiyimiz üçün user in ünvanı fərqlidi. Buna görədə çıxışda bizə false qaytarır.
         */
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
        System.out.println(user.hashCode() == user1.hashCode());
        /*
        Override etmədiyimizdə referansların hashcode unu verir.Bu hashcode larda fərqli olur.
        Ancaq override etdikdən sonra daxilindəki dəyərin hashcode unu verir.Buna görə də eyni hashcode verir.
        Əgər daxilindəki dəyərləri dəyişsək bu zaman yenə fərqli hashcode veriləcək.
         */
        Employee employee = new Employee("Eli");
        Employee employee1 = new Employee("Eli");
        System.out.println(employee.equals(employee1));


    }
}