
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDTO.VehiculoDTO"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
            <h1>Vehiculos</h1>
            <a class="btn btn-success" href="controllerVehiculo?accion=add">Agregar Nuevo </a> <a class="btn btn-info" href="index.jsp"> Regresar</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">MATRICULA</th>
                        <th class="text-center">MARCA</th>
                        <th class="text-center">MODELO</th>
                        <th class="text-center">COLOR</th>
                        <th class="text-center">IMG</th>
                        <th class="text-center">TARIFA</th>
                        <th class="text-center">DISPONIBILIDAD</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    VehiculoDAO dao = new VehiculoDAO();
                    ArrayList<VehiculoDTO> vehiculos=dao.listar();
                    for(VehiculoDTO per : vehiculos){
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getId()%></td>
                        <td class="text-center"><%= per.getMatricula()%></td>
                        <td class="text-center"><%= per.getMarca()%></td>
                        <td class="text-center"><%= per.getModelo()%></td>
                        <td class="text-center"><%= per.getColor()%></td>
                        <td class="text-center"><%= per.getImg()%></td>
                        <td class="text-center"><%= per.getTarifa()%></td>
                        <td class="text-center"><%= per.getDisponible()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="controllerVehiculo?accion=editar&id=<%= per.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="controllerVehiculo?accion=eliminar&id=<%= per.getId()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
