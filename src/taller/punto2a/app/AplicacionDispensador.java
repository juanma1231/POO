package taller.punto2a.app;

import taller.punto2a.dominio.Dispensadora;
import taller.punto2a.dominio.Producto;

public class AplicacionDispensador {
    public static void main(String[] args) {
        Producto shitos = new Producto("cheetos", 34000, "b2", 5);
        Producto boliquesos = new Producto("boliquesos", 4000, "b1", 0);
        Producto speedMax = new Producto("speedMax", 2500,"b3", 0);
        Producto bocadillo = new Producto("bocadill0",1000,"b4",2);

        Dispensadora dispensador1= new Dispensadora();
        dispensador1.getProductos().add(shitos);
        dispensador1.getProductos().add(boliquesos);
        dispensador1.getProductos().add(speedMax);
        dispensador1.getProductos().add(bocadillo);
        for (int i=0; i< dispensador1.getProductos().size(); i++){
            System.out.println(dispensador1.getProductos().get(i).getCantidadActual());
        }
        dispensador1.sacarProducto("cheetos");
        dispensador1.sacarProducto("cheetos");
        for (int i=0; i< dispensador1.getProductos().size(); i++){
            System.out.println(dispensador1.getProductos().get(i).getCantidadActual());
        }
        dispensador1.productosAgotados();
        dispensador1.consultarCantidad("b4");
        dispensador1.consultarTodasUnidades();
        dispensador1.aumentarCantidades(6, "b2");
        dispensador1.consultarTodasUnidades();
        dispensador1.sacarProducto("b1");






    }
}
