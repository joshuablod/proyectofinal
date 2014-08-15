package com.lara.proyectofinaljava3;

import static com.lara.proyectofinaljava3.DAO.close;
import static com.lara.proyectofinaljava3.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Query;

public class DAOAsistenciaImpl extends DAO {
    public void agregarAsistencia(Asistencia asistencia) {
    begin();
    getSession().save(asistencia);
    commit();
    close();
    }
    
    public ArrayList<Asistencia> buscarTodosAsistencia() {
        begin();
        Query q = getSession().createQuery("from Asistencia");
      //  Criteria c=getSession().createCriteria(Alumno.class);
        ArrayList<Asistencia> asistencias = (ArrayList<Asistencia>)q.list();
        commit();
        close();
         
return asistencias; 
    }
    
    public void borrarAsistencia(Asistencia p){
            begin();
             getSession().delete(p);
            commit();
            close();
 }   
    
    public Asistencia buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Asistencia where id = :id");
        q.setInteger("id",id);
        Asistencia p = (Asistencia)q.uniqueResult();
        commit();
        close();
return p;  
   
  }
    public String actualizar(Asistencia e){
        String mensaje="nada";
        begin();
   getSession().update(e);
   commit();
   close();
   
        
        return mensaje;
    }
}
