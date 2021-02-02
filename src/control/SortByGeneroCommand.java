package control;

import model.PeliculasList;

public class SortByGeneroCommand implements Command {
    PeliculasList peliculasList;

    public SortByGeneroCommand(PeliculasList peliculasList) {
        this.peliculasList = peliculasList;
    }


    @Override
    public void execute() {
        peliculasList.sortByGenero();
    }
}
