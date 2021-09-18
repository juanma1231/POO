package trabjoDOO.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Materia {
    private String nombreMateria;
    List<EstudianteMateria> notas = new ArrayList<>();
    Scanner entrada1= new Scanner(System.in);
    public int opcion;


    public void calcularDef (){
        for (EstudianteMateria a: this.notas){
            double seguimiento= (a.getNota1Q()*0.25) +(a.getNota2Q()*0.25)+(a.getNota3Q()*0.25)+(a.getNota4Q()*0.25);
            double definitiva = (seguimiento*0.40)+ (a.getNotaP()*0.30)+ (a.getNotaF()*0.30);
            a.setDefinitiva(definitiva);
            System.out.println("el estudiante "+ a.getNombre()+" tuvo una nota definitiva de: "+a.getDefinitiva());
        }
    }

    public Materia(String nombreMateria, List<EstudianteMateria> notas) {
        this.nombreMateria = nombreMateria;
        this.notas = notas;
    }
    public  void cambiarNota(){
        int est;
        System.out.println("indique el numero de la lista del estudiante al cual desea cambiarle la nota ");
        est = entrada1.nextInt();
        for(EstudianteMateria d: this.notas){
            if(est==d.getNumeroLista()){
                System.out.println("que nota desea cambiar 1)parcial 2)final   3) quiz1   4) quiz2   5) quiz3  6) quiz4");
                opcion = entrada1.nextInt();
                double aux;
                if(opcion==1){
                    System.out.println("que nota desea poner? ");
                    aux = entrada1.nextDouble();
                    d.setNotaP(aux);
                }
                if(opcion==2){
                    System.out.println("que nota desea poner? ");
                    aux = entrada1.nextDouble();
                    d.setNotaF(aux);
                }
                if (opcion==3){
                    System.out.println("que nota desea poner? ");
                    aux = entrada1.nextDouble();
                    d.setNota1Q(aux);
                }
                if(opcion==4){
                    System.out.println("que nota desea poner? ");
                    aux = entrada1.nextDouble();
                    d.setNota2Q(aux);
                }
                if(opcion==5){
                    System.out.println("que nota desea poner? ");
                    aux = entrada1.nextDouble();
                    d.setNota3Q(aux);
                }
                if(opcion==6){
                    System.out.println("que nota desea poner? ");
                    aux = entrada1.nextDouble();
                    d.setNota4Q(aux);
                }
            }
        }

    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<EstudianteMateria> getNotas() {
        return notas;
    }

    public void setNotas(List<EstudianteMateria> notas) {
        this.notas = notas;
    }
}