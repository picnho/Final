package Capa_Negocio;
import java.util.ArrayList;
import java.sql.*;
import Capa_Datos.RealG;

public class Carros {
    private String Marca;
    
     
    
    
    
 public String AgregarCarro(){
     RealG objmod=new RealG();
     String cad  ="insert into carro value(´"+this.getMarca()+"´)";
     return objmod.Ejecutar(cad);
 }
 public ArrayList<Clientes> listaCarros()
    {
        ArrayList lista3=new ArrayList();
        try
        {
           RealG objmod=new RealG();
           ResultSet tabla=objmod.Listar("select * from carro");
           Carros objcar;
           while(tabla.next())
           {
               objcar=new Carros();
               objcar.setMarca(tabla.getString("Marca"));
               lista3.add(objcar);
           }
        }
        catch(SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lista3;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    

    

    
  
    
}
