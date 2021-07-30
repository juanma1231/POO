package trabjoDOO.dominio;

public class EstudianteMateria {
    private String nombre;
    private double notaP, notaF, nota1Q, nota2Q, nota3Q, nota4Q, definitiva;
    private int numeroLista;

    public EstudianteMateria(String nombre, double notaP, double notaF, double nota1Q, double nota2Q, double nota3Q, double nota4Q, int numeroLista) {
        this.nombre = nombre;
        this.notaP = notaP;
        this.notaF = notaF;
        this.nota1Q = nota1Q;
        this.nota2Q = nota2Q;
        this.nota3Q = nota3Q;
        this.nota4Q = nota4Q;
        this.numeroLista = numeroLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaP() {
        return notaP;
    }

    public void setNotaP(double notaP) {
        this.notaP = notaP;
    }

    public double getNotaF() {
        return notaF;
    }

    public void setNotaF(double notaF) {
        this.notaF = notaF;
    }

    public double getNota1Q() {
        return nota1Q;
    }

    public void setNota1Q(double nota1Q) {
        this.nota1Q = nota1Q;
    }

    public double getNota2Q() {
        return nota2Q;
    }

    public void setNota2Q(double nota2Q) {
        this.nota2Q = nota2Q;
    }

    public double getNota3Q() {
        return nota3Q;
    }

    public void setNota3Q(double nota3Q) {
        this.nota3Q = nota3Q;
    }

    public double getNota4Q() {
        return nota4Q;
    }

    public void setNota4Q(double nota4Q) {
        this.nota4Q = nota4Q;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    public int getNumeroLista() {
        return numeroLista;
    }
}