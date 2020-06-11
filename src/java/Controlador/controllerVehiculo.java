/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.VehiculoDAO;
import ModeloDTO.CategoriaDTO;
import ModeloDTO.VehiculoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YorgenGalvis
 */
public class controllerVehiculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String listar="templates/Automovil/listar.jsp";
    String add = "templates/Automovil/add.jsp";
    String edit = "templates/Automovil/edit.jsp";
    VehiculoDAO dao=new VehiculoDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controllerVehiculo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controllerVehiculo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("accion");
        String acceso="";
        if(action.equals("listar")){
           acceso=listar;
        }else if (action.equals("add")) {
            acceso = add;
        }else if(action.equals("editar")){
            request.setAttribute("idVehiculo", request.getParameter("id"));
            acceso = edit;    
        }else if(action.equals("Actualizar")){
           int id = Integer.parseInt(request.getParameter("txtID"));
           String matricula=request.getParameter("txtMatricula");
           String marca=request.getParameter("txtMarca");
           String modelo=request.getParameter("txtModelo");
           String color=request.getParameter("txtColor");
           int categoria=Integer.parseInt(request.getParameter("categoria"));
           String descripcion=request.getParameter("txtDescripcion");
           Double tarifa=Double.parseDouble(request.getParameter("txtTarifa"));
           String foto=request.getParameter("txtIMG");
           VehiculoDTO ve=new VehiculoDTO();
           ve.setId(id);
           ve.setImg(foto);
           ve.setMatricula(matricula);
           ve.setMarca(marca);
           ve.setModelo(modelo);
           ve.setColor(color);
           ve.setTarifa(tarifa);
           ve.setDescripcion(descripcion);
           ve.setCategoria(new CategoriaDTO(categoria,""));
           dao.edit(ve);
           acceso=listar;
        }else if(action.equals("eliminar")){
           int id=Integer.parseInt(request.getParameter("id"));
            dao.eliminar(id);
            acceso=listar;
        }else if(action.equals("Agregar")){
            String matricula=request.getParameter("txtMatricula");
           String marca=request.getParameter("txtMarca");
           String modelo=request.getParameter("txtModelo");
           String color=request.getParameter("txtColor");
           int categoria=Integer.parseInt(request.getParameter("categoria"));
           String descripcion=request.getParameter("txtDescripcion");
           Double tarifa=Double.parseDouble(request.getParameter("txtTarifa"));
           String foto=request.getParameter("txtIMG");
           VehiculoDTO ve=new VehiculoDTO();
           ve.setImg(foto);
           ve.setMatricula(matricula);
           ve.setMarca(marca);
           ve.setModelo(modelo);
           ve.setColor(color);
           ve.setTarifa(tarifa);
           ve.setDescripcion(descripcion);
           ve.setCategoria(new CategoriaDTO(categoria,""));
           dao.add(ve);
           acceso=listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
