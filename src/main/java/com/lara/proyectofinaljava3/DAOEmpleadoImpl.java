package com.lara.proyectofinaljava3;

import static com.lara.proyectofinaljava3.DAO.close;
import static com.lara.proyectofinaljava3.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Query;

public class DAOEmpleadoImpl extends DAO {
    public void agregarEmpleado(Empleado empleado) {
    begin();
    getSession().save(empleado);
    commit();
    close();
    }
    
    public ArrayList<Empleado> buscarTodosEmpleados() {
        begin();
        Query q = getSession().createQuery("from Empleado");
      
        ArrayList<Empleado> empleados = (ArrayList<Empleado>)q.list();
        commit();
        close();
         
return empleados; 
    }
    
    public void borrarEmpleado(Empleado p){
            begin();
             getSession().delete(p);
            commit();
            close();
 }   
    
    public Empleado buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Empleado where id = :id");
        q.setInteger("id",id);
        Empleado p = (Empleado)q.uniqueResult();
        commit();
        close();
return p;  
   
  }
    public String actualizar(Empleado e){
        String mensaje="nada";
        begin();
   getSession().update(e);
   commit();
   close();
   
        
        return mensaje;
    }
}
