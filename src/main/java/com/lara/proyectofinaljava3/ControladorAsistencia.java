/*package com.lara.proyectofinaljava3;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
public class ControladorAsistencia {
    @RequestMapping(value="/Asistencia/{fecha}/{asiste}", method=RequestMethod.POST, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable date fecha, @PathVariable String asiste){
           DAOAsistenciaImpl d= new DAOAsistenciaImpl();
            d.agregarAsistencia(new Asistencia(fecha, asiste));
           return "Asistencia con exito";
}
    @RequestMapping(value="/Asistencia", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        DAOAsistenciaImpl d=new DAOAsistenciaImpl();
        Map<String,ArrayList<Asistencia>> singletonMap =Collections.singletonMap("Asistencia", d.buscarTodosAsistencia());
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarTodosAsistencia());
    }
}
*/