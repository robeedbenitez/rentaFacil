package org.apache.jsp.templates.Automovil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDTO.VehiculoDTO;
import ModeloDAO.VehiculoDAO;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                ");

                    VehiculoDAO dao = new VehiculoDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idVehiculo"));
                    VehiculoDTO p = (VehiculoDTO) dao.list(id);
                
      out.write("\n");
      out.write("                <h1>Modificar Vehiculo</h1>\n");
      out.write("                <form action=\"ControladorVehiculo\">\n");
      out.write("                    Matricula:<br>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtNombre\" value=\"");
      out.print( p.getMatricula() );
      out.write("\"><br>\n");
      out.write("                    Marca: <br>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtCedula\" value=\"");
      out.print( p.getMarca() );
      out.write("\"><br>\n");
      out.write("                    Modelo:<br>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtTelefono\" value=\"");
      out.print( p.getModelo() );
      out.write("\"><br>\n");
      out.write("                    Color: <br>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"txtDireccion\" value=\"");
      out.print( p.getColor() );
      out.write("\"><br>\n");
      out.write("                    <input type=\"hidden\" name=\"txtMatricula\" value=\"");
      out.print( p.getMatricula() );
      out.write("\">\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Actualizar\"> \n");
      out.write("                    <a href=\"ControladorVehiculo?accion=listar\">Regresar</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
