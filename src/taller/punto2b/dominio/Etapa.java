package taller.punto2b.dominio;

public class Etapa {
    private String nombre;
    private String resultado;


    public Etapa(String nombre, String resultado) {
        this.nombre = nombre;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
