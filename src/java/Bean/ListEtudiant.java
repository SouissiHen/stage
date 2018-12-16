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
@ManagedBean(name = "listEtudiants")
@SessionScoped

/**
 *
 * @author ASUS
 */
public class ListEtudiant {
    private DaoJpa dao;
    private List<Etudiant> listEtudiants;
    public void setListEtudiants(List<Etudiant> Etudiant){
        this.listEtudiants = Etudiant;
    }
    public List<Etudiant> getListEtudiants(){
        return listEtudiants;
    }
    public String retrieveEtudfromDao(){
        dao = new DaoJpa();
        dao.init(); // initialisation de la couche de persistance 
        System.out.print(" affichage listes des etudiant ");
        listEtudiants =  dao.getAllEtudiant();
        dao.close();
        return "etudiant";
    }
}
