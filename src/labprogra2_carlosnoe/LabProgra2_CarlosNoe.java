/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprogra2_carlosnoe;

import java.util.ArrayList;
import java.util.Date;
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
        Scanner ints = new Scanner(System.in);
        ArrayList<Usuarios> UsU = new ArrayList();
        boolean Bandera = true;
        while (Bandera != false) {
            System.out.println("--Bienvenido al menu-- \n"
                    + "Escriba '1' Si quiere Ingresar Registrar Usuarios\n"
                    + "Escriba '2' Listar Todo  \n"
                    + "Escriba '3' Listar por dominio \n"
                    + "Escriba '4' para salir");
            int NOM = sc.nextInt();
            if ((NOM > 0) && (NOM < 5)) {
                switch (NOM) {
                    case 1:
                        boolean Valid;
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Registrar Usuarios ");
                            System.out.println("Ingrese su nombre");
                            String Nombre = sc.nextLine();
                            System.out.println("Ingrese su apellido");
                            String Apellido = sc.nextLine();

                            for (int j = 0; j < 1; j++) {

                                int AnioNac = ints.nextInt();
                                int MesNac = ints.nextInt();
                                int DiaNac = ints.nextInt();

                                if ((AnioNac < 2013) || (AnioNac < 0) || (MesNac < 13) || (AnioNac < 0) || (DiaNac < 32) || (DiaNac < 0)) {
                                    j++;
                                    Date Fecha = new Date(AnioNac, MesNac, DiaNac);
                                    System.out.println("1");
                                } else {
                                    System.out.println("Fecha Invalida");
                                    j--;
                                }
                            }
                            for (int j = 0; j < 1; j++) {

                                System.out.println("Ingrese su Correo");
                                String Correo = sc.nextLine();
                                Valid = CorreosInvalidos(Correo);
                                Valid=VerificadorCorreos( Correo,  UsU);
                                if (Valid = true) {
                                    j++;
                                } else {
                                    j--;
                                    System.out.println("Correo Invalido");
                                }
                            }
                            System.out.println("Ingrese su Contrasenya");
                            String Contrasenya = sc.nextLine();

                        }

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        Bandera = false;
                        break;
                }

            } else {

            }
        }

    }

    public static boolean CorreosInvalidos(String Correo) {
        boolean Valid = true;
        for (int i = 0; i < Correo.length() - 1; i++) {
            char C = Correo.charAt(i);
            int o = C;
            if ((o == 36) && (o == 37) && (o == 38) && (o == 45) && (o >= 64) && (o <= 90) && (o >= 97) && (o <= 122)) {
                Valid = true;

            } else {
                Valid = false;
            }
        }
        //45, 95, 38, 36, 37, 65->90 97->122
        return Valid;
    }

    public static boolean VerificadorCorreos(String correo, ArrayList<Usuarios> Lista) {
        boolean Valid = true;
        for (int i = 0; i < Lista.size(); i++) {
            if (correo.equalsIgnoreCase(Lista.get(i).getCorreoE())) {
                Valid = true;
            } else {
                Valid = false;
            }
        }

        return Valid; // Si sale y esta mal aqui

    }

}
