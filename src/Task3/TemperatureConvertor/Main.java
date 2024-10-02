
public class Main {
    public static void main(String[] args) {

    TemperatureConvertor temperature = new TemperatureConvertor();
    System.out.println("30 de grade Celsius in Fahrenheit este :"+temperature.toFahrenheit(30));
    System.out.println("30 de grade Fahrenheit in Celsius este :"+temperature.toCelsius(30));
    }
}