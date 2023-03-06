package Capa_Negocio;
import java.util.ArrayList;
import java.sql.*;
import Capa_Datos.RealG;


public class DatosT {
    private String Nombre;
    private int Cedula;
    private int Celular; 
    private String Direccion; 
    
    
 public String AgregarCliente()
    {
        RealG objmod=new RealG();
        String cad  ="insert into cliente value(´"+this.getNombre()+"´,´"+this.getCedula()+"´,´"+this.getCelular()+"´,´"+this.getDireccion()+"´)";
        return objmod.Ejecutar(cad);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
}
