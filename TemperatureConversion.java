import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int celsius = sc.nextInt();
        celsiusToFahrenheit(celsius);
        System.out.print("Enter the temperature in Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        fahrenheitToCelsius(fahrenheit);
        sc.close();
    }
    public static void celsiusToFahrenheit(int celsius){
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The Conversion of temperature from Celsius to Fahrenheit : " + fahrenheit);
    }
    public static void fahrenheitToCelsius(int fahrenheit){
        int celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The Conversion of temperature from Fahrenheit to Celsius : " + celsius);
    }
}
