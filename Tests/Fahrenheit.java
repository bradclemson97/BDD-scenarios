//PACKAGE_NAME
  //      Brad
    //    2019-08-16
      //  17:37

public class Fahrenheit {
    private static double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public static double getFahrenheit() {
        return temperature;
    }

    public static double getKelvin() {
        return (temperature + 459.67)*(5.0/9.0);
    }
}
