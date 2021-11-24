//PACKAGE_NAME
//      Brad
//    2019-08-16
//  17:47

import java.util.*;

public class FahrenheitToKelvin {
    public static void main (String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Temperature in Fahrenheit");
        temperature = in.nextInt();

        double getKelvin;
        getKelvin = (temperature + 459.67)*(5.0/9.0);

        temperature = getKelvin;

        System.out.println("Your Temperature in Kelvin is...= " + temperature);

    }
}
