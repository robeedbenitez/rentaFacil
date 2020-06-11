
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDTO.PersonaDTO"%>
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
            <h1>Clientes</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a> <a class="btn btn-info" href="index.jsp">Regresar</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">CEDULA</th>
                        <th class="text-center">TELEFONO</th>
                        <th class="text-center">DIRECCION</th>
                        <th class="text-center">IDRESERVA</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PersonaDAO dao = new PersonaDAO();
                    List<PersonaDTO> list = dao.listar();
                    Iterator<PersonaDTO> iter = list.iterator();
                    PersonaDTO per = null;
                    while (iter.hasNext()) {
                        per = iter.next();
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getIdCliente()%></td>
                        <td class="text-center"><%= per.getNombre()%></td>
                        <td class="text-center"><%= per.getCedula()%></td>
                        <td class="text-center"><%= per.getTelefono()%></td>
                        <td class="text-center"><%= per.getDireccion()%></td>
                        <td class="text-center"><%= per.getIdReserva() %></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= per.getIdCliente()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getIdCliente()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
