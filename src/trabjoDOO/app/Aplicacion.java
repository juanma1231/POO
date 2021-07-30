package trabjoDOO.app;

import trabjoDOO.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        EstudianteMatricula juan = new EstudianteMatricula("juan");
        juan.Matricular();
        System.out.println(juan.getMaterias());
        EstudianteMateria juana = new EstudianteMateria("JUAN", 3.2, 3.1, 5, 3, 1, 2,1);
        EstudianteMateria juli = new EstudianteMateria("JULIANA", 3.5,4, 5,1,0, 3,2);

        List<EstudianteMateria> aux = Arrays.asList(juana,juli);
        Materia calculo = new Materia("calculo", aux);
        calculo.calcularDef();

        Estudiante jose = new Estudiante("JOSE", "no", 1);
        Estudiante rober = new Estudiante("Roberto", "si", 2);
        ArrayList<Estudiante> aux2 = new ArrayList<>();
        aux2.add(jose);
        aux2.add(rober);
        Lista DOO = new Lista("DOO", 2, aux2);
        for (Estudiante d: DOO.getAsistencias()){
            System.out.println("el estudiante "+ d.getNombre()+"de la materia  "+ DOO.getNombreMateria()+" "+ d.getAsistencia()+" asistió");
        }

        calculo.cambiarNota();
        calculo.calcularDef();
        DOO.cambiarAsistencia();
        for (Estudiante d: DOO.getAsistencias()){
            System.out.println("el estudiante "+ d.getNombre()+"de la materia  "+ DOO.getNombreMateria()+" "+ d.getAsistencia()+" asistió");
        }


    }


}