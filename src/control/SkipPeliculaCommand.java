package control;

import model.PeliculasList;

public class SkipPeliculaCommand implements Command{
    PeliculasList peliculasList;

    public SkipPeliculaCommand(PeliculasList peliculasList) {
        this.peliculasList = peliculasList;
    }

    @Override
    public void execute() {
        this.peliculasList.next();
    }
}
