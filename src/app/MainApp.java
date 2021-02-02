package app;

import control.*;
import model.Imagen;
import model.Pelicula;
import model.PeliculasList;
import model.Tiempo;

import view.PeliculaDisplay;
import view.PeliculasListDisplay;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        new MainApp().execute();
    }

    private void execute() {
        PeliculasList list = new PeliculasList();

        List<String> actores = new ArrayList<>();
        actores.add("Adam Sandler");
        actores.add("Elvis Presley");
        list.addPelicula(new Pelicula("Acción",2020,Imagen.getInstance("Imagen 1"),
                new Tiempo(1,30,30),"Tenet",
                "Alguien",actores,3.87,1187));
        list.addPelicula(new Pelicula("Drama",2017, Imagen.getInstance("Imagen 2"),
                new Tiempo(1,00,30),"Una tarde en Nueva York",
                "Chandler Candace",actores,2.7,986));
        list.addPelicula(new Pelicula("Comedia",2011, Imagen.getInstance("Imagen 3"),
                new Tiempo(2,30,00),"Un día fantástico",
                "Adam Sandler",actores,5,1004203));

        PeliculasListDisplay displayLista = new MockPeliculasListDisplay(list);
        PeliculaDisplay displayPelicula=new MockPeliculaDisplay(list);

        list.registerObserver(displayLista);
        // Ordenamos por año.
        new SortByAñoCommand(list).execute();

        // Ordenamos por género.
        new SortByGeneroCommand(list).execute();

        // Quitamos el observer de la lista, ya que no lo necesitaremos
        // para mostrar las películas individualmente.
        list.unregisterObserver(displayLista);
        list.registerObserver(displayPelicula);

        // Probamos funcionamiento de los comandos para mostrar películas individuales.
        // Nos quedamos con la última ordenación hecha.
        new SkipPeliculaCommand(list).execute();
        new SkipPeliculaCommand(list).execute();
        new SkipPeliculaCommand(list).execute();

        new PrevPeliculaCommand(list).execute();
        new PrevPeliculaCommand(list).execute();
        new PrevPeliculaCommand(list).execute();

        new GetCurrentPeliculaCommand(list).execute();
    }
}
