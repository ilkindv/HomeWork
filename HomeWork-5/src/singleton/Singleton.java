package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Object created by Singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;}

}
