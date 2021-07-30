package trabjoDOO.dominio;

public class Estudiante {
    String nombre, asistencia;
    private int numeroLista;

    public Estudiante(String nombre, String asistencia, int numeroLista) {
        this.nombre = nombre;
        this.asistencia = asistencia;
        this.numeroLista = numeroLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public int getNumeroLista() {
        return numeroLista;
    }
}
