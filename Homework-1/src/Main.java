
public class Main {
    public static void main(String[] args) {

        for (Planet i:Planet.values()) {
            System.out.println(
                    "-----------------------------------\n" +
                    (i.ordinal() + 1) + ". " + i + "\n" +
                    "Length of day: " + i.getLengthOfDays() + "\n" +
                    "Distance from sun: " + i.getDistanceFromSun() + "\n" +
                    "Radius: " + i.getRadius() + "\n" +
                    "-----------------------------------");

        }
    }
}