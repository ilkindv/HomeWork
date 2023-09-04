import service.UserServiceManagement;
import service.imple.UserServiceManagementImpl;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. LocaleDateTime nədir? Numune kodu yazın
         * Tarix və yerli saatı çap etmək üçün istifadə olunur
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        /**
         * 2.LocaleTime və LocalDate nədir?Numune kodu yazın.
         * LocalTime yerli saatı(saat,dəqiqə,saniyyə) görmək üçün istifadə olunur.
         * LocalDate yerli tarixi(il,ay,gün) görmək üçün istifadə olunur.
         */
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        /**
         * 3.İstifadəçidən bir tarix alın və həmin tarixi gün/ay/il olarağ çap edin.
         * Amma, ildə sadəcə son 2 rəqəm yazılsın. Nümunə: 10/01/23
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tarixi qeyd edin (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear() % 100;

        System.out.printf("%02d/%02d/%02d\n", day, month, year);
        /**
         * 4. of() - methodu nə üçün istifadə olunur? Numune kodu yazın
         * Bu metodla müəyyən bir vaxtı yaratmaq üçün istifadə edirk.
         */
        LocalDate customLocalDate = LocalDate.of(2023,07,14);
        LocalTime customLocalTime = LocalTime.of(05,24,55);
        System.out.println(customLocalDate + "\n" + customLocalTime);
        /**
         * 5.Bir tarixi ay gün il olarağ ayrı ayrılığda çap edin.
         * Nümumə: month - 01, Year - 2023, day - 10
         */
        LocalDate currentLocalDate = LocalDate.now();
        System.out.println("Month - " + currentLocalDate.getDayOfMonth() + "," +
                           "Year - " + currentLocalDate.getYear() + "," +
                           "Day - " + currentLocalDate.getMonthValue());
        /**
         * 6. İlin neçənci günündə olduğumuzu hansı methodla öyrənə bilərik? nümunə göstərin
         * getDayOfYear() metodunan istifadə edərək
         */
        LocalDate currentDay = LocalDate.now();
        System.out.println("İlin " + currentDay.getDayOfYear() + " günündəyik.");
        /**
         * 7. LocaleTime.now() çap edərkən, mikrosaniyələri necə silə bilərik? Nümunə göstərin.
         * formatter metodundan istifadə edərək silə bilərik
         */
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatedTime = currentTime.format(formatter);
        System.out.println(formatedTime);
        /**
         * 8.Duration ve Periodun ferqi nedir numuneler gosterin.
         * Duration zamanlar arasındakı fərqi ölçmək üçün istifadə olunur.
         * Period isə tarixlər arasındakı fərqi ölçmək üçün istifadə olunur.
         */
        LocalTime time1 = LocalTime.of(05,55);
        LocalTime time2 = LocalTime.of(10,55);
        LocalDate date1 = LocalDate.of(2023,07,14);
        LocalDate date2 = LocalDate.of(2023,10,22);
        Duration duration = Duration.between(time1,time2);
        Period period = Period.between(date1,date2);
        System.out.println(duration);
        System.out.println(period);
        /**
         * 9.Instant , Clock , Zone ferqler nelerdir numuler gosterin (her birisine aid kod numunesi yazaraq)
         * Instant anlıq bir zamanı göstərir.(Tarix və saat)
         * Clock cihazın sistem vaxtını və vaxt bölgüsünü göstərir.
         * Zone olduğun zonayı göstərir.
         */
        Instant instant = Instant.now();
        Clock clock = Clock.systemDefaultZone();
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(instant);
        System.out.println(clock);
        System.out.println(zoneId);
        /**
         * 10. Bir User klası yaradın içərsində username ,pasword  ,birthdate yer alsin ve bir login metodu yaradin
         * biz login eden zaman  sadece 18 yaşdan yuxarilar login ola bilsin bunun üçün yaşı hesablayan bir metod yazın ve loginde istifade edin ,
         * userin  ad gunudurse login zamanı “Ad günün mübarək” mesajı cap olunsun
         */
        UserServiceManagement userServiceManagement = new UserServiceManagementImpl();
        userServiceManagement.Management();
    }
}