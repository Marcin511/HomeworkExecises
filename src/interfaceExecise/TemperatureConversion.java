package interfaceExecise;
import java.util.Scanner;
public class TemperatureConversion implements Temperature{
    Scanner s = new Scanner(System.in);
    float cencius ;
    float kelvin;
    float farenheit;

    @Override
    public float cenciusToKelvin() {
        return cencius - 273f;
    }
    @Override
    public float cenciusToFarenheit() {
        return (farenheit-32)/(9/5);
    }
    @Override
    public float kelvinToCencius() {
        return kelvin + 273f;
    }
    @Override
    public float farenheitToCencius() {
        return 9/5*cencius +32;
    }

    @Override
    public void showTemperature() {
        System.out.println("cencius -> Kelvin: "+ cenciusToKelvin());
        System.out.println("cencius -> Farenheit: "+ cenciusToFarenheit());
        System.out.println("kelvin -> cencius: "+ kelvinToCencius());
        System.out.println("farenheit -> cencius: "+ farenheitToCencius());

    }
}
