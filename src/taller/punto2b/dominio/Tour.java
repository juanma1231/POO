package taller.punto2b.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tour {
    private List<Equipo> equipos = new ArrayList<>();
    private  List<Etapa> etapas = new ArrayList<>();
    private String nombre;

    public Tour(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Tour(List<Equipo> equipos, List<Etapa> etapas, String nombre) {
        if (etapas.size()==21){
            if (equipos.size()<=5 && equipos.size()>=1){
                this.etapas = etapas;
                this.equipos = equipos;
                this.nombre = nombre;
            }
            else System.out.println("no se permite más de 5 equipos y debe de haber más de un equipo");
        }
        else System.out.println("no se permite una cantidad diferente a 21 etapas");



    }
    public  List<String> mostrarEquipos(){
        List<String> nom = new ArrayList<>();

        for (Equipo c : this.equipos){
            nom.add(c.getNombre());
        }
        return nom;
    }

    public List<Etapa> mostrarEtapas(){
        return this.etapas;
    }
    public Etapa mostrarEtapaEspesifica(String e){
        Etapa C = new Etapa("JI","OK");
        for (Etapa a : this.etapas){
            if (a.getNombre()==e){
                C.setResultado(a.getResultado());
                C.setNombre(a.getNombre());
            }
        }
        return C;

    }
    public List<Integer> top10(){
        List<Integer> puntuaciones = new ArrayList<>();
        for (Equipo a: equipos) {
            for(Corredor b:a.getCorredores()){
                puntuaciones.add(b.getPuntaje());
            }
        }
        Collections.sort(puntuaciones);
        return puntuaciones;

    }
    public List<Corredor> mostrarEdad(String a){
        List<Corredor> c = new ArrayList<>();
        for(Equipo b :this.equipos){
            if (b.getNombre()==a){

                Collections.sort(b.getCorredores());
                c=b.getCorredores();
                }

            }
        return c;
        }

    }



