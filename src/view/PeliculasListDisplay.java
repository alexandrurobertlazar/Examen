package view;

import model.PeliculasList;

public interface PeliculasListDisplay extends PeliculasList.Observer {
    void display();
}
