<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <input type="text" id="nombre" />
        <input type="text" id="edad" />
        <input type="text" id="puesto" />
        <input type="text" id="sueldo" />
        <input type="button" value="guardar empleado" id="boton-guardar">
        <input type="button" value="recobrar todos" id="boton-recobrar">
       
        <select name="nombres" id="todos" hidden>
             
            </select>
       
        <script>
        
       $("#boton-recobrar").click(function(){ 
        $("#todos").show();/* Este hace que se vea la chingadera de menu */   
        $("#todos").empty(); /* con esta funcion empty vaciamos todo, si  no se te juntaran un chingo de registros en el select de html */   
  $.getJSON("http://localhost:8084/ProyectoFinalJava3/servicios/Empleado",function(result){
    $.each(result, function(campo){
      $("#todos").append("<option>"+campo.nombre + campo.edad + campo.puesto + campo.sueldo +"</option> ");
    });
  });
});

$("#boton-guardar").click(function(){
    var nombre=$("#nombre").val();
    var edad=$("#edad").val();
    var puesto=$("#puesto").val();
    var sueldo=$("#sueldo").val();
                $.ajax({
        method:'POST',
        url:"http://localhost:8084/ProyectoFinalJava3/servicios/Empleado/"+nombre+"/"+edad+"/"+puesto+"/"+sueldo,
        success:function(valor){
            alert(valor);
        },
        failure:function(e){
            alert(e);
        }
    });
});



        </script>
      
        <div></div>
    </body>
</html>