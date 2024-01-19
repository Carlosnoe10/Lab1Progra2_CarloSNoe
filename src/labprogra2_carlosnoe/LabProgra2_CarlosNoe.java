/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprogra2_carlosnoe;

import java.util.Scanner;

/**
 *
 * @author cd507
 */
public class LabProgra2_CarlosNoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Bandera = true;
        while (Bandera != false) {
            System.out.println("--Bienvenido al menu-- \n"
                    + "Escriba '1' Si quiere Ingresar Registrar Usuarios\n"
                    + "Escriba '2' Listar Todo  \n"
                    + "Escriba '3' Listar por dominio \n"
                    + "Escriba '4' para salir");
            int NOM = sc.nextInt();
            if ((NOM > 0) && (NOM < 7)) {
                switch (NOM) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        Bandera=false;
                        break;
                }

            } else {

            }
        }

    }
}
