package control;

import model.PeliculasList;

public class SortByCalificacionCommand implements Command{
    PeliculasList peliculasList;

    public SortByCalificacionCommand(PeliculasList peliculasList) {
        this.peliculasList = peliculasList;
    }


    @Override
    public void execute() {
        peliculasList.sortByCalificación();
    }
}
