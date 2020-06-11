
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <%
                    PersonaDAO dao = new PersonaDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idCliente"));
                    Persona p = (Persona) dao.list(id);
                %>
                <h1>Modificar Cliente</h1>
                <form action="Controlador">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtNombre" value="<%= p.getNombre()%>"><br>
                    Cedula: <br>
                    <input class="form-control" type="text" name="txtCedula" value="<%= p.getCedula()%>"><br>
                    Telefono:<br>
                    <input class="form-control" type="text" name="txtTelefono" value="<%= p.getTelefono()%>"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtDireccion" value="<%= p.getDireccion()%>"><br>
                    <input type="hidden" name="txtId" value="<%= p.getId()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
