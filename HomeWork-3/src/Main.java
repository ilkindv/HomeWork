import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Try-catch exception nədir və nə üçün lazımdır? Kod Nümumə göstərin
         * Try-catch exception xətaları tutmaq üçün istifadə olunut.
         * Hər bir proqramı işlədərkən xətalarla rastlaşa bilirik.
         * Yarana biləcək xətaları əvvəlcədən qarşısını almaq üçün Try-catch dən instifadə edirik.
         */
        try {
            int[] arr = new int[10];
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        /**
         * 2. Multiple catch nədir? kod Nümunə göstərin.
         * Multiple catch birdən çox fərqli xətaları tutmaq üçün istifadə olunur.
         */
        try {
            int[] arr = new int[10];
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        } catch (RuntimeException e){
            System.out.println("Runtime Exception");
        } catch (Exception e){
            System.out.println("Exception");
        }
        /**
         *  3.Finally nədir və nə zaman işə düşür? Kod  Nümunə göstərin.
         *  Finally əlaqələrin qırılmaması üçün istifadə olunur.
         *  Finally hər bir halda işləyir.
         */
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }finally {
            System.out.println("Finally");
        }
        /**
         * 4. Neçə cür xəta var?
         * Java da iki cwr xəta var : Checked və Unchecked exception
         * 5. Exception iyerarxiyasını izah edin.
         * Throwable sinifinin alt sinifi olan java.lang.Exception sinifindən gəlir.
         * 6. Checked exceptionlar nədir?
         * Misal olaraq IOException göstərmək olar.
         * 7. Unchecked exceptionlar nədir?
         * Misal olaraq ArithmeticException , NullPointerException və s. göstərmək olar.
         * 8. Hansı exceptionları tanıyırsız, 3ünü nümunə göstərin. Və proqram olaraq yazın.
         * IOException, ArithmeticException , NullPointerException və s.
         */
        try {
            System.out.println(10/0);
            throw new IOException("IOException");
        }catch (IOException e){
          System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }catch (Exception e){
            System.out.println("Exception");
        }
        /**
         * 9. PrintStackTrace(), getMesaage və toString() , getClouse nədir?
         * PrintStackTrace() - Debugging üçün istifadə olunur.
         * getMessage - Xəta mesajını çap edir.
         * toString() - bir obyekti sətir formasında göstərir.
         * getClouse - exception ın nə üçün yarandığını göstərir.
         * 10. Exception və error arasındakı fərq nədir?
         * Exception - Proqram işləyərkən yaranan xətalardı və bu xətaları kodlarda düzəliş edərək əvvəlcədən aradan qaldırmaq mümkündür.
         * Error - Proqram işləyərkən düzəltilməsi çətin xətalardı və çox zaman sistem üzrə olan xətalardır
         */
    }
}