package ahorcado.app;

import ahorcado.dominio.Operaciones;

import java.util.ArrayList;
import java.util.Scanner;

import static ahorcado.dominio.Menu.menuInicial;
import static ahorcado.dominio.Menu.menuInicio;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        menuInicio();
        opcion = sc.nextInt();
        while(opcion != 3){
            if(opcion==1){
                Operaciones.ingreso();
            }
            else if(opcion==2){
                Operaciones.registro();
            }
        }

    }



}
