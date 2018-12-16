/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "enseignant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enseignant.findAll", query = "SELECT e FROM Enseignant e")
    , @NamedQuery(name = "Enseignant.findByCodeInscript", query = "SELECT e FROM Enseignant e WHERE e.codeInscript = :codeInscript")
    , @NamedQuery(name = "Enseignant.findByNom", query = "SELECT e FROM Enseignant e WHERE e.nom = :nom")
    , @NamedQuery(name = "Enseignant.findByPrenom", query = "SELECT e FROM Enseignant e WHERE e.prenom = :prenom")
    , @NamedQuery(name = "Enseignant.findBySpecialite", query = "SELECT e FROM Enseignant e WHERE e.specialite = :specialite")})
public class Enseignant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "code_inscript")
    private String codeInscript;
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
    @Column(name = "specialite")
    private String specialite;
    @JoinColumn(name = "login", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Utilisateur login;

    public Enseignant() {
    }

    public Enseignant(String codeInscript) {
        this.codeInscript = codeInscript;
    }

    public Enseignant(String codeInscript, String nom, String prenom, String specialite) {
        this.codeInscript = codeInscript;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public String getCodeInscript() {
        return codeInscript;
    }

    public void setCodeInscript(String codeInscript) {
        this.codeInscript = codeInscript;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Utilisateur getLogin() {
        return login;
    }

    public void setLogin(Utilisateur login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeInscript != null ? codeInscript.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enseignant)) {
            return false;
        }
        Enseignant other = (Enseignant) object;
        if ((this.codeInscript == null && other.codeInscript != null) || (this.codeInscript != null && !this.codeInscript.equals(other.codeInscript))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Enseignant[ codeInscript=" + codeInscript + " ]";
    }
    
}
