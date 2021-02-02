package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PeliculasList {
    private List<Pelicula> peliculaList;
    private List<Observer> observerList = new ArrayList<>();
    private int pos;

    public PeliculasList() {
        this.peliculaList = new ArrayList<>();
        this.pos = 0;
    }

    public PeliculasList(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
        this.pos = 0;
    }

    public boolean addPelicula(Pelicula p) {
        return this.peliculaList.add(p);
    }

    public boolean removePelicula(Pelicula p) {
        Pelicula temp = this.peliculaList.remove(this.peliculaList.indexOf(p));
        if (temp != null) return true;
        return false;
    }

    public void sortByGenero() {
        peliculaList.sort(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getGenero().compareTo(o2.getGenero());
            }
        });
        notifyObservers();
    }

    public void sortByVisualizaciones() {
        peliculaList.sort(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                if (o1.getVisualizaciones() > o2.getVisualizaciones()) return -1;
                else return 1;
            }
        });
        notifyObservers();
    }

    public void sortByAño() {
        peliculaList.sort(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                if (o1.getAño() > o2.getAño()) return -1;
                else return 1;
            }
        });
        notifyObservers();
    }

    public void sortByCalificación() {
        peliculaList.sort(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                if (o1.getCalificación() > o2.getCalificación()) return -1;
                else return 1;
            }
        });
        notifyObservers();
    }

    public void registerObserver(Observer obs) {
        this.observerList.add(obs);
    }

    public void unregisterObserver(Observer obs) {
        this.observerList.remove(this.observerList.indexOf(obs));
    }

    public void notifyObservers() {
        for (Observer obs :
                observerList) {
            obs.update();
        }
    }

    // Aproximación a patrón Iterator.
    public boolean hasNext() {
        if (peliculaList.get(pos + 1) != null) return true;
        return false;
    }
    public Pelicula next() {
        pos=(pos+1)%(peliculaList.size());
        notifyObservers();
        return peliculaList.get(pos);
    }

    public Pelicula previous(){
        if (pos-1 < 0){
            pos= peliculaList.size()-1;
        } else{
            pos=(pos-1)%(peliculaList.size());
        }
        notifyObservers();
        return peliculaList.get(pos);
    }

    public void current() {
        notifyObservers();
    }

    public Pelicula getCurrent(){
        return peliculaList.get(pos);
    }

    public interface Observer{
        void update();
    }

    @Override
    public String toString(){
        String s = "";
        for (Pelicula p :
                peliculaList) {
            s+=p+"\n";
        }
        return s;
    }
}
