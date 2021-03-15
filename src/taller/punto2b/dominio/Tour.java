package taller.punto2b.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tour {
    private List<Equipo> equipos = new ArrayList<>();
    private  List<Etapa> etapas = new ArrayList<>();

    public Tour(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Tour(List<Equipo> equipos, List<Etapa> etapas) {
        if (etapas.size()==21){
            if (equipos.size()<=5 && equipos.size()==1){
                this.etapas = etapas;
                this.equipos = equipos;
            }
            else System.out.println("no se permite más de 5 equipos y debe de haber más de un equipo");
        }
        System.out.println("no se permite una cantidad diferente a 21 etapas");


    }
    public void mostrarEquipos(){
        for (Equipo c : this.equipos){
            System.out.println("la lista de equipos es: ");
            System.out.println("- "+ c.getNombre());
        }
    }

    public void mostrarEtapas(){
        System.out.println("los resultados de todas las etapas son: ");
        for (Etapa a : this.etapas){
            System.out.println("en la etapa "+ a.getNombre() + "el resultado fué: "+ a.getResultado());
        }
    }
    public void mostrarEtapaEspesifica(String e){
        for (Etapa a : this.etapas){
            if (a.getNombre()==e){
                System.out.println("el resultado en la etapa "+ e+ "es: "+ a.getResultado());
            }
        }
    }
    public void mostrarEdad(String a){
        for(Equipo b :this.equipos){
            if (b.getNombre()==a){
                Collections.sort(b.getCorredores());
                System.out.println("la lista de corredores con sus correspondientes edades es: ");
                for(Corredor d: b.getCorredores()){
                    System.out.println("- "+ d.getNombre()+" que tiene: "+ d.getEdad()+"años");
                }

                }
            }
        }
    }






