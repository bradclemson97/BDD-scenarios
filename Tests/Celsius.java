//PACKAGE_NAME
//      Brad
//    2019-08-16
//  17:47

public class Celsius {
    private static double temperature;

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    public static double getCelsius() {
        return temperature;
    }

    public static double getFahrenheit() {
        return 9.0/5.0 *temperature + 32;
    }


    // doesn't need to be static by putting static we will only have one celcius value

}
