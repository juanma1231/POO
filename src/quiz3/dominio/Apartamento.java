package quiz3.dominio;

public class Apartamento extends Inmueble implements Arrendable{


    public Apartamento(String direccion, boolean arrendado) {
        super(direccion, arrendado);
    }

    @Override
    public boolean arrendar() {
        if(this.isArrendado()==false){
            this.setArrendado(false);
            return true;
        }
        else return false;

    }

    @Override
    public boolean devolver() {
        if(this.isArrendado()==true){
            this.setArrendado(false);
            return true;
        }
        else return false;

    }

    @Override
    public String toString() {
        return "apartamento" + this.getDireccion();
    }
}
