<%-- 
    Document   : add
    Created on : 30-ago-2018, 19:58:16
    Author     : 
--%>

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
                <h1>Agregar Cliente</h1>
                <form action="Controlador">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtNombre"><br>
                    Cedula: <br>
                    <input class="form-control" type="text" name="txtCedula"><br>
                    Telefono:<br>
                    <input class="form-control" type="text" name="txtTelefono"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtDireccion"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
