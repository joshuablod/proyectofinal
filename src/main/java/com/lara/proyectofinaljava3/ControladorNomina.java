/*package com.lara.proyectofinaljava3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorNomina {
    @RequestMapping(value="/Nomina/{salario}", method=RequestMethod.POST, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable float salario){
           DAONominaImpl d= new DAONominaImpl();
            d.agregarNomina(new Nomina(salario));
           return "Salario guardado con exito";
}
    @RequestMapping(value="/Nomina", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        DAONominaImpl d=new DAONominaImpl();
        Map<String,ArrayList<Nomina>> singletonMap =Collections.singletonMap("Nomina", d.buscarTodosNominas());
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarTodosNominas());
    }
}
*/