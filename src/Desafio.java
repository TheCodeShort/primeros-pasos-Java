//Desafio de cuenta bancaria

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class  Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrsa tu nombre de usuario:");
        String nombreUsuario = teclado.nextLine();
        System.out.println("que tipo de cuenta tienes ahorros o credito:");
        String tipoDeCuenta = teclado.nextLine();
        double saldoDisponible = 0;
        System.out.println("");

        System.out.println("Nombre de usuario:" + nombreUsuario);
        System.out.println("Tipo de cuenta" + tipoDeCuenta);
        System.out.println("Saldo disponible:" + saldoDisponible+"$");
        System.out.println("");

        int i = 0;
        while (i != 1){


            System.out.println("eligue una de las opciones");
            String opciones = """
                    1: Consultar saldo.
                    2: Retirar.
                    3: Depositar.
                    4: Salir.""";
            System.out.println(opciones);

            int opcionEleguida = teclado.nextInt();
            if (opcionEleguida == 1) {
                System.out.println("Tu saldo disponible es: " + saldoDisponible + "$");
                System.out.println("");
            }
            else if (opcionEleguida == 2) {

                if (saldoDisponible == 0) {
                    System.out.println("no tienes saldo para retirar");
                    System.out.println("");
                } else {
                    System.out.println("Escribe el saldo que vas a retirar");
                    double saldoRetirado = teclado.nextDouble();
                    if (saldoRetirado > saldoDisponible) {
                        System.out.println("Monto de retiro no disponible");
                        System.out.println("");
                    }else {
                        saldoDisponible = saldoDisponible - saldoRetirado;
                        System.out.println("Tualdo nuevo es: " + saldoDisponible);
                        System.out.println("");
                    }
                }
            } else if (opcionEleguida == 3) {
                System.out.println("Digita la cantidad que quieres ingresar");
                int saldoIngresado = teclado.nextInt();
                saldoDisponible = saldoDisponible + saldoIngresado;
                System.out.println("Tu saldo disponible es: " + saldoDisponible + "$");
                System.out.println("");

            } else if (opcionEleguida == 4) {
                System.out.println("informacion final");
                System.out.println(nombreUsuario);
                System.out.println(tipoDeCuenta);
                System.out.println(saldoDisponible);
                i = 1;

            }else{
                System.out.println("obcion no valida");
            }
        }
    }
}
