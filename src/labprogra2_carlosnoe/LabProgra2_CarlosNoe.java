/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprogra2_carlosnoe;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cd507
 */
public class LabProgra2_CarlosNoe {

    /**
     * @param args the command line arguments
     */
    public static int AnioNac;
    public static int MesNac;
    public static int DiaNac;
    public static String Contrasenya;
    public static String Correo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ints = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

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
                            String Nombre = sc1.nextLine();
                            System.out.println("Ingrese su apellido");

                            sc1 = new Scanner(System.in);
                            String Apellido = sc1.nextLine();

                            sc = new Scanner(System.in);
                            ints = new Scanner(System.in);
                            sc1 = new Scanner(System.in);
                            for (int j = 0; j < 1; j++) {
                                System.out.println("Ingrese el Ano de nac");
                                AnioNac = ints.nextInt();
                                System.out.println("Ingrese el mes");
                                MesNac = ints.nextInt();
                                System.out.println("Ingrese el dia");
                                DiaNac = ints.nextInt();

                                if ((AnioNac < 2013) && (AnioNac > 0) && (MesNac < 13) && (MesNac > 0) && (DiaNac < 32) && (DiaNac > 0)) {
                                    j++;
                                    Date Fecha = new Date(AnioNac, MesNac, DiaNac);
                                } else {
                                    System.out.println("Fecha Invalida");
                                    j--;
                                }
                            }
                            Date c = new Date(AnioNac - 1900, MesNac - 1, DiaNac);
                            boolean zero = true;
                            boolean pam = true;
                            
                            
                            for (int j = 0; j < 1; j++) {
                                System.out.println("Ingrese su Correo");
                                Correo = sc.nextLine();
                                boolean l= Correo( Correo);
//                                Valid = CorreosInvalidos(Correo);
//                                Valid = VerificadorCorreos(Correo, UsU);
                                for (int a = 0; a < Correo.length() - 1; a++) {
                                    char C = Correo.charAt(i);
                                    int o = C;
                                    if ((o == 36) && (o == 37) && (o == 38) && (o == 45) && (o >= 64) || (o <= 90) && (o >= 97) || (o <= 122)) {
                                    } else {
                                        pam = false;
                                        System.out.println("Contra Invalida");
                                    }
                                }
                                for (int k = 0; k < UsU.size(); k++) {
                                    if (Correo.equalsIgnoreCase(UsU.get(i).getCorreoE())) {
                                        zero = true;
                                    } else {
                                        zero = false;
                                    }
                                }

                                if (pam = false) {
                                    j--;
                                } else {
                                    j++;
                                }
                                if (zero = false) {
                                    j--;
                                } else {
                                    j++;
                                }

                            }
                            boolean Remid = true;
                            for (int j = 0; j < 1; j++) {
                                System.out.println("Ingrese su Contrasenya");
                                Contrasenya = sc.nextLine();
                                if (Contrasenya.length()<8) {
                                    Remid= false;
                                }
                                Remid=Contra(Contrasenya);
                                
                                if (Remid = true) {
                                    j++;
                                } else {
                                    j--;
                                    System.out.println("Contrasenya Invalida");
                                }
                            }
                            Usuarios NewU = new Usuarios(Nombre, Apellido, c, Correo, Contrasenya);
                            UsU.add(NewU);
                        }

                        break;
                    case 2:
                        for (int i = 0; i < UsU.size(); i++) {
                            System.out.println(UsU.get(i).toString());
                        }
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
    
    public static boolean Correo(String Correo){
        String regex= "^[a-zA-Z0-9._%&$+-]+ @[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern= Pattern.compile(regex);
        System.out.println(regex);
        Matcher matcher= pattern.matcher(Correo);
        System.out.println(matcher);
        return matcher.matches();
        
    }
    public static boolean Contra(String contra){
        String regex = "^[a-zA-Z0-9._%&$+-?<>!]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contra);
        return matcher.matches();
    }

}
