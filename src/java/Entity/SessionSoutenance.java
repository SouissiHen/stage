/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "session_soutenance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SessionSoutenance.findAll", query = "SELECT s FROM SessionSoutenance s")
    , @NamedQuery(name = "SessionSoutenance.findByIdsessionS", query = "SELECT s FROM SessionSoutenance s WHERE s.idsessionS = :idsessionS")
    , @NamedQuery(name = "SessionSoutenance.findByDateDebut", query = "SELECT s FROM SessionSoutenance s WHERE s.dateDebut = :dateDebut")
    , @NamedQuery(name = "SessionSoutenance.findByDateFin", query = "SELECT s FROM SessionSoutenance s WHERE s.dateFin = :dateFin")})
public class SessionSoutenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id_sessionS")
    private String idsessionS;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsessionS")
    private List<Jury> juryList;
    @OneToMany(mappedBy = "idsessionS")
    private List<Soutenance> soutenanceList;

    public SessionSoutenance() {
    }

    public SessionSoutenance(String idsessionS) {
        this.idsessionS = idsessionS;
    }

    public SessionSoutenance(String idsessionS, Date dateDebut, Date dateFin) {
        this.idsessionS = idsessionS;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getIdsessionS() {
        return idsessionS;
    }

    public void setIdsessionS(String idsessionS) {
        this.idsessionS = idsessionS;
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

    @XmlTransient
    public List<Jury> getJuryList() {
        return juryList;
    }

    public void setJuryList(List<Jury> juryList) {
        this.juryList = juryList;
    }

    @XmlTransient
    public List<Soutenance> getSoutenanceList() {
        return soutenanceList;
    }

    public void setSoutenanceList(List<Soutenance> soutenanceList) {
        this.soutenanceList = soutenanceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsessionS != null ? idsessionS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SessionSoutenance)) {
            return false;
        }
        SessionSoutenance other = (SessionSoutenance) object;
        if ((this.idsessionS == null && other.idsessionS != null) || (this.idsessionS != null && !this.idsessionS.equals(other.idsessionS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SessionSoutenance[ idsessionS=" + idsessionS + " ]";
    }
    
}
