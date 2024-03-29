package labprogra2_carlosnoe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuarios {

    public String Nombre;
    public String Apellido;
    public Date Fecha;
    public String CorreoE;
    public String Contrasenya;

    public Usuarios() {
    }

    public Usuarios(String Nombre, String Apellido, Date Fecha, String CorreoE, String Contrasenya) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha = Fecha;
        this.CorreoE = CorreoE;
        this.Contrasenya = Contrasenya;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    @Override
    public String toString() {
        SimpleDateFormat one = new SimpleDateFormat("dd/MM/yyyy");
        Date Hoy=new Date();
        int Year1=Fecha.getYear();
        int Year2= Hoy.getYear();
        
        int Month1=Fecha.getMonth();
        int Month2= Hoy.getMonth();
         
        int Day1=Fecha.getDay();
        int Day2= Hoy.getDay();
        
        int NovoY=Year2-Year1;
        int NovoM=Month2-Month1;
        
        int NovoDays= Day2-Day1;
        
        return "Nombre=" + Nombre + "\n"
                + "Apellido=" + Apellido + "\n"
                + "Tienen= "+NovoY+"Anios, "+NovoM+ "Meses,"+NovoDays +"Dias"+ "\n"
                + "CorreoE=" + CorreoE + "\n"
                + "Contrasenya=" + Contrasenya;
    }

}
