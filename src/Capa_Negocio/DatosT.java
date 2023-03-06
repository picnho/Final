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
 public ArrayList<DatosT> listaClientes()
    {
        ArrayList lista2=new ArrayList();
        try
        {
           RealG objmod=new RealG();
           ResultSet tabla=objmod.Listar("select * from cliente");
           DatosT objcli;
           while(tabla.next())
           {
               objcli=new DatosT();
               objcli.setNombre(tabla.getString("Nombre"));
               objcli.setCedula(tabla.getInt("Cedula"));
               objcli.setCelular(tabla.getInt("Celular"));
               objcli.setDireccion(tabla.getString("Direccion"));
               lista2.add(objcli);
           }
        }
        catch(SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lista2;
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
