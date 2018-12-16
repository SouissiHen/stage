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
@Table(name = "semestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semestre.findAll", query = "SELECT s FROM Semestre s")
    , @NamedQuery(name = "Semestre.findByIdSemes", query = "SELECT s FROM Semestre s WHERE s.idSemes = :idSemes")
    , @NamedQuery(name = "Semestre.findByDateDebut", query = "SELECT s FROM Semestre s WHERE s.dateDebut = :dateDebut")
    , @NamedQuery(name = "Semestre.findByDateFin", query = "SELECT s FROM Semestre s WHERE s.dateFin = :dateFin")})
public class Semestre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id_semes")
    private String idSemes;
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

    public Semestre() {
    }

    public Semestre(String idSemes) {
        this.idSemes = idSemes;
    }

    public Semestre(String idSemes, Date dateDebut, Date dateFin) {
        this.idSemes = idSemes;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getIdSemes() {
        return idSemes;
    }

    public void setIdSemes(String idSemes) {
        this.idSemes = idSemes;
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
        hash += (idSemes != null ? idSemes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semestre)) {
            return false;
        }
        Semestre other = (Semestre) object;
        if ((this.idSemes == null && other.idSemes != null) || (this.idSemes != null && !this.idSemes.equals(other.idSemes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Semestre[ idSemes=" + idSemes + " ]";
    }
    
}
