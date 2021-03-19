package taller.punto2b.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Corredor> corredores = new ArrayList<>();
    private String nombre;

    public Equipo(List<Corredor> corredores, String nombre) {
        if (corredores.size()<=7 && corredores.size()>=1){
            this.corredores = corredores;
            this.nombre = nombre;
        }
        else System.out.println("solo se permiten 7 corredores por equipo");

    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public String getNombre() {
        return nombre;
    }
}
