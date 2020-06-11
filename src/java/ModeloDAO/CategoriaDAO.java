/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import ModeloDTO.CategoriaDTO;
import java.sql.*;
/**
 *
 * @author YorgenGalvis
 */
public class CategoriaDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public CategoriaDTO get(int id){
        String sql="SELECT * FROM categoria WHERE idCategoria="+id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            CategoriaDTO devuelve=new CategoriaDTO();
            while (rs.next()) {
                devuelve.setIdCategoria(id);
                devuelve.setClaseAutomovil(rs.getString("claseAutomovil"));
                devuelve.setCantAutmoviles(rs.getInt("cantAutmoviles"));
            }
            return devuelve;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    
}
