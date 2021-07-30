package trabjoDOO.dominio;

import java.util.Scanner;

public class EstudianteMatricula {
    Scanner entrada= new Scanner(System.in);
    private String nombre, materias;

    public EstudianteMatricula(String nombre) {
        this.nombre = nombre;
    }
    public void Matricular(){
        System.out.println("que materias desea matricular? ");
        materias = entrada.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
}
