package taller.punto2a.dominio;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Dispensadora {
    private List<Producto> productos= new ArrayList<>();
    private int cantidadMaximaP;



    public void sacarProducto(String a) {
        int contador=0;
        for (Producto producto : this.productos){
            if (producto.getNombre()==a || producto.getCodigo()== a){
                if (producto.getCantidadActual()>0){
                    producto.setCantidadActual((int) (producto.getCantidadActual()-1));
                    contador=contador+1;
                }
                else System.out.println("este prodcuto ya esta agotado");
                contador = contador +1;
            }
        }
        if (contador==0){
            System.out.println("este producto no existe");
        }

    }
    public void productosAgotados(){
        System.out.println("estos productos están agotados:");
        for (Producto producto : this.productos){
            if (producto.getCantidadActual() == 0){
                System.out.println("-"+ producto.getNombre());
            }
        }
    }
    public void consultarCantidad(String a){
        for (Producto producto : this.productos){
            if (producto.getNombre()==a || producto.getCodigo()== a){
                System.out.println("la cantidad de el producto "+producto.getNombre()+" es: "+ producto.getCantidadActual());
            }
        }
    }
    public void consultarTodasUnidades(){
        for (Producto producto : this.productos){
            System.out.println("la cantidad de "+ producto.getNombre()+" es: "+ producto.getCantidadActual());
        }
    }
    public void aumentarCantidades(int cantidad, String b){
        int contador = 0;
        for (Producto producto : this.productos){
            if (producto.getNombre()== b || producto.getCodigo()== b){
                if (producto.getCantidadActual() + cantidad <= producto.getCantidadMaxima()){
                    producto.setCantidadActual((int) (producto.getCantidadActual()+cantidad));
                    contador = contador +1;
                }
                else System.out.println("la cantidad que desea ingresar sobrepasa la capacidad maxima de este producto");
                contador= contador+1;
            }
        }
        if (contador==0){
            System.out.println("ese producto no existe");
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

