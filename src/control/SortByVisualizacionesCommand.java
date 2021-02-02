package control;

import model.PeliculasList;

public class SortByVisualizacionesCommand implements Command {
    PeliculasList peliculasList;

    public SortByVisualizacionesCommand(PeliculasList peliculasList) {
        this.peliculasList = peliculasList;
    }


    @Override
    public void execute() {
        peliculasList.sortByVisualizaciones();
    }
}
