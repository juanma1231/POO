package ahorcado.dominio;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static ahorcado.dominio.Menu.menuComplejidad;
import static ahorcado.dominio.Menu.menuInicial;

public class Operaciones {

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    Palabras palabras;
    public static int victorias=0, derrotas=0;



    public static void ingreso() {
        String correo;
        System.out.println("ingrese el usuario");
        correo = sc.nextLine();
        for (Usuario a : usuarios) {
            if (Usuario.getCorreo().equals(correo)) {
                System.out.println("bienvenido " + Usuario.getCorreo());
                int b = 0;
                menuInicial();
                b = sc.nextInt();
                while (b != 2) {
                    if (b == 1) {
                        int c = 0;
                        menuComplejidad();
                        c = sc.nextInt();
                        switch (c) {
                            case 1: {
                                palabraBaja();
                                break;
                            }
                            case 2: {
                                palabraMedia();
                                break;

                            }
                            case 3: {
                                palabraAlta();
                                break;

                            }

                        }

                    }

                }

            }
        }
    }
    public static void registro() {
        String correo;


        System.out.println("ingrese el corre");
        correo = sc.nextLine();



        Usuario registro = new Usuario(correo);
        usuarios.add(registro);

    }
    public static void palabraAlta(){
        int intentos= 3;


    }
    public static void palabraMedia(){
        int intentos=5;

    }
    public static void palabraBaja(){
        int intentos=9;

    }

}
