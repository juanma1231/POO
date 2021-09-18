package ahorcado.dominio;

public class Palabras {
    private static String[] palabrasMedias = new String[]{"SOLICITD", "LUNA", "CAMARA", "TECLADO", "ALUMNO", "AULA", };
    public static boolean[] indiceM = new boolean[palabrasMedias.length];
    private static String[] palabrasAltas = new String[]{"ESTETOSCOPIO", "AGRUPACIONES", "IMPRECINDIBLE", "MODERNBOARD", "RECOMENDACIONES", "SOCIOPOLITICA", "MATEMATICAS"};
    public static boolean[] indiceA = new boolean[palabrasAltas.length];
    private static String[] palabrasBaja = new String[]{"SOL", "SAL", "SALI", "TRES", "DOS", "LATA", "RISA"};
    public static boolean[] indiceB = new boolean[palabrasBaja.length];

}
