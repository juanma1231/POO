package parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pooflix {
    public static final int CAPACIDAD = 15;
    private List<Material> materiales= new ArrayList<>();

    public Pooflix(List<Material> materiales) {
        this.materiales = materiales;
    }

    public boolean agregar(Material m){
        int contador = 0;
        for (Material j : materiales){
            if(m.getCodigo()== j.getCodigo()){
                contador=1;
            }
        }
        if(contador==0 && materiales.size()<=CAPACIDAD){
            materiales.add(m);
            return true;
        } else System.out.println("capacidad maxima o el este material ya existe");
        return false;
    }

    public boolean retirar(int codigo){
        Material elementoRetirar = null;
        for (Material j : materiales){
            if (codigo==j.getCodigo()){
                elementoRetirar= j;
                materiales.remove(elementoRetirar);
                return true;
            }
        }
        System.out.println("este codigo no existe");
        return false;
    }

    public Material buscar(int codigo){
        Material buscador= null;
        for (Material j: materiales){
            if(codigo== j.getCodigo()){
                buscador=j;
                return j;
            }
        }
        System.out.println("este codigo no existe");
        return null;

    }

    public Material buscar(String nombre){
        Material buscador2 = null;
        for (Material j : materiales){
            if (nombre.equalsIgnoreCase(j.getNombre())){
                buscador2 = j;
                return buscador2;
            }
        }
        System.out.println("este nombre no existe");
        return null;

    }

    public List<Material> buscarPorTipo(String tipo){
        List<Material> listaBuscada = new ArrayList<>();

        for (Material j : materiales){
            if (tipo.equalsIgnoreCase(j.getTipo())){
                listaBuscada.add(j);
            }
        }
        if(listaBuscada.size()>0){
            return listaBuscada;
        }
        System.out.println("no hay materiales de este tipo");
        return null;

    }

    public int calcularDuracion(){
        int duracionTotal= 0;
        for (Material j : materiales){
            duracionTotal= duracionTotal + j.getDuracion();
        }
        if (duracionTotal>0){
            return duracionTotal;
        }
        System.out.println("no hay materiales");
        return 0;
    }

    public List<Material> ordenarPorCodigo(){
        if (materiales.size()>0){
            materiales = materiales.stream().sorted(Comparator.comparingInt(Material::getCodigo)).collect(Collectors.toList());
            return materiales;
        }
        return null;

    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }
}
