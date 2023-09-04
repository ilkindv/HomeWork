public enum Planet {
    MERCURY("59 Earth days", "57.910.000 km", "2.440 km" ),
    VENUS("243 Earth days", "108.200.000 km", "6.052 km"),
    EARTH("23.9 hours", "149.600.000 km", "6.371 km"),
    MARS("24.6 Earth days", "227.940.000 km", "3.400 km"),
    JUPITER("9.93 Earth hours", "778.330.000 km", "71.492 km"),
    SATURN("10.7 Earth hours", "1.424.600.000 km", "60.268 km"),
    URANUS("17 Earth hours", "2.873.550.000 km", "25.559 km"),
    NEPTUNE("16 Earth hours", "4.501.000.000 km", "24.764 km");
    private final String lengthOfDays;
    private final String distanceFromSun;
    private final String radius;
    Planet(String lengthOfDays, String distanceFromSun, String radius){
        this.lengthOfDays = lengthOfDays;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
    }


    public String getLengthOfDays() {
        return lengthOfDays;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }

    public String getRadius() {
        return radius;
    }
}
