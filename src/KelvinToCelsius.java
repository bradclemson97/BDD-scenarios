//PACKAGE_NAME
//      Brad
//    2019-08-16
//  17:47

import java.util.*;

public class KelvinToCelsius {
    public static void main (String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Temperature in Kelvin");
        temperature = in.nextInt();

        double getKelvin;
        getKelvin = temperature -273;

        temperature = getKelvin;

        System.out.println("Your Temperature in Celsius is... = " + temperature);

    }
}