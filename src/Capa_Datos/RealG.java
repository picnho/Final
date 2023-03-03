package Capa_Datos;
import java.sql.*;


public class RealG 
{
    private final String url = "jdbc:mysql://localhost:3306/realg";
    private final String user = "root";
    private final String pwd = "@fF.K_JsreC9R0PJ";
    
    public RealG()
    {}
    
    public ResultSet Listar(String Cad)
    {
        try
        {
            Connection cn = DriverManager.getConnection(url, user, pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            ResultSet tbl = da.executeQuery();
            return tbl;
        }
        catch(SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public String Ejecutar(String Cad)
    {
        try
        {
            Connection cn = DriverManager.getConnection(url, user, pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            int r = da.executeUpdate();
            return "Se afectaron " + r + "filas";
        }
        catch(SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return "Error" + e.getMessage();
        }
    }
    
}
