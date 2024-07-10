import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            int opcion = 0;

            Scanner teclado = new Scanner(System.in);



            while (opcion != 7){
                System.out.println("Bienvenido a tu convertidor de confianza, por favor elige una opcion ");

                System.out.println("Selecciona la opcion que deseas");
                System.out.println("1. Dolar - Peso argentino");
                System.out.println("2. Peso argentino - Dolar");
                System.out.println("3. Dolar - Real Brasileno");
                System.out.println("4. Real brasileno - Dolar");
                System.out.println("5. Dolar - Peso colombiano");
                System.out.println("6. Peso colombiano - Dolar");
                System.out.println("7. SALIR");
                opcion = teclado.nextInt();

                System.out.println("Seleccione una opcion del menu");

                switch (opcion){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("Gracias por usar el convertidor de confianza, vuelva pronto");
                        break;

                }
            }
    }
}