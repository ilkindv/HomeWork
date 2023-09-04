public class Fruit {
    private String fruit;

    public Fruit(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruit='" + fruit + '\'' +
                '}';
    }
    /*
    Override etmədikdə bizə almaının referansını qaytarır,ancaq override etdikdən sonra özəlləşdirə bilirik.
     */
}
