package taller.punto2b.app;

import taller.punto2b.dominio.Compare;
import taller.punto2b.dominio.Corredor;
import taller.punto2b.dominio.Equipo;
import taller.punto2b.dominio.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Corredor sara = new Corredor("sara",19,5);
        Corredor daniel = new Corredor("daniel", 20, 4);
        Corredor yo = new Corredor("juan ",21, 6);
        Corredor camilo = new Corredor("camilo",22,4);
        List<Corredor> e1 = new ArrayList<>();
        List<Corredor> e2= new ArrayList<>();
        e2.add(daniel);
        e2.add(camilo);
        e2.add(sara);
        e2.add(yo);

        Equipo h = new Equipo(e1,"s");
        Equipo j = new Equipo(e2,"f");

        List<Equipo> tour1 = new ArrayList<>();
        tour1.add(h);
        tour1.add(j);
        Tour h1 = new Tour(tour1);
        h1.mostrarEdad("f");
        h1.mostrarEquipos();





        

    }
}
