package control;

import model.PeliculasList;

public class GetCurrentPeliculaCommand implements Command{
    PeliculasList list;

    public GetCurrentPeliculaCommand(PeliculasList list) {
        this.list = list;
    }

    @Override
    public void execute() {
        list.current();
    }
}
