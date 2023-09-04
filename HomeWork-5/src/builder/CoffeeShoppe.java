package builder;

public class CoffeeShoppe {
    private String coffee;
    private int size;
    private String syrup;
    private boolean sugar;
    private boolean milk;

    private CoffeeShoppe(CoffeeShoppeBuilder coffeeShoppeBuilder){
        this.coffee = coffeeShoppeBuilder.coffee;
        this.size = coffeeShoppeBuilder.size;
        this.syrup = coffeeShoppeBuilder.syrup;
        this.sugar = coffeeShoppeBuilder.sugar;
        this.milk = coffeeShoppeBuilder.milk;
    }

    public CoffeeShoppe() {
    }

    public static class CoffeeShoppeBuilder{
        private String coffee;
        private int size;
        private String syrup;
        private boolean sugar;
        private boolean milk;
        public  CoffeeShoppeBuilder(String coffee){
            this.coffee = coffee;
        }
        public CoffeeShoppeBuilder size(int size){
            this.size = size;
            return this;
        }
        public CoffeeShoppeBuilder syrup(String syrup){
            this.syrup = syrup;
            return this;
        }
        public CoffeeShoppeBuilder sugar(boolean sugar){
            this.sugar = sugar;
            return this;
        }
        public CoffeeShoppeBuilder milk(boolean milk){
            this.milk = milk;
            return this;
        }

        public CoffeeShoppe build(){
            return new CoffeeShoppe(this);
        }

    }

}
