package taller.punto2b.dominio;

public class Corredor implements Comparable<Corredor> {
    private String nombre;
    private  int edad, puntaje;

    public Corredor(String nombre, int edad, int puntaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public int compareTo(Corredor o) {
            if(this.getEdad()>o.getEdad()){
                return 1;
            }
            else if(this.getEdad()<o.getEdad()){
                return -1;
            }
            else{
                return 0;
            }

    }
}
