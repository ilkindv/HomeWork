public class Questions {
    /**
     * Enum nədir və necə işləyir?
     * Java-da enum məlumat növüdür və müəyyən dəyərlər dəstini təmsil etmək üçün istifadə olunur.
     * Enum əvvəlcədən təyin edilmiş sabitlərin toplusunu təmsil edir.
     * Bu sabitlər adətən müəyyən bir növün sonlu dəyərlərini təmsil edir.
     * Enum dəyişənləri enum tərəfində müəyyən edilmiş sabitlərdən birini qəbul edə bilər.
     * Bu sabitlər böyük hərflə yazılır.
     * Enumlar metodlar, konstruktorlar və digər xüsusiyyətlərlə də genişləndirilə bilər.
     * Beləliklə, hər bir sabit dəyər üçün fərdi davranış təmin edilir.
     *
     * Values() – method nə işə yarayır?
     * values() metodu enum tipli bütün sabit dəyərləri massiv kimi qaytaran metoddur.
     * Bu üsul bir enum tərəfindən müəyyən edilmiş sabit dəyərləri əldə etmək və ya onun üzərində dövr etmək üçün istifadə edilə bilər.
     * Məsələn:
     * Planet[] planets = Planet.values();
     * for (Planet planet:planets) {
     * System.out.println(planet);
     * }
     * Burada mənim yaratdlğım Planet enum nın daxilindəki sabitləri çapa verir.
     *
     * Ordinal() və name() – method nə işə yarayır?
     * ordinal() metodu enum sabitlərinin təyin olunduğu sıranı təmsil edən tam dəyər qaytarır.
     * Birinci sabit 0, ikinci sabit 1, üçüncü sabit 2 və s. şəkildə dəyər qaytarır.
     * Məsələn:
     * Planet planet = Planet.MARS;
     * System.out.println(planet.ordinal());
     * Mənim Planet enumımda Marsı 4 - cü sırada yazdığım üçün, sıfırdan başlayaraq sıraladığını nəzərə aldıqda,çıxışda mənə 3 dəyərini qaytaracaq.
     *
     * Name() metodu enum sabitinin adını qaytarır.
     * Məsələn:
     * Planet planet = Planet.MARS;
     * System.out.println(planet.name());
     *
     * Name method ilə enum-ın özünü çağırmağın nə kimi fərqi var?
     * name() metodu enum sabitinin adını qaytarır.
     * Enumun özü isə bütün enum sabitlərindən və ya digər funksiyalardan istifadə etmək üçün referans verir.
     *
     * Integer parseInt və valueOf arasında nə kimi fərqlər var?
     * Integer.parseInt() metodu rəqəmli sətri (String) tam ədədə çevirmək üçün istifadə olunur.
     * Bu üsul String kimi göstərilən ədədi götürür və onu müvafiq tam ədəd növünə (int) çevirir.
     * Məsələn:
     * String numString = "123";
     * int number = Integer.parseInt(numString) + 123;
     * System.out.println(number);
     * Çıxışda 246 ədədini verir
     *
     * Integer.valueOf() metodu rəqəmli sətri (String) Tam ədəd obyektinə çevirmək üçün istifadə olunur.
     * Bu üsul String kimi təqdim olunan ədədi götürür və onu Integer sinfinin nümunəsi kimi qaytarır.
     * Məsələn:
     * String numString = "123";
     * Integer number = Integer.valueOf(numString);
     * boolean test = number.equals(123);
     * System.out.println(test);
     * Çıxışda true qaytaracaq. Integer obyektinə çevrildiyi üçün equals metodundan istifadə edə bildik.
     *
     * Wrapper type la, primitive type arasında nə fərqlər var?
     * Primitiv tiplər əsas (təməl) məlumat növlərini təmsi edir.Məsələn int
     * Wrapper tiplər isə primitiv tipin obyekt yönümlü versiyasını təmsil edir. Məsələn Integer
     * Wrapper tiplər null dəyərini ala bilir, lakin primitiv tiplər ala bilmir.
     * Primitiv tiplər yaddaşdan istifadə və performans baxımından daha sərfəli ola bilər, Wrapper tiplər isə daha çox funksionallıq və bəzi hallarda zərurət yaradır.
     *
     * Unboxing və Autoboxing nədir?
     * primitiv tiplə Wrapper tipi bir - birləri arasında çevirmək üçün istifadə olunur:
     * Məsələn(Unboxing):
     * Integer wrapperNum = Integer.valueOf(16);
     * int primitivNUm = wrapperNum;
     * Göründüyü kimi Wrapper tipini primitiv tipə çevrildi.
     *
     * Məsələn(Autoboxing):
     * int primitivNum = 12;
     * Integer wrapperNum = primitivNum;
     * Burda isə primitiv tip Wrapper tipinə çevrildi
     *
     * Var nədir və nə üçündür?
     * Var dəyişənin tipini vermədən, daxilinə daxil etdiyimiz ilk dəyişənin tipini avtomatik olaraq təyin edir.
     * Məsələn:
     * var number = 22
     * var planet = Earth
     * Göründüyü kimi biz dəyişənin tipini vermədən, onu tipini avtomatik olaraq özü təyin edir.
     */



}
