/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Entity.Etudiant;
import Entity.Utilisateur;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.Part;

/**
 *
 * @author zohan
 */
public class DaoJpa {

    private EntityManager em;
    private EntityManagerFactory emf;
    private EntityTransaction tx;
   

    public DaoJpa() {
    }

    

    public void init() {
        emf = Persistence.createEntityManagerFactory("hindPU");
        em = emf.createEntityManager();
//tx = em.getTransaction();
//tx.begin();
    }

    public void close() {
        em.close();
        emf.close();
    }
    
   
            //Auhentification user 
    public List<Utilisateur> Authentification(String login, String pwd) {
        try {
            em.getTransaction().begin();

            List<Utilisateur> l = em.createQuery("select h from Utilisateur h where h.login='" + login + "' and h.password='" + pwd+ "'").getResultList();
            em.getTransaction().commit();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
                //liste section 
    public List<Etudiant> Find_by_section(String section) {
        try {
            em.getTransaction().begin();
            
            

            List<Etudiant> l = em.createQuery("select e from Etudiant e where e.classe='"+section+ "'").getResultList();
            em.getTransaction().commit();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    

// ajout d'un utilisateur  
    public Etudiant Ajouter_Etudiant(Etudiant etu) {
        try {

            em.getTransaction().begin();
            em.persist(etu);
            em.getTransaction().commit();

            return etu;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

// modifier un etudiant
    public void Modifier_Etudiant(Etudiant etu) {
        try {

            em.getTransaction().begin();
            etu = em.merge(etu);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Etudiant get_Etudiant_By_Id(int id) {
try {
    em.getTransaction().begin();
    Etudiant ct =  em.find(Etudiant.class, id);
    em.getTransaction().commit();
 return ct;
} catch (Exception e) {
e.printStackTrace();
return null;
}
}
    public List<Etudiant> getAllEtudiant() {
try {
return em.createQuery("select e from Etudiant e").getResultList();
} catch (Exception e) {
e.printStackTrace();
return null;
}
    }
    
public void Supprimer_Etudiant(Integer numInscript) {
        try {
            Etudiant e = em.find(Etudiant.class, numInscript);
            em.getTransaction().begin();
            e = em.merge(e);
            em.remove(e);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   

/*
    public List<Medecins> Trouver_Med(String nom, String prenom) {
        try {
            em.getTransaction().begin();

            List<Medecins> l = em.createQuery("select h from Medecins h where h.nom='" + nom + "' and h.prenom='" + prenom + "'").getResultList();
            em.getTransaction().commit();
            return l;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
/*    // recuperer un client donnÃ©
public Clients getClientById(Long id) {
try {
    em.getTransaction().begin();
Clients ct =  em.find(Clients.class, id);
 em.getTransaction().commit();
 return ct;
} catch (Exception e) {
e.printStackTrace();
return null;
}
}
// recuperer un mÃ©decin donnÃ©
public Medecins getMedecinById(Long id) {
try {
    

             em.getTransaction().begin();
        Medecins m = em.find(Medecins.class, id);
         em.getTransaction().commit();
        return m;
} catch (Exception e) {
e.printStackTrace();
return null;
}
}
    
    public Rv Ajouter_RDV(Rv rv) {
try {
//Rv rv = new Rv(jour,client);
em.getTransaction().begin();
		em.persist(rv);
		em.getTransaction().commit();
return rv;
} catch (Exception e) {
e.printStackTrace();
return null;
}
}*/
    
    
    /*public static void main(){
        
           DaoJpa agent = new DaoJpa();
        agent .init();
        
         List<Etudiant> l = agent.Find_by_section("2 DSEN");
         
         agent.close();
         
         System.out.println("la taille de la liste est:"+l.size());
        
        
    }*/

   

}
