package taller.punto2b.dominio;

public class Compare implements Comparable<Compare> {
    public String nombre1;
    private int edad1;

    public Compare(String nombre1, int edad1) {
        this.nombre1 = nombre1;
        this.edad1 = edad1;
    }

    public int getEdad1() {
        return edad1;
    }



    @Override
    public int compareTo(Compare o) {
        if(this.getEdad1()>o.getEdad1()){
            return 1;
        }
        else if(this.getEdad1()<o.getEdad1()){
            return -1;
        }
        else{
            return 0;
        }

    }
}
