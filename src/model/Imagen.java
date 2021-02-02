package model;

public class Imagen {
    private String nombreCaratula;
    private static Imagen instance;
    public String getNombreCaratula() {
        return nombreCaratula;
    }

    private Imagen(String nombreCaratula) {
        this.nombreCaratula = nombreCaratula;
    }

    public static Imagen getInstance(String nombreCaratula){
        // No quiero ser capaz de crear dos carátulas iguales, pero sí diferentes.
        // Es una aproximación al patrón Singleton, aunque con la salvedad de que
        // podemos crear múltiples carátulas, siempre que no sean iguales.
        if (instance == null || !instance.equals(new Imagen(nombreCaratula))) instance = new Imagen(nombreCaratula);
        return instance;
    }

    @Override
    public String toString() {
        return nombreCaratula;
    }
}
