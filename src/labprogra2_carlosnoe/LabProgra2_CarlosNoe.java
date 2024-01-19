/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprogra2_carlosnoe;

import java.util.ArrayList;
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
        Scanner ints= new Scanner(System.in);
        ArrayList <Usuarios> UsU= new ArrayList();
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
                        for (int i = 0; i < 1; i++) {
                        System.out.println("Registrar Usuarios ");
                        System.out.println("Ingrese su nombre");
                        String Nombre= sc.nextLine();
                        System.out.println("Ingrese su apellido");
                        String Apellido= sc.nextLine();
                        
                        
                        
                        System.out.println("Ingrese su Correo");
                        String Correo= sc.nextLine();
                        System.out.println("Ingrese su apellido");
                        String Contrasenya= sc.nextLine();
                        }
                        
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
    
    public static boolean VerificadorCorreos(String correo, ArrayList<Usuarios> Lista){
        for (int i = 0; i < Lista.size(); i++) {
            if (correo.equalsIgnoreCase(Lista.get(i).getCorreoE())) {
                return true;
            }else{
                return false;
            }
        }
        return true; // Si sale y esta mal aqui
        
        
    }
    
}
