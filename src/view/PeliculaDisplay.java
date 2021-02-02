package view;

import model.PeliculasList;

public interface PeliculaDisplay extends PeliculasList.Observer {
    void display();
}
