package model;

public class Tiempo {
    private int minutos;
    private int segundos;
    private int horas;

    public Tiempo(int horas, int minutos, int segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
        this.horas = horas;
    }

    @Override
    public String toString() {
        String s="";
        if (horas==0) s+="00";
        else s+=this.horas;
        s+=":";
        if (minutos==0) s+="00";
        else s+=this.minutos;
        s+=":";
        if (segundos==0) s+="00";
        else s+=this.segundos;
        return s;
    }
}
