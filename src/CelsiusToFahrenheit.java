//PACKAGE_NAME
//      Brad
//    2019-08-16
//  17:47

import java.util.*;

public class CelsiusToFahrenheit {
    public static void main (String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Temperature in Celsius");
        temperature = in.nextInt();

        double getFahrenheit;
        getFahrenheit = (9.0/5.0 *temperature + 32);

        temperature = getFahrenheit;

        System.out.println("Your Temperature in Fahrenheit is...= " + temperature);

    }
}







