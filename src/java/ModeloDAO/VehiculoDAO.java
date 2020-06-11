package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import ModeloDTO.CategoriaDTO;
import ModeloDTO.PersonaDTO;
import ModeloDTO.VehiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    VehiculoDTO p = new VehiculoDTO();

    @Override
    public ArrayList<VehiculoDTO> listar() {
        ArrayList<VehiculoDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM vehiculo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                CategoriaDAO ca=new CategoriaDAO();
                VehiculoDTO v=new VehiculoDTO(rs.getInt("idVehiculo"),rs.getString("matricula"),rs.getString("marca"),rs.getString("modelo"),rs.getString("descripcion"),rs.getString("color"),rs.getString("img"),rs.getDouble("tarifa"),rs.getInt("disponibilidad"),ca.get(rs.getInt("idCategoria")));
                list.add(v);
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Object list(int a) {
    String sql="SELECT * FROM `vehiculo` WHERE `idVehiculo`="+a;  
    try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            VehiculoDTO vehi=null;
            while (rs.next()) {
                CategoriaDAO ca=new CategoriaDAO();
                vehi=new VehiculoDTO(rs.getInt("idVehiculo"),rs.getString("matricula"),rs.getString("marca"),rs.getString("modelo"),rs.getString("descripcion"), rs.getString("color"),rs.getString("img"), rs.getDouble("tarifa"),rs.getInt("disponibilidad"),ca.get(rs.getInt("idCategoria")));
            }
            return vehi;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    return null;
    }

    @Override
    public boolean add(Object a) {
        VehiculoDTO ve=(VehiculoDTO)a;
       String sql="INSERT INTO `vehiculo`(`matricula`, `marca`, `modelo`, `color`, `descripcion`, `img`, `tarifa`, `disponibilidad`, `idCategoria`) VALUES (?,?,?,?,?,?,?,?,?)";
       try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,ve.getMatricula());
            ps.setString(2,ve.getMarca());
            ps.setString(3,ve.getModelo());
            ps.setString(4,ve.getColor());
            ps.setString(5,ve.getDescripcion());
            ps.setString(6,ve.getImg());
            ps.setDouble(7, ve.getTarifa());
            ps.setInt(8, 1);
            ps.setInt(9, ve.getCategoria().getIdCategoria());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return false;
    }

    @Override
    public boolean edit(Object a) {
        VehiculoDTO vehi=(VehiculoDTO) a;
       String sql="UPDATE `vehiculo` SET `matricula`='"+vehi.getMatricula()+"',`marca`='"+vehi.getMarca()+"',`modelo`='"+vehi.getModelo()+"',`color`='"+vehi.getColor()+"',`descripcion`='"+vehi.getDescripcion()+"',`img`='"+vehi.getImg()+"',`tarifa`='"+vehi.getTarifa()+"',`idCategoria`='"+vehi.getCategoria().getIdCategoria()+"' WHERE `idVehiculo`="+vehi.getId();
       try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return false;
    }

    @Override
    public boolean eliminar(int a) {
       String sql="DELETE FROM `vehiculo` WHERE `idVehiculo`="+a;
         try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return false;}

    
}
