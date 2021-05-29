package veterinaria.dominio;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private List<Mascota> pacientes = new ArrayList<>();


    public Mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizada){
        if (sexo== "hembra"){
            if (edad>18 && esterilizada== false){
                Mascota mascota1 = new MascotaApta(nombre,sexo,edad,esterilizada);
                this.pacientes.add(mascota1);
                return mascota1;
            }
            else if(esterilizada==true){
                Mascota mascota2 = new MascotaEsterilizada(nombre,sexo,edad,esterilizada);
                this.pacientes.add(mascota2);
                return mascota2;
            }
            else if(edad<18){
                Mascota mascota3 = new MascotaNoApta(nombre,sexo,edad,esterilizada);
                this.pacientes.add(mascota3);
                return mascota3;
            }
        }
        else if(sexo == "macho"){
            if(edad>12 && esterilizada==false){
                Mascota mascota4 = new MascotaApta(nombre,sexo,edad,esterilizada);
                this.pacientes.add(mascota4);
                return mascota4;
            }
            else if(edad<12){
                Mascota mascota5 = new MascotaNoApta(nombre,sexo,edad,esterilizada);
                this.pacientes.add(mascota5);
                return mascota5;
            }
            else  if(esterilizada==true){
                Mascota mascota6 = new MascotaEsterilizada(nombre,sexo,edad,esterilizada);
                this.pacientes.add(mascota6);
                return mascota6;
            }
        }
        return null;
    }
    public List<MascotaApta> getPacientesAOperar(){
        List<MascotaApta> aux = new ArrayList<>();
        for (Mascota c : pacientes){
            if (c instanceof MascotaApta){
                aux.add((MascotaApta) c);

            }
        }

        return aux;
    }

    public void operar(){
        for ( Mascota a : pacientes){
            if(a instanceof MascotaApta){
                ((MascotaApta) a).operar();
            }
        }
    }


    public List<Mascota> getPacientes() {
        return pacientes;
    }
}
