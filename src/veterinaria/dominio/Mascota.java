package veterinaria.dominio;

public abstract class Mascota {
    private String nombre;
    private String sexo;
    private int edad;
    private boolean esterilizada;

    public Mascota(String nombre, String sexo, int edad, boolean esterilizada) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizada = esterilizada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsterilizada() {
        return esterilizada;
    }

    public void setEsterilizada(boolean esterilizada) {
        this.esterilizada = esterilizada;
    }
}
