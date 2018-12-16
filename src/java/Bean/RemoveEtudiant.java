/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.DaoJpa;
import Entity.Etudiant;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ASUS
 */
@ManagedBean(name = "RemoveEtudiants")
@SessionScoped
public class RemoveEtudiant {
  
    private DaoJpa dao;

    public RemoveEtudiant(){
        
      
    }

  
    
    
    public String DeleteAction(Integer numInscript){
      dao = new DaoJpa();
      dao.init();
      dao.Supprimer_Etudiant(numInscript);
      dao.close();
      return "delete";
    }
}
