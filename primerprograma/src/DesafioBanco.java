import java.util.Scanner;

public class DesafioBanco {

    public static void main(String[] args) {
        double saldo = 12000, retiro = 0, deposito = 0;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al banco TuDaddy, tu saldo es " + saldo);

        while (opcion != 9){
            System.out.println("Selecciona la opcion que deseas");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("9. SALIR");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Tu saldo actual es " + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto dinero es el que deseas retirar?");
                    retiro = teclado.nextDouble();

                    if (retiro > saldo){
                        System.out.println("No dispones del saldo suficiente para esta accion");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("Operacion realizada con exito, su saldo actual es " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el monto que quieres depositar");
                    deposito = teclado.nextDouble();

                    if (deposito <= 0){
                        System.out.println("No puedes depositar saldo negativo o 0 pesos a la cuenta");
                    }else {
                        saldo = saldo + deposito;
                        System.out.println("Operacion realizada con exito, tu saldo actual es el siguente " + saldo);
                    }
                    break;
                case 9:
                    System.out.println("Gracias por usar el banco TuDaddy, vuelva pronto");
                    break;

            }
        }
    }
}
