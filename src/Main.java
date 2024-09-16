//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;/*Tipo de dadto primitivo entero*/
        boolean incluidoEnElPlan = true;
        double notaDelaPelicula = 8.2;

        double media = (8.2 + 6.8 + 9.8) / 3;/*Se utiliza para números de punto flotante con precisión doble, es el tipo más utilizado para valores decimales.*/
        System.out.println(media);
        String sinopsis = """
                Matrix es una paradoja 
                la mejor perlicula del fin del medio mielenio 
                fue lanzanda en: """ + fechaDeLanzamiento; /*text block  ya no se cenecesita el codigo System.out.println para escribir texto */

        System.out.println(sinopsis);

        int clasificacion  = (int) media / 2;/*casting de manera explicita*/

    }
}