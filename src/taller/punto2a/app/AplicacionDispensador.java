package taller.punto2a.app;

import taller.punto2a.dominio.Dispensadora;
import taller.punto2a.dominio.Producto;

import java.util.ArrayList;
import java.util.List;

public class AplicacionDispensador {
    public static void main(String[] args) {
        Producto shitos = new Producto("cheetos", 34000, "b2", 5);
        Producto boliquesos = new Producto("boliquesos", 4000, "b1", 0);
        Producto speedMax = new Producto("speedMax", 2500,"b3", 0);
        Producto bocadillo = new Producto("bocadill0",1000,"b4",2);

        List<Producto> dispensador1= new ArrayList<>();
        dispensador1.add(shitos);
        dispensador1.add(boliquesos);
        dispensador1.add(speedMax);
        dispensador1.add(bocadillo);
        Dispensadora dispensador = new Dispensadora (dispensador1);
        for (int i=0; i< dispensador.getProductos().size(); i++){
            System.out.println(dispensador.getProductos().get(i).getCantidadActual());
        }

        for (int i=0; i< dispensador.getProductos().size(); i++){
            System.out.println(dispensador.getProductos().get(i).getCantidadActual());
        }


        boolean a;
        a= dispensador.sacarProducto("b4");
        if (a==false){
            System.out.println("este producto esta agotado o no existe");
        }
        List<String> ago = new ArrayList<>();
        ago= dispensador.productosAgotados();
        if(ago.size()==0){
            System.out.println("no hay productos agotados");
        }
        else {
            System.out.println("los productos agotados son: ");
            System.out.println("----------------------------------");
            for (String k : ago){
                System.out.println(k);
            }
        }
        Producto consul = new Producto("JI",0,"j1",99);
        consul.setCantidadActual(dispensador.consultarCantidad("b9").getCantidadActual());
        consul.setNombre(dispensador.consultarCantidad("b2").getNombre());
        if(consul.getCantidadActual()==99){
            System.out.println("este producto esta agotado");
        }
        else {
            System.out.println("la cantidad de el prodcuto "+ consul.getNombre()+ " es: "+ consul.getCantidadActual());
        }
        List<Producto> ai= new ArrayList<>();
        ai = dispensador.consultarTodasUnidades();
        if (ai.size()==0){
            System.out.println("no hay poroductos para mostrar");
        }
        else {
            System.out.println("la cantidad de productos es: ");
            System.out.println("--------------------------------");
            for (Producto pr : ai){
                System.out.println(" -el producto "+ pr.getNombre()+ " es: "+ pr.getCantidadActual());
            }
        }
        boolean aumenta;
        aumenta = dispensador.aumentarCantidades(3,"b2");
        if (aumenta==false){
            System.out.println("no puede agregar esta cantidad ya sea porque sobrepasa l cantidad maxima o el pro producto no existe");
        }else {
            System.out.println("aumento realizado");
        }












    }
}
