
public  class Calculator {
    public static double sum(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static Object  divide(double x, double y) {
        if (x ==0 && y==0){
            return "Infinity";
        }else{
            return x / y;
        }
        
    }

    public static int factorial(Double x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static Object power(Double x, Double y) {
        if (x == 0 & y == 0) {
            return "Error";
        } else if (y == 1.0) {
            return x;
        } else if (y == 0) {
            return 1;
        } else if (y == 2.0) {
            return x * x;
        } else {
            double pow = 0;
            pow = x * x;
            for (int i = 0; i < y - 2; i++) {
                pow *= x;
            }
            return pow;
        }
    }

}



