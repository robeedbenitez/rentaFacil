package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import ModeloDTO.PersonaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    PersonaDTO p = new PersonaDTO();

    @Override
    public List listar() {
        ArrayList<PersonaDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PersonaDTO per = new PersonaDTO();
                per.setIdCliente(rs.getInt("idCliente"));
                per.setNombre(rs.getString("nombre"));
                per.setCedula(rs.getString("cedula"));
                per.setTelefono(rs.getString("telefono"));
                per.setDireccion(rs.getString("direccion"));
                per.setIdReserva(rs.getInt("idReserva"));
                list.add(per);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public PersonaDTO list(int id) {
        String sql = "SELECT * FROM cliente WHERE idCliente=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setNombre(rs.getString("nombre"));
                p.setCedula(rs.getString("cedula"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException e) {
        }
        return p;
    }

    @Override
    public boolean add(Object a) {
        PersonaDTO cliente = (PersonaDTO) (a);
        String sql = "INSERT INTO cliente(`nombre`, `cedula`, `telefono`, `direccion`)values('" + cliente.getNombre() + "','" + cliente.getCedula() + "','" + cliente.getTelefono() + "','" + cliente.getDireccion() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean edit(Object a) {
        PersonaDTO cliente = (PersonaDTO) (a);
        String sql = "UPDATE cliente SET nombre='"+cliente.getNombre()+"',cedula='"+cliente.getCedula()+"',telefono='"+cliente.getTelefono()+"',direccion='"+cliente.getDireccion()+"' WHERE idCliente='"+cliente.getIdCliente()+"'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE idCliente=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }
}
