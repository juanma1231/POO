package taller.punto2b.app;

import taller.punto2b.dominio.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Etapa e1 = new Etapa("1", "el ganador fué juan");
        Etapa e2 = new Etapa("2", "la ganadora fué sara");
        Etapa e3 = new Etapa("3","el ganador fué simon");
        Etapa e4 = new Etapa("4","el ganador fué juan");
        Etapa e5 = new Etapa("5","la ganadora fué sofia");
        Etapa e6 = new Etapa("6","el ganador fué simon");
        Etapa e7 = new Etapa("7", "la ganadora fué angie");
        Etapa e8 = new Etapa("8","el ganador fué juan");
        Etapa e9 = new Etapa("9","la ganadora fué sara");
        Etapa e10 = new Etapa("10", "el ganador fué simon");
        Etapa e11 = new Etapa("11","el ganador fué daniel");
        Etapa e12 = new Etapa("12","el ganador fué juan");
        Etapa e13 = new Etapa("13","el ganador fué sebastian");
        Etapa e14 = new Etapa("14","la ganadora fué lauea");
        Etapa e15 = new Etapa("15","el ganador fué juan");
        Etapa e16 = new Etapa("16","la ganadora fué laura");
        Etapa e17 = new Etapa("17","el ganador fué simon");
        Etapa e18 = new Etapa("18","el ganador fué alejandro");
        Etapa e19 = new Etapa("19","el ganador fué camilo");
        Etapa e20 = new Etapa("20","la ganadora fué sofia");
        Etapa e21 = new Etapa("21", "el ganador fué julian");
        List<Etapa> eta = new ArrayList<>();

        eta.add(e1);
        eta.add(e2);
        eta.add(e3);
        eta.add(e4);
        eta.add(e5);
        eta.add(e6);
        eta.add(e7);
        eta.add(e8);
        eta.add(e9);
        eta.add(e10);
        eta.add(e11);
        eta.add(e12);
        eta.add(e13);
        eta.add(e14);
        eta.add(e15);
        eta.add(e16);
        eta.add(e17);
        eta.add(e18);
        eta.add(e19);
        eta.add(e20);
        eta.add(e21);




        Corredor sara = new Corredor("sara",19,5);
        Corredor daniel = new Corredor("daniel", 20, 4);
        Corredor yo = new Corredor("juan ",21, 6);
        Corredor camilo = new Corredor("camilo",22,4);
        Corredor c5 =new Corredor("sofia", 23, 5);
        Corredor c6 = new Corredor("simon",29,4);
        Corredor c7 = new Corredor("laura", 28,2);
        Corredor c8 = new Corredor("sebastian", 25,1);
        Corredor c9 = new Corredor("julian",26,3);
        Corredor c10 = new Corredor("alejandro", 27,3);
        Corredor c11 = new Corredor("angie",31,0);
        List<Corredor> equi1 = new ArrayList<>();
        List<Corredor> equi2= new ArrayList<>();
        List<Corredor> equi3 = new ArrayList<>();
        List<Corredor> equi4 = new ArrayList<>();
        equi1.add(daniel);
        equi1.add(camilo);
        equi1.add(sara);
        equi2.add(yo);
        equi2.add(c5);
        equi2.add(c6);
        equi3.add(c7);
        equi3.add(c8);
        equi3.add(c9);
        equi4.add(c10);
        equi4.add(c11);

        Equipo a = new Equipo(equi1,"movistar");
        Equipo b = new Equipo(equi2,"sunweb");
        Equipo c = new Equipo(equi3,"Emirates");
        Equipo d = new Equipo(equi4,"Cofidis");


        List<Equipo> tour1 = new ArrayList<>();
        tour1.add(a);
        tour1.add(b);
        tour1.add(c);
        tour1.add(d);
        Tour h1 = new Tour(tour1,eta,"tour 1");
        h1.top10();

        List<Corredor>j = new ArrayList<>();

        j= h1.mostrarEdad("movistar");
        for (Corredor ñ :j){
            System.out.println("jugador "+ ñ.getNombre()+" edad: "+ ñ.getEdad());
            System.out.println("---------------------------------------------------------");
        }
        List<Etapa> et =new ArrayList<>();
        et = h1.mostrarEtapas();
        for(Etapa au : et){
            System.out.println("en la etapa "+ au.getNombre()+" el resultado fué: "+ au.getResultado());
            System.out.println("----------------------------------------------------------");
        }
        Etapa JI = new Etapa("coma", "ji");
        JI.setResultado(h1.mostrarEtapaEspesifica("1").getResultado());
        JI.setNombre(h1.mostrarEtapaEspesifica("1").getNombre());
        System.out.println("el resultado de la etapa "+ JI.getNombre()+ " es: "+ JI.getResultado());

        List<Integer> top = new ArrayList<>();
        top = h1.top10();
        int p= top.size();
        int contador=1;
        for(int i=p-1;i>= p-10;i--){

            System.out.println("el numero "+contador+" tuvo un puntaje de: "+ top.get(i));
            System.out.println("--------------------------------");
            contador= contador +1;
        }

        List<String> nom = new ArrayList<>();
        nom = h1.mostrarEquipos();
        System.out.println("los nombres de los equipos son : ");
        System.out.println("----------------------------------------");
        for(String k : nom){
            System.out.println(k);
        }











    }
}
