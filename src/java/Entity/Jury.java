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
@Table(name = "jury")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jury.findAll", query = "SELECT j FROM Jury j")
    , @NamedQuery(name = "Jury.findByNumJury", query = "SELECT j FROM Jury j WHERE j.numJury = :numJury")
    , @NamedQuery(name = "Jury.findByCodeendM1", query = "SELECT j FROM Jury j WHERE j.codeendM1 = :codeendM1")
    , @NamedQuery(name = "Jury.findByCodeendM2", query = "SELECT j FROM Jury j WHERE j.codeendM2 = :codeendM2")
    , @NamedQuery(name = "Jury.findByCodeendM3", query = "SELECT j FROM Jury j WHERE j.codeendM3 = :codeendM3")})
public class Jury implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_jury")
    private Integer numJury;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "code_end_M1")
    private String codeendM1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "code_end_M2")
    private String codeendM2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "code_end_M3")
    private String codeendM3;
    @JoinColumn(name = "id_sessionS", referencedColumnName = "id_sessionS")
    @ManyToOne(optional = false)
    private SessionSoutenance idsessionS;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numJury")
    private List<Soutenance> soutenanceList;

    public Jury() {
    }

    public Jury(Integer numJury) {
        this.numJury = numJury;
    }

    public Jury(Integer numJury, String codeendM1, String codeendM2, String codeendM3) {
        this.numJury = numJury;
        this.codeendM1 = codeendM1;
        this.codeendM2 = codeendM2;
        this.codeendM3 = codeendM3;
    }

    public Integer getNumJury() {
        return numJury;
    }

    public void setNumJury(Integer numJury) {
        this.numJury = numJury;
    }

    public String getCodeendM1() {
        return codeendM1;
    }

    public void setCodeendM1(String codeendM1) {
        this.codeendM1 = codeendM1;
    }

    public String getCodeendM2() {
        return codeendM2;
    }

    public void setCodeendM2(String codeendM2) {
        this.codeendM2 = codeendM2;
    }

    public String getCodeendM3() {
        return codeendM3;
    }

    public void setCodeendM3(String codeendM3) {
        this.codeendM3 = codeendM3;
    }

    public SessionSoutenance getIdsessionS() {
        return idsessionS;
    }

    public void setIdsessionS(SessionSoutenance idsessionS) {
        this.idsessionS = idsessionS;
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
        hash += (numJury != null ? numJury.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jury)) {
            return false;
        }
        Jury other = (Jury) object;
        if ((this.numJury == null && other.numJury != null) || (this.numJury != null && !this.numJury.equals(other.numJury))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Jury[ numJury=" + numJury + " ]";
    }
    
}
