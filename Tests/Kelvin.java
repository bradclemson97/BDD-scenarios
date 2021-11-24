//PACKAGE_NAME
  //      Brad
    //    2019-08-16
      //  17:47

public class Kelvin {
    private static double temperature;

    public Kelvin (double temperature) {
        this.temperature = temperature;
    }

    public static double getKelvin() {
        return temperature;
    }

    public static double getCelsius() {
        return temperature - 273;
    }

}