package lessons.lesson_43.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {


    @Test
    void testCelsiusToFahrenheitZero() {
        double tempCelsius = 0;
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(tempCelsius));
    }

    @Test
    void testCelsiusToFahrenheit100() {
        double tempCelsius = 100;
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(tempCelsius));
    }
}