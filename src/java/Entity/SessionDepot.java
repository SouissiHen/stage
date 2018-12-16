/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "session_depot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SessionDepot.findAll", query = "SELECT s FROM SessionDepot s")
    , @NamedQuery(name = "SessionDepot.findByIdsessionD", query = "SELECT s FROM SessionDepot s WHERE s.idsessionD = :idsessionD")
    , @NamedQuery(name = "SessionDepot.findByDateDebut", query = "SELECT s FROM SessionDepot s WHERE s.dateDebut = :dateDebut")
    , @NamedQuery(name = "SessionDepot.findByDateFin", query = "SELECT s FROM SessionDepot s WHERE s.dateFin = :dateFin")})
public class SessionDepot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id_sessionD")
    private String idsessionD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_fin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    public SessionDepot() {
    }

    public SessionDepot(String idsessionD) {
        this.idsessionD = idsessionD;
    }

    public SessionDepot(String idsessionD, Date dateDebut, Date dateFin) {
        this.idsessionD = idsessionD;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getIdsessionD() {
        return idsessionD;
    }

    public void setIdsessionD(String idsessionD) {
        this.idsessionD = idsessionD;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsessionD != null ? idsessionD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SessionDepot)) {
            return false;
        }
        SessionDepot other = (SessionDepot) object;
        if ((this.idsessionD == null && other.idsessionD != null) || (this.idsessionD != null && !this.idsessionD.equals(other.idsessionD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SessionDepot[ idsessionD=" + idsessionD + " ]";
    }
    
}
