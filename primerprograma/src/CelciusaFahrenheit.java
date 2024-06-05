import java.util.Scanner;

public class CelciusaFahrenheit {
    public static void main(String[] args) {
        float gradosCelcius = 0;
        float conversionFahrenheit = 0;

        System.out.println("Ingresa los grados Celsius");

        Scanner reader = new Scanner(System.in);
        gradosCelcius = reader.nextFloat();

        conversionFahrenheit = (float) ((gradosCelcius * 1.8) + 32);

        System.out.println("Los grados Celsius: " + gradosCelcius + " se convirtieron en " + conversionFahrenheit + " grados fahrengeit");
    }
}