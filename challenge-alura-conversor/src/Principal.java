import com.google.gson.Gson;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        float conversionTotal, dato;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("Bienvenido");
            System.out.println("1. USD a ARS");
            System.out.println("2. ARS a USD");
            System.out.println("3. USD a BRL");
            System.out.println("4. BRL a USD");
            System.out.println("5. USD a COP");
            System.out.println("6. COP a USD");
            System.out.println("7. Salir");
            System.out.println("---------------------------------------------------");
            opcion = teclado.nextInt();

            ConsultaMoneda consultaMoneda = new ConsultaMoneda();
            Monedas moneda = consultaMoneda.ConsultaMoneda();
            Monedas newMoneda = new Gson().fromJson(moneda.conversion_rates().toString(), Monedas.class);


            switch (opcion) {
                case 1:
                    System.out.println("Dame la cantidad de dolares que quieras convertir a Peso Argentino");
                    dato = teclado.nextFloat();
                    conversionTotal = dato * newMoneda.ARS();

                    System.out.println("Son $" + conversionTotal + " pesos argentinos por $" + dato + (dato == 1?" dolar": " dolares"));

                    break;
                case 2:
                    System.out.println("Dame la cantidad de pesos argentinos que quieras convertir a dolares");
                    dato = teclado.nextFloat();

                    conversionTotal = dato / newMoneda.ARS();

                    System.out.println("Son $" + conversionTotal + (conversionTotal == 1?" dolar": " dolares") + " por $" + dato + (dato == 1?" peso argentino": " pesos argentinos"));

                    break;
                case 3:
                    System.out.println("Dame la cantidad de dolares que quieras convertir a moneda brasilena");
                    dato = teclado.nextFloat();
                    conversionTotal = dato * newMoneda.BRL();

                    System.out.println("Son $" + conversionTotal + " pesos brasilenos por $" + dato + (dato == 1?" dolar": " dolares"));

                    break;
                case 4:
                    System.out.println("Dame la cantidad de moneda brasilena que quieras convertir a dolares");
                    dato = teclado.nextFloat();

                    conversionTotal = dato / newMoneda.BRL();

                    System.out.println("Son $" + conversionTotal + (conversionTotal == 1?" dolar": " dolares") + " por $" + dato + (dato == 1?" peso brasilena": " pesos brasilenos"));

                    break;
                case 5:
                    System.out.println("Dame la cantidad de dolares que quieras convertir a pesos colombianos");
                    dato = teclado.nextFloat();
                    conversionTotal = dato * newMoneda.COP();

                    System.out.println("Son $" + conversionTotal + " pesos colombianos por $" + dato + (dato == 1?" dolar": " dolares"));

                    break;
                case 6:
                    System.out.println("Dame la cantidad de pesos colombianos que quieras convertir a dolares");
                    dato = teclado.nextFloat();

                    conversionTotal = dato / newMoneda.COP();

                    System.out.println("Son $" + conversionTotal + (conversionTotal == 1?" dolar": " dolares") + " por $" + dato + (dato == 1?" peso colombiano": " pesos colombianos"));

                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
            }
        } while (opcion != 7);
    }
}
