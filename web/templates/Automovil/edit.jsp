
<%@page import="ModeloDTO.VehiculoDTO"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
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
                    VehiculoDAO dao = new VehiculoDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idVehiculo"));
                    System.out.println(id);
                    VehiculoDTO p = (VehiculoDTO) dao.list(id);
                %>
                <h1>Modificar Vehiculo</h1>
                <form action="controllerVehiculo">
                    Matricula:<br>
                    <input class="form-control" type="text" name="txtMatricula" value="<%= p.getMatricula() %>"><br>
                    Descripcion:<br>
                    <input class="form-control" type="text" name="txtDescripcion" value="<%= p.getDescripcion()%>"><br>
                    Marca: <br>
                    <input class="form-control" type="text" name="txtMarca" value="<%= p.getMarca() %>"><br>
                    Modelo:<br>
                    <input class="form-control" type="text" name="txtModelo" value="<%= p.getModelo() %>"><br>
                    Color: <br>
                    <input class="form-control" type="text" name="txtColor" value="<%= p.getColor() %>"><br>
                    Tarifa:<br>
                    <input class="form-control" type="text" name="txtTarifa" value="<%= p.getTarifa()%>"><br>
                    Imagen URL:<br>
                    <input class="form-control" type="text" name="txtIMG" value="<%= p.getImg()%>"><br>
                    Categoria:
                    <select class="form-control" name="categoria">
                        <option value="<%=p.getCategoria().getIdCategoria()%>"><%=p.getCategoria().getClaseAutomovil()%></option>
                    </select>
                    <br>
                    <input type="hidden" name="txtID" value="<%= p.getId() %>">
                    <input class="btn btn-success" type="submit" name="accion" value="Actualizar"> 
                    <a class="btn btn-info" href="controllerVehiculo?accion=listar">Regresar</a><br>
                    <br>
                    <br>
                    <br>
                </form>
            </div>
        </div>
    </body>
</html>
