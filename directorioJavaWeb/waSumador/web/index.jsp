<%-- 
    Document   : index
    Created on : 16-sep-2010, 14:16:26
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sumador con servlets</title>
        
        <script>
            function mostrarCampo(botonPresionado){
            var campoProv = document.getElementById("campoProv");
            var campoCli = document.getElementById("campoCli");
            
            if (botonPresionado === 'Mostrar Proveedores') {
                campoProv.style.display = 'block';
                campoCli.style.display = 'none';
                
                
            } else if (botonPresionado === 'Mostrar Clientes') {
                campoProv.style.display = 'none';
                campoCli.style.display = 'block';
            }
            
            }
            
        </script>
    </head>
    <body>
        <h1>Sumador con servlets!</h1>
        
        <input type="submit" , value="Mostrar Clientes", onclick = "mostrarCampo('Mostrar Clientes')">
        <input type="submit", value="Mostrar Proveedores", onclick="mostrarCampo('Mostrar Proveedores')">
        
        <form name="frmSumador" action="SumadorServlet" method="GET">
 
            
            <div id="campoProv" style="display: none;">
                Nombre: <input type="text" name="nombreProv"><br>
                Telefono: <input type="text" name="telefonoProv"><br>
                Correo: <input type="text" name="correoProv"><br>
                Direccion: <input type="text" name="direccionProv"><br>
                Sector: <input type="text" name="sectorProv"><br>
                Método de Pago: <select name ="metodoPagoProv">
                    <option value = "Credito">Debito</option>
                    <option value = "Debito">Credito</option> </select>
                    <input type="submit", name="boton", value="Enviar Datos de Proveedores">
            </div>
                
            <div id="campoCli" style="display: none;">
                Nombre: <input type="text" name="nombreCli"><br>
                Telefono: <input type="text" name="telefonoCli"><br>
                Correo: <input type="text" name="correoCli"><br>
                Direccion: <input type="text" name="direccionCli"><br>
                Método de Pago: 
                    <select name ="metodoPagoCli">
                    <option value = "Debito">Credito</option>
                    <option value = "Credito">Debito</option> </select>
                <input type="submit" , name="boton", value="Enviar Datos de Clientes">
                
            </div>
            
            
            


        </form>
        
    
         
        
    </body>
</html>
