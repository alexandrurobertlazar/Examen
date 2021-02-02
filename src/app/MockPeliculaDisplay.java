package app;

import model.PeliculasList;
import view.PeliculaDisplay;

public class MockPeliculaDisplay implements PeliculaDisplay {
    PeliculasList list;

    public MockPeliculaDisplay(PeliculasList list) {
        this.list = list;
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Película actual: " + list.getCurrent());
    }
}
