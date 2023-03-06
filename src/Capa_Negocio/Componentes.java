package Capa_Negocio;
import java.util.ArrayList;
import java.sql.*;
import Capa_Datos.RealG;

public class Componentes 
{
    private String componente;
    private int precio;
    
    public String EliminarArticulo(){
        
        RealG objmod=new RealG();
        String cad="delete from mod where componente='"+this.getComponente()+"'";
        return objmod.Ejecutar(cad);
            
    }
            
    public ArrayList<Componentes> ListaArticulos()
    {
        ArrayList lista4 = new ArrayList();
        try
        {
            RealG objmod = new RealG();
            ResultSet tabla = objmod.Listar("select * from mods");
            Componentes objart;
            while(tabla.next())
                {
                    objart = new Componentes();
                    objart.setComponente(tabla.getString("componente"));
                    objart.setPrecio(tabla.getInt("precio"));
                    lista4.add(objart);
                }
        }
        catch(SQLException e)
            {
                javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            }
        return lista4;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
