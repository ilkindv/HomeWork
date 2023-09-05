public class Main {
    public static void main(String[] args) {
        /**
         * 1) run() ve start() methodlarını ferqi
         * run() metodunu ,çağıranda yeni bir thread yaratmır mövcud thread üzərindən işləyir.
         * Start() metodunu çağıranda yeni bir thread yaradır və bu thread içərisindən run() metodunu çağırır.
         * 2) Runnable ve Thread in ferqi nedir , Runableden implement ederek bir thread qur
         * Runable bir interface dir.Bir sinifi thread olaraq işlədə bilir.
         * Thread sinifi isə Javada birbaşa thread yaratmaq üçün istifadə olunurş
         */
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        /**
         * 3)volatile nedir ne iş görür  numune kod
         * Bir dəyəşənin dəyərini əsas yaddaşda saxlanmasını qaranti edir
         */
        MyVolatile myVolatile = new MyVolatile();
        Thread writeThread = new Thread(() -> {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myVolatile.open();
            System.out.println("Door set to true by writer thread");
        });

        Thread readerThread = new Thread(() -> {
            while (!myVolatile.isOpen()) {
            }
            System.out.println("Door is true, reader thread can continue.");
        });

        writeThread.start();
        readerThread.start();
        /**
         * 4)synchronized ne iş görür numune kod
         * Bir çox thread dən istifadə edilən zaman onalrın düzgün şəkildə işləməsini təmin edir
         */

    }
}