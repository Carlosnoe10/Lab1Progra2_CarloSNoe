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
                                Valid = VeriContra(Contrasenya);
                                int NumMayus = 0;
                                int NumMenus = 0;
                                int NumNum = 0;
                                int Caracteres = 0;
                                for (int r = 0; r < Contrasenya.length() - 1; r++) {
                                    char C = Contrasenya.charAt(i);
                                    int o = C;
                                    if ((o == 33) && (o == 36) && (o == 37) && (o == 60) && (o == 62) && (o == 63)) {
                                        Caracteres = Caracteres + 1;
                                    } else if ((o >= 65) && (o <= 90)) {
                                        NumMayus = NumMayus + 1;
                                    } else if ((o >= 97) && (o <= 122)) {
                                        NumMenus = NumMenus + 1;
                                    } else if ((o >= 48) && (o <= 57)) {
                                        NumNum = NumNum + 1;
                                    } else {

                                    }
                                }
                                if ((NumMayus > 0) && (Caracteres > 0) && (NumMenus > 0) && (NumNum > 0)) {
                                    Remid = true;
                                } else {
                                    Remid = false;
                                }
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

    public static boolean VeriContra(String Contra) {
        boolean Valid = true;
        int NumMayus = 0;
        int NumMenus = 0;
        int NumNum = 0;
        int Caracteres = 0;
        for (int i = 0; i < Contra.length() - 1; i++) {
            char C = Contra.charAt(i);
            int o = C;
            if ((o == 33) && (o == 36) && (o == 37) && (o == 60) && (o == 62) && (o == 63)) {
                Caracteres = Caracteres + 1;
            } else if ((o >= 65) && (o <= 90)) {
                NumMayus = NumMayus + 1;
            } else if ((o >= 97) && (o <= 122)) {
                NumMenus = NumMenus + 1;
            } else if ((o >= 48) && (o <= 57)) {
                NumNum = NumNum + 1;
            } else {
                return Valid = false;
            }
        }
        if ((NumMayus > 0) && (Caracteres > 0) && (NumMenus > 0) && (NumNum > 0)) {
            Valid = true;
        } else {
            Valid = false;
        }
//33, 60, 62, 36, 37, 63
        return Valid;
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
