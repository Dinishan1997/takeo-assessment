package temperature;

public class main {

	public static double celsius_to_Fahrenheit(double celsius) {
        return (9.0 / 5.0) * (celsius + 32);
    }
	public static double fahrenheit_to_celsius(double fahrenheit) {
        return (5.0 / 9.0 )* (fahrenheit - 32);
	}
    public static void main(String[] args) {
        
        double temperatureInCelsius = 60.0;
        double temperatureInFahrenheit = celsius_to_Fahrenheit(temperatureInCelsius);
        System.out.println("Temperature in Fahrenheit: " + temperatureInFahrenheit);

       
        double temperatureInCelsius2 = fahrenheit_to_celsius(temperatureInFahrenheit);
        System.out.println("Temperature in Celsius: " + temperatureInCelsius);
    }
}
