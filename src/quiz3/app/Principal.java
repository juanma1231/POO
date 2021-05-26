package quiz3.app;

import quiz3.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Inmueble casa1 = new Casa("cr 27A #33-40", true);
        Inmueble casa2 = new Casa("cr 21 #22-33", false);
        Inmueble apartamento1 = new Apartamento("cr 27A #32-22 apar 202",true);
        Inmueble apartamento2 = new Apartamento("cr 28 #25-30 apar 501",false);
        Inmueble lote1 = new Lote("cr 30 #25-25",false);
        List<Inmueble> age =  Arrays.asList(casa1,casa2,apartamento1, apartamento2, lote1);
        Agencia casaSAS = new Agencia("casaSAS", age);

        Inmueble casa3 = new Casa("cr 30 #20-20",false);


        boolean a =casaSAS.arrendar((Arrendable) apartamento2);
        System.out.println(a);

        boolean b = casaSAS.devolver((Arrendable) apartamento1);
        System.out.println(b);


        boolean c = casaSAS.vender(casa1);
        System.out.println(c);

        List<Inmueble> arren = casaSAS.getArrendablesDisponibles();
        System.out.println("DISPONIBLES:");
        System.out.println("--------------------------------");
        for (Inmueble g : arren){
            System.out.println(g);
        }
        System.out.println("-------------------------");

        List<Inmueble> arrend = casaSAS.getArrendados();
        System.out.println("ARRENDADOS :");
        System.out.println("----------------------------");
        for(Inmueble h :arrend){
            System.out.println(h);
        }


    }
}
