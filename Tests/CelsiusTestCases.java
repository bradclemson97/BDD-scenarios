//PACKAGE_NAME
//      Brad
//    2019-08-16
//  17:47

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CelsiusTestCases {

    @Test
    public void validateConstructorForZeroDegrees() {

        //-----Test Cases for entering a value of 0 degrees -------

        // Given I have a CelsiusToFahrenheit class
        // when I enter a Celsius temperature with value 0 degrees

        Celsius celsius = new Celsius(0);
        // then I expect getCelsius to return 0
        assertEquals(0, Celsius.getCelsius(), 0.0);
        // and I expect getFahrenheit to return 32
        assertEquals(32, Celsius.getFahrenheit(), 0.0);

        /**
         *  lower case C WE WANT THE OBEJECT NOT THE CLASS
         */

        // Given I have a FahrenheitToKelvin class
        // when I enter a Fahrenheit temperature value with 0 degrees

        Fahrenheit fahrenheit = new Fahrenheit(0);
        // then I expect getFahrenheit to return 0
        assertEquals(0, Fahrenheit.getFahrenheit(),0.0);
        // and I expect getKelvin to return 255.37222222222223
        assertEquals(255.37222222222223, Fahrenheit.getKelvin(), 0.0);

        // Given I have a KelvinToCelsius class
        // when I enter a Kelvin temperature value with 0 degrees

        Kelvin kelvin = new Kelvin(0);
        // then I expect getKalvin to return 0
        assertEquals(0, Kelvin.getKelvin(),0.0);
        // and I expect getCelsius to return -273.0
        assertEquals(-273.0, Kelvin.getCelsius(), 0.0);

        //-----Test Cases for entering a value of 100 degrees -------

        // Given I have a CelsiusToFahrenheit class
        // when I enter a Celsius temperature with value 100 degrees

        Celsius celsius1 = new Celsius(100);
        // then I expect getCelsius to return 100
        assertEquals(100, Celsius.getCelsius(), 0.0);
        // and I expect getFahrenheit to return 212
        assertEquals(212, Celsius.getFahrenheit(), 0.0);

        // Given I have a FahrenheitToKelvin class
        // when I enter a Fahrenheit temperature value with 100 degrees

        Fahrenheit fahrenheit1 = new Fahrenheit(100);
        // then I expect getFahrenheit to return 100
        assertEquals(100, Fahrenheit.getFahrenheit(),0.0);
        // and I expect getKelvin to return 310.927778
        assertEquals(310.927778, Fahrenheit.getKelvin(), 0.0);

        // Given I have a KelvinToCelsius class
        // when I enter a Kelvin temperature value with 100 degrees

        Kelvin kelvin1 = new Kelvin(0);
        // then I expect getKalvin to return 100
        assertEquals(100, Kelvin.getKelvin(),0.0);
        // and I expect getCelsius to return -173.15
        assertEquals(-173.15, Kelvin.getCelsius(), 0.0);



    }
}

