/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.DaoJpa;
import Entity.Etudiant;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ASUS
 */
@ManagedBean(name="SelectClasse")
@SessionScoped 
public class SelectClasse {
    private DaoJpa agent;
    private String specialite;
    
   private  List<Etudiant> l;
   
   
    public void setspecialite(String specialite){
        this.specialite = specialite;
    }
    public String getspecialite(){
        return specialite;
        
    }
    
   /* public String specialite(){
    String classe = request.getParameter("classe");
        agent = new DaoJpa();
        agent .init();
        
         List<Etudiant> l = agent.Find_by_section(classe);
         
         
         agent.close();
        
        System.out.println(classe+" : nb:"+l.size());
    }*/
    
    
    public String Get_Etudiant(){
        
        agent = new DaoJpa();
        agent .init();
        
          l = agent.Find_by_section(specialite);
         
         
         agent.close();
        
       // System.out.println(classe+" : nb:"+l.size());
       
       return("list_etudiant");
        
    }

    public List<Etudiant> getL() {
        return l;
    }

    public void setL(List<Etudiant> l) {
        this.l = l;
    }
    
    
    
}
