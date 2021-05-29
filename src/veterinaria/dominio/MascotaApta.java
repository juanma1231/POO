package veterinaria.dominio;

public class  MascotaApta extends Mascota implements operable {

    public MascotaApta(String nombre, String sexo, int edad, boolean esterilizada) {
        super(nombre, sexo, edad, esterilizada);
    }

    @Override
    public void operar() {
        this.setEsterilizada(true);

    }
}
