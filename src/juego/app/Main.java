package juego.app;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> opcion = Arrays.asList("piedra", "papel", "tijeras");
        Random aleatorio = new Random();
        List<String> opciones = Arrays.asList("Ver instrucciones", "Jugar", "Ver resultados");
        boolean continuar = true;
        String opJuegO;
        int derrotas = 0;
        int victorias = 0;
        int empates = 0;

        while(continuar== true){
            int primero = JOptionPane.showOptionDialog(null, "¿que deseas hacer?", "Peso en planetas", 0,JOptionPane.QUESTION_MESSAGE,null, opciones.toArray(), null);
            if (primero==0){
                JOptionPane.showMessageDialog(null, "instrucciones: ambos eligen entre piedra papel o tijeras al mismo tiempo \n para saber quien gana se debe tener en cuneta esto: \n piedra le gana a tijeras. \n papel le gana a piedra. \n y tijeras le gana a piedra. \n si ambos eligen lo mismo se considera empate \n Reglas: la unica regla es que ambos deben elegir al mismo tiempo, exactamente al mismo tiempo.");


            }else if (primero==1){
                opJuegO = (String) JOptionPane.showInputDialog(null, "por favot seleeciona una opcion", "piedra papel o tijera", JOptionPane.QUESTION_MESSAGE, null, opcion.toArray(), "piedra");
                String alea = opcion.get(aleatorio.nextInt(opcion.size()));
                JOptionPane.showMessageDialog(null, "seleecionaste  "+ opJuegO);
                if (opJuegO== "piedra" && alea=="papel" ){
                    JOptionPane.showMessageDialog(null, "ganó la computadora" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    derrotas= derrotas+1;
                }else if(opJuegO=="piedra"&& alea=="tijeras"){
                    JOptionPane.showMessageDialog(null, "ganaste!!!" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    victorias = victorias + 1;
                }else if(opJuegO=="papel" && alea=="tijeras"){
                    JOptionPane.showMessageDialog(null, "ganó la computadora" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    derrotas = derrotas + 1;
                }else if(opJuegO== "papel"&& alea=="piedra"){
                    JOptionPane.showMessageDialog(null, "ganaste!!!" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    victorias = victorias +1;
                }else if(opJuegO=="tijeras"&& alea=="papel"){
                    JOptionPane.showMessageDialog(null, "ganaste!!" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    victorias = victorias + 1;
                }else if(opJuegO=="tijeras" && alea=="piedra"){
                    JOptionPane.showMessageDialog(null, "ganó la computadora" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    derrotas = derrotas +1;
                }else if(opJuegO=="piedra" && alea=="piedra"){
                    JOptionPane.showMessageDialog(null, "empate" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    empates = empates +1;
                }else if(opJuegO=="papel" && alea=="papel"){
                    JOptionPane.showMessageDialog(null, "empate" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    empates = empates + 1;
                }else if (opJuegO=="tijeras" && alea=="tijeras"){
                    JOptionPane.showMessageDialog(null, "empate" + "\n tu elegiste: "+ opJuegO + "\n y el computador: "+ alea );
                    empates = empates + 1;
                }



            }else if (primero == 2){
                JOptionPane.showMessageDialog(null, "tu: "+ victorias + " partidas ganadas"+ "\n computadora: "+ derrotas + " partidas ganadas"+ "\n empates: "+ empates);

            }else continuar=false;
        }







    }
}
