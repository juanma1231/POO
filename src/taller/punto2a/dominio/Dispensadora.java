package taller.punto2a.dominio;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Dispensadora {
    private List<Producto> productos= new ArrayList<>();
    private int cantidadMaximaP=10;
    private String color;
    private String marca;

    public Dispensadora(List<Producto> productos) {
        if (productos.size()<=cantidadMaximaP){
            this.productos = productos;
        }

    }

    public boolean sacarProducto(String a) {
        int contador=0;
        for (Producto producto : this.productos){
            if (producto.getNombre()==a || producto.getCodigo()== a){
                if (producto.getCantidadActual()>0){
                    producto.setCantidadActual((int) (producto.getCantidadActual()-1));
                    contador=contador+1;
                    return true;
                }

            }
        }
        if (contador==0){

            return false;

        }
        return true;

    }
    public List<String> productosAgotados(){
        List<String> pro = new ArrayList<>();
        for (Producto producto : this.productos){
            if (producto.getCantidadActual() == 0){
                pro.add(producto.getNombre());
            }
        }
        return pro;
    }
    public Producto consultarCantidad(String a){
        for (Producto producto : this.productos){
            if (producto.getNombre()==a || producto.getCodigo()== a){
                return producto;
            }
        }
        Producto ai = new Producto("kk",00,"b0",99);
        return ai;
    }
    public List<Producto> consultarTodasUnidades(){
        return productos;

    }
    public boolean aumentarCantidades(int cantidad, String b){
        int contador = 0;
        for (Producto producto : this.productos){
            if (producto.getNombre()== b || producto.getCodigo()== b){
                if (producto.getCantidadActual() + cantidad <= producto.getCantidadMaxima()){
                    producto.setCantidadActual((int) (producto.getCantidadActual()+cantidad));
                    contador = contador +1;
                    return true;
                }

            }
        }
        if (contador==0){
            return  false;
        }
        return true;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

