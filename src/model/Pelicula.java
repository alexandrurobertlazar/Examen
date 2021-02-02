package model;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {


    private String genero;
    private int año;
    private Imagen caratula;
    private Tiempo duración;
    private String titulo;
    private String director;
    private List<String> actores;
    private double calificación;
    private int visualizaciones;

    public Pelicula(String genero, int año, Imagen caratula, Tiempo duración, String titulo, String director, List<String> actores, double calificación, int visualizaciones) {
        this.genero = genero;
        this.año = año;
        this.caratula = caratula;
        this.duración = duración;
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
        this.calificación = calificación;
        this.visualizaciones = visualizaciones;
    }

    public String getGenero() {
        return genero;
    }

    public int getAño() {
        return año;
    }

    public Imagen getCaratula() {
        return caratula;
    }

    public Tiempo getDuración() {
        return duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActores() {
        return actores;
    }

    public double getCalificación() {
        return calificación;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + '\'' +
                ", año=" + año +
                ", caratula=" + caratula +
                ", duración=" + duración +
                ", titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", actores=" + actores +
                ", calificación=" + calificación +
                ", visualizaciones=" + visualizaciones +
                '}';
    }
}
