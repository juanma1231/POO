package ahorcado.dominio;

import java.util.ArrayList;

public class Usuario {
    private static ArrayList<Integer> puntaje = new ArrayList<>();
    private static ArrayList<Integer> intentos = new ArrayList<>();
    private static ArrayList<Integer> complejidad = new ArrayList<>();
    private static ArrayList<String> fecha = new ArrayList<>();
    private static String correo;

    public  Usuario(String correo) {
        Usuario.correo = correo;
    }

    public static ArrayList<Integer> getPuntaje() {
        return puntaje;
    }

    public static void setPuntaje(ArrayList<Integer> puntaje) {
        Usuario.puntaje = puntaje;
    }

    public static ArrayList<Integer> getIntentos() {
        return intentos;
    }

    public static void setIntentos(ArrayList<Integer> intentos) {
        Usuario.intentos = intentos;
    }

    public static ArrayList<Integer> getComplejidad() {
        return complejidad;
    }

    public static void setComplejidad(ArrayList<Integer> complejidad) {
        Usuario.complejidad = complejidad;
    }

    public static ArrayList<String> getFecha() {
        return fecha;
    }

    public static void setFecha(ArrayList<String> fecha) {
        Usuario.fecha = fecha;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Usuario.correo = correo;
    }
}
