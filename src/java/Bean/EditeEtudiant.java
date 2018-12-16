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
@ManagedBean(name = "EditEtudiants")
@SessionScoped
public class EditeEtudiant {
   
    private     Etudiant e;
    private DaoJpa dao;
    
    public EditeEtudiant(){
         e = new Etudiant();
    }

    public Etudiant getE() {
        return e;
    }

    public void setE(Etudiant e) {
        this.e = e;
    }

  

    public String Edit_Etudiant() {
        /*System.out.println("je dois modifier :"+oldid);
        System.out.orintln("le nouveau:"+med.toString());
        */
        dao = new DaoJpa();
        dao.init();// on initialise la couche de persistence 
        dao.Modifier_Etudiant(e);
        dao.close();
        
       return "index";
        
    }
    
    public String GetEtudiant(int numInscript) {
        dao = new DaoJpa();
        dao.init();
        e = dao.get_Etudiant_By_Id(numInscript);
        dao.close();
        
        return "EditEtudiant";
        
    }
    
 
   
    
}
