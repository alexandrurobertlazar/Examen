package control;

import model.Pelicula;
import model.PeliculasList;

public class SortByAñoCommand implements Command{
    PeliculasList peliculasList;

    public SortByAñoCommand(PeliculasList peliculasList) {
        this.peliculasList = peliculasList;
    }


    @Override
    public void execute() {
        peliculasList.sortByAño();
    }
}
