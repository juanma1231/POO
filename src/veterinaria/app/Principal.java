package veterinaria.app;

import veterinaria.dominio.*;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Veterinaria dogs = new Veterinaria();
        dogs.revisarMascota("danna","hembra",9, false);
        dogs.revisarMascota("toby", "macho",36, false);
        dogs.revisarMascota("flor","hembra",19,true);
        dogs.revisarMascota("orion","macho",13,false);

        System.out.println("LISTA DE MASCOTAS:");
        for(Mascota e : dogs.getPacientes()){
            if(e instanceof MascotaApta){
                System.out.println("\n la mascota "+ e.getNombre()+" es apta " + e.isEsterilizada());
            }
            else if(e instanceof MascotaNoApta){
                System.out.println("\n la mascota "+ e.getNombre() + " no es apta " + e.isEsterilizada());
            } else if (e instanceof MascotaEsterilizada) {
                System.out.println("\n la mascota "+ e.getNombre() + " ya está esterilizada " + e.isEsterilizada());
            }
        }
        List<MascotaApta> aux2 = dogs.getPacientesAOperar();
        System.out.println("\n LAS MASCOTAS A OPERAR SON: ");
        System.out.println("--------------------------------------");
        for (MascotaApta d : aux2){
            System.out.println(d.getNombre());
        }
        System.out.println(" \n valores de si esta esterilizado ");
        System.out.println("--------------------------------------");
        dogs.operar();
        for (Mascota b : dogs.getPacientes()){
            System.out.println(b.isEsterilizada());
        }
    }

}
