package trabjoDOO.dominio;



import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    String nombreMateria;
    int clase;
    ArrayList<Estudiante> asistencias = new ArrayList<>();
    Scanner entrada1= new Scanner(System.in);

    public Lista(String nombreMateria, int clase, ArrayList<Estudiante> asistencias) {
        this.nombreMateria = nombreMateria;
        this.clase = clase;
        this.asistencias = asistencias;
    }
    public void cambiarAsistencia(){
        int num;
        System.out.println("ingrese el numero de lista del estudiante: ");
        num=entrada1.nextInt();
        for (Estudiante f: this.asistencias){
            if(num== f.getNumeroLista()){
                System.out.println("el estudiante "+ f.getAsistencia()+" asistiioó a clase, que desea poner en la asistencia?");
                String asis;
                asis= entrada1.next();
                f.setAsistencia(asis);
            }
        }
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public ArrayList<Estudiante> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Estudiante> asistencias) {
        this.asistencias = asistencias;
    }
}