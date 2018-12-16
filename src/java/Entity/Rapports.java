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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "rapports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rapports.findAll", query = "SELECT r FROM Rapports r")
    , @NamedQuery(name = "Rapports.findByIdRapport", query = "SELECT r FROM Rapports r WHERE r.idRapport = :idRapport")
    , @NamedQuery(name = "Rapports.findByAccepter", query = "SELECT r FROM Rapports r WHERE r.accepter = :accepter")})
public class Rapports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_rapport")
    private Integer idRapport;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rapport")
    private byte[] rapport;
    @Basic(optional = false)
    @NotNull
    @Column(name = "accepter")
    private boolean accepter;
    @JoinColumn(name = "num_inscript", referencedColumnName = "num_inscript")
    @ManyToOne(optional = false)
    private Etudiant numInscript;

    public Rapports() {
    }

    public Rapports(Integer idRapport) {
        this.idRapport = idRapport;
    }

    public Rapports(Integer idRapport, byte[] rapport, boolean accepter) {
        this.idRapport = idRapport;
        this.rapport = rapport;
        this.accepter = accepter;
    }

    public Integer getIdRapport() {
        return idRapport;
    }

    public void setIdRapport(Integer idRapport) {
        this.idRapport = idRapport;
    }

    public byte[] getRapport() {
        return rapport;
    }

    public void setRapport(byte[] rapport) {
        this.rapport = rapport;
    }

    public boolean getAccepter() {
        return accepter;
    }

    public void setAccepter(boolean accepter) {
        this.accepter = accepter;
    }

    public Etudiant getNumInscript() {
        return numInscript;
    }

    public void setNumInscript(Etudiant numInscript) {
        this.numInscript = numInscript;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRapport != null ? idRapport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rapports)) {
            return false;
        }
        Rapports other = (Rapports) object;
        if ((this.idRapport == null && other.idRapport != null) || (this.idRapport != null && !this.idRapport.equals(other.idRapport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Rapports[ idRapport=" + idRapport + " ]";
    }
    
}
