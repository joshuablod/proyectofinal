package com.lara.proyectofinaljava3;

import static com.lara.proyectofinaljava3.DAO.close;
import static com.lara.proyectofinaljava3.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Query;

public class DAONominaImpl extends DAO {
    public void agregarNomina(Nomina nomina) {
    begin();
    getSession().save(nomina);
    commit();
    close();
    }
    
    public ArrayList<Nomina> buscarTodosNominas() {
        begin();
        Query q = getSession().createQuery("from Nominas");
      //  Criteria c=getSession().createCriteria(Alumno.class);
        ArrayList<Nomina> nominas = (ArrayList<Nomina>)q.list();
        commit();
        close();
         
return nominas; 
    }
    
    public void borrarNomina(Nomina p){
            begin();
             getSession().delete(p);
            commit();
            close();
 }   
    
    public Nomina buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Nomina where id = :id");
        q.setInteger("id",id);
        Nomina p = (Nomina)q.uniqueResult();
        commit();
        close();
return p;  
   
  }
    public String actualizar(Nomina e){
        String mensaje="nada";
        begin();
   getSession().update(e);
   commit();
   close();
   
        
        return mensaje;
    }
}
