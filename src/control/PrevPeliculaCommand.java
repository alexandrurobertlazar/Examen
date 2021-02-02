package control;

import model.PeliculasList;

public class PrevPeliculaCommand implements Command{
    PeliculasList peliculasList;

    public PrevPeliculaCommand(PeliculasList peliculasList) {
        this.peliculasList = peliculasList;
    }

    @Override
    public void execute() {
        this.peliculasList.previous();
    }
}
