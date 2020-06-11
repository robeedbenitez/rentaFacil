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
                <h1>Agregar Vehiculo</h1>
                <form action="controllerVehiculo">
                    Matricula:<br>
                    <input class="form-control" type="text" name="txtMatricula"><br>
                    Descripcion:<br>
                    <input class="form-control" type="text" name="txtDescripcion"><br>
                    Marca: <br>
                    <input class="form-control" type="text" name="txtMarca"><br>
                    Modelo:<br>
                    <input class="form-control" type="text" name="txtModelo"><br>
                    Color: <br>
                    <input class="form-control" type="text" name="txtColor"><br>
                    Tarifa:<br>
                    <input class="form-control" type="text" name="txtTarifa"><br>
                    Imagen URL:<br>
                    <input class="form-control" type="text" name="txtIMG"><br>
                    Categoria:
                    <select class="form-control" name="categoria">
                        <option value="1">Economico</option>
                        <option value="1">Medio</option>
                        <option value="1">Alto</option>
                    </select>
                    <br>
                    <input class="btn btn-success" type="submit" name="accion" value="Agregar"> 
                    <a class="btn btn-info" href="controllerVehiculo?accion=listar">Regresar</a><br>
                    <br>
                    <br>
                    <br>
                </form>
            </div>
        </div>
    </body>
</html>
