package com.lara.proyectofinaljava3;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class ControladorEmpleado {
    @RequestMapping(value="/Empleado/{nombre}/{edad}/{puesto}/{sueldo}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable String nombre, @PathVariable int edad, @PathVariable String puesto, @PathVariable float sueldo ){
           DAOEmpleadoImpl d= new DAOEmpleadoImpl();
            d.agregarEmpleado(new Empleado(nombre, edad, puesto, sueldo));
           return "Empleado guardado con exito";
}
    @RequestMapping(value="/Empleado", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        DAOEmpleadoImpl d=new DAOEmpleadoImpl();
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarTodosEmpleados());
    }
}