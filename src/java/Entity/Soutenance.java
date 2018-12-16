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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "soutenance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soutenance.findAll", query = "SELECT s FROM Soutenance s")
    , @NamedQuery(name = "Soutenance.findByNumSoutenance", query = "SELECT s FROM Soutenance s WHERE s.numSoutenance = :numSoutenance")
    , @NamedQuery(name = "Soutenance.findByDateSoutenance", query = "SELECT s FROM Soutenance s WHERE s.dateSoutenance = :dateSoutenance")
    , @NamedQuery(name = "Soutenance.findByHeureSoutenance", query = "SELECT s FROM Soutenance s WHERE s.heureSoutenance = :heureSoutenance")
    , @NamedQuery(name = "Soutenance.findByNote", query = "SELECT s FROM Soutenance s WHERE s.note = :note")})
public class Soutenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_soutenance")
    private Integer numSoutenance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_soutenance")
    @Temporal(TemporalType.DATE)
    private Date dateSoutenance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_soutenance")
    @Temporal(TemporalType.TIME)
    private Date heureSoutenance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "note")
    private float note;
    @JoinColumn(name = "id_sessionS", referencedColumnName = "id_sessionS")
    @ManyToOne
    private SessionSoutenance idsessionS;
    @JoinColumn(name = "num_jury", referencedColumnName = "num_jury")
    @ManyToOne(optional = false)
    private Jury numJury;

    public Soutenance() {
    }

    public Soutenance(Integer numSoutenance) {
        this.numSoutenance = numSoutenance;
    }

    public Soutenance(Integer numSoutenance, Date dateSoutenance, Date heureSoutenance, float note) {
        this.numSoutenance = numSoutenance;
        this.dateSoutenance = dateSoutenance;
        this.heureSoutenance = heureSoutenance;
        this.note = note;
    }

    public Integer getNumSoutenance() {
        return numSoutenance;
    }

    public void setNumSoutenance(Integer numSoutenance) {
        this.numSoutenance = numSoutenance;
    }

    public Date getDateSoutenance() {
        return dateSoutenance;
    }

    public void setDateSoutenance(Date dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public Date getHeureSoutenance() {
        return heureSoutenance;
    }

    public void setHeureSoutenance(Date heureSoutenance) {
        this.heureSoutenance = heureSoutenance;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public SessionSoutenance getIdsessionS() {
        return idsessionS;
    }

    public void setIdsessionS(SessionSoutenance idsessionS) {
        this.idsessionS = idsessionS;
    }

    public Jury getNumJury() {
        return numJury;
    }

    public void setNumJury(Jury numJury) {
        this.numJury = numJury;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSoutenance != null ? numSoutenance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soutenance)) {
            return false;
        }
        Soutenance other = (Soutenance) object;
        if ((this.numSoutenance == null && other.numSoutenance != null) || (this.numSoutenance != null && !this.numSoutenance.equals(other.numSoutenance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Soutenance[ numSoutenance=" + numSoutenance + " ]";
    }
    
}
