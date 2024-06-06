import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {
        int numeroAleatorio = 0, numeroDeUsuario = 0, contador = 1;

        Random numAle = new Random();

        numeroAleatorio = numAle.nextInt(100);

        System.out.println("Ingresa un numero del 1 al 100");
        Scanner teclado = new Scanner(System.in);
        numeroDeUsuario = teclado.nextInt();

        System.out.println(numeroAleatorio);

        while (contador < 5){
            if (numeroDeUsuario == numeroAleatorio){
                System.out.println("Felicidades adivinaste el numero");
                break;
            } else {
                contador++;
                System.out.println("Este es tu intento numero " + contador + " de 5, ingresa otro numero ");
                numeroDeUsuario = teclado.nextInt();
            }

        }

    }
}
