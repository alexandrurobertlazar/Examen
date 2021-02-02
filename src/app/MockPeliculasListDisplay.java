package app;

import model.PeliculasList;
import view.PeliculasListDisplay;

public class MockPeliculasListDisplay implements PeliculasListDisplay {
    private PeliculasList list;
    @Override
    public void update() {
        display();
    }

    public MockPeliculasListDisplay(PeliculasList list) {
        this.list = list;
    }

    @Override
    public void display() {
        System.out.println(list);
    }
}
