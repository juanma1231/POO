package parcial.app;

import parcial.dominio.Material;
import parcial.dominio.Pooflix;
import parcial.dominio.TipoMaterial;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Material jumanji = new Material(1, "jumanji", 60, TipoMaterial.PELICULA);
        Material leon = new Material(3, "el rey leon", 90, TipoMaterial.PELICULA);
        Material breaking = new Material(5, "breaking bad", 560, TipoMaterial.SERIE);
        Material bruno = new Material(2, "it is bruno", 100, TipoMaterial.SERIE);
        Material naruto = new Material(10, "naruto", 5250, TipoMaterial.ANIME);

        List<Material> aux = new ArrayList<>();
        aux.add(jumanji);
        aux.add(leon);

        Pooflix cuenta1 = new Pooflix(aux);
        cuenta1.agregar(bruno);
        cuenta1.agregar(breaking);
        cuenta1.agregar(naruto);


        boolean aux2 = cuenta1.retirar(5);
        System.out.println(aux2);
        for (Material j : cuenta1.getMateriales()) {
            System.out.println(j.getNombre());
        }

        System.out.println("\n **** lista ordenada ****");
        List<Material> aux4 = cuenta1.ordenarPorCodigo();
        for (Material j : aux4) {
            System.out.println(j.getCodigo() + "    " + j.getNombre());
        }

        System.out.println("\n **** buscar codigo ****");
        Material ma = cuenta1.buscar(2);
        System.out.println(ma.getNombre());

        System.out.println("\n **** buscar nombre ****");
        Material me = cuenta1.buscar("NARUTO");
        System.out.println(me.getNombre());

        System.out.println("\n **** buscar por tipo ****");
        List<Material> aux3 = cuenta1.buscarPorTipo(TipoMaterial.PELICULA);
        for (Material j : aux3) {
            System.out.println(j.getNombre());
        }

        System.out.println("\n **** duracion total ****");
        int calcular = cuenta1.calcularDuracion();
        System.out.println(calcular);


        boolean aux5 = cuenta1.retirar(7);
        for (Material j : cuenta1.getMateriales()) {
            System.out.println(j.getNombre());
        }
    }



}
