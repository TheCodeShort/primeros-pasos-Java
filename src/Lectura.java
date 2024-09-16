import java.util.Scanner;/*importacion de la clase escanner*/

public class Lectura { /*definicion de la clase*/
    public static void main(String[] args) { /*metodo principal*/
        Scanner teclado = new Scanner(System.in);/*aca espera la entrada de un dato
                                                  crea una instanciade scaner
                                                  (System.in) es el flujo de entrada estandar (teclado)*/

        System.out.println("escribe el nombre de tu perlicula");
        String pelicula = teclado.nextLine();/*next depende del tipo de dato y lee */
        /*pedir entrada al usuario y capturar el siguiente token*/
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();/*captura el sigiente token (palabra)*/

        System.out.println("por ultimo dinos que nota le das a esta pelicula");
        double nota = teclado.nextDouble();
        /*scanner.clase(); (opcional pero recomendado cerrar el escaner)*/
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
