public class Deciciones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;/*Tipo de dadto primitivo entero*/
        boolean incluidoEnElPlan = true;
        double notaDelaPelicula = 8.2;
        String tipoPalan = "plus";
        if (fechaDeLanzamiento >= 2022){
            System.out.printf("Peliculas mas populares");
        }else {
            System.out.printf("peñiculas retro que aun vale la pena ver");
        }
        if (incluidoEnElPlan && tipoPalan.equals("plus")){
            System.out.printf("Disfrute de la pelicula");
        }else{
            System.out.printf("Pelicula no disponible para su plan actual ");
        }
    }
}
