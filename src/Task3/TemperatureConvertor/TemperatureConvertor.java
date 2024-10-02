public class TemperatureConvertor {


    public float toCelsius (float temperature)
    {
        return (5*(temperature-32))/9;
    }

    public float toFahrenheit (float temperature)
    {
        return (9*temperature+(32*5))/5 ;
    }

}
