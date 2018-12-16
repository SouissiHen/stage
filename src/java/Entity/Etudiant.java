/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e")
    , @NamedQuery(name = "Etudiant.findByNumInscript", query = "SELECT e FROM Etudiant e WHERE e.numInscript = :numInscript")
    , @NamedQuery(name = "Etudiant.findByNom", query = "SELECT e FROM Etudiant e WHERE e.nom = :nom")
    , @NamedQuery(name = "Etudiant.findByPrenom", query = "SELECT e FROM Etudiant e WHERE e.prenom = :prenom")
    , @NamedQuery(name = "Etudiant.findByClasse", query = "SELECT e FROM Etudiant e WHERE e.classe = :classe")})
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_inscript")
    private Integer numInscript;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "classe")
    private String classe;
    @JoinColumn(name = "login", referencedColumnName = "login")
    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    private Utilisateur login;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numInscript")
    private List<Rapports> rapportsList;

    public Etudiant() {
    }

    public Etudiant(Integer numInscript) {
        this.numInscript = numInscript;
    }

    public Etudiant(Integer numInscript, String nom, String prenom, String classe) {
        this.numInscript = numInscript;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

  

    public Integer getNumInscript() {
        return numInscript;
    }

    public void setNumInscript(Integer numInscript) {
        this.numInscript = numInscript;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Utilisateur getLogin() {
        return login;
    }

    public void setLogin(Utilisateur login) {
        this.login = login;
    }

    @XmlTransient
    public List<Rapports> getRapportsList() {
        return rapportsList;
    }

    public void setRapportsList(List<Rapports> rapportsList) {
        this.rapportsList = rapportsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numInscript != null ? numInscript.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.numInscript == null && other.numInscript != null) || (this.numInscript != null && !this.numInscript.equals(other.numInscript))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Etudiant[ numInscript=" + numInscript +" "+nom+" "+prenom+ " ]";
    }
    
}
