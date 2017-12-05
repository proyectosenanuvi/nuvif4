/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuvi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "censo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Censo.findAll", query = "SELECT c FROM Censo c")
    , @NamedQuery(name = "Censo.findByIdCenso", query = "SELECT c FROM Censo c WHERE c.idCenso = :idCenso")
    , @NamedQuery(name = "Censo.findByFechaCenso", query = "SELECT c FROM Censo c WHERE c.fechaCenso = :fechaCenso")
    , @NamedQuery(name = "Censo.findByNombreCdeFamilia", query = "SELECT c FROM Censo c WHERE c.nombreCdeFamilia = :nombreCdeFamilia")
    , @NamedQuery(name = "Censo.findByApellidoCdeFamilia", query = "SELECT c FROM Censo c WHERE c.apellidoCdeFamilia = :apellidoCdeFamilia")
    , @NamedQuery(name = "Censo.findByTipoDocumentoCdeFamilia", query = "SELECT c FROM Censo c WHERE c.tipoDocumentoCdeFamilia = :tipoDocumentoCdeFamilia")
    , @NamedQuery(name = "Censo.findByNDocumentoCdeFamilia", query = "SELECT c FROM Censo c WHERE c.nDocumentoCdeFamilia = :nDocumentoCdeFamilia")
    , @NamedQuery(name = "Censo.findByLocalidadCenso", query = "SELECT c FROM Censo c WHERE c.localidadCenso = :localidadCenso")
    , @NamedQuery(name = "Censo.findByBarrioCenso", query = "SELECT c FROM Censo c WHERE c.barrioCenso = :barrioCenso")
    , @NamedQuery(name = "Censo.findByDireccionCenso", query = "SELECT c FROM Censo c WHERE c.direccionCenso = :direccionCenso")
    , @NamedQuery(name = "Censo.findByNIntegrantesFamilia", query = "SELECT c FROM Censo c WHERE c.nIntegrantesFamilia = :nIntegrantesFamilia")})
public class Censo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCenso")
    private Integer idCenso;
    @Column(name = "fechaCenso")
    @Temporal(TemporalType.DATE)
    private Date fechaCenso;
    @Size(max = 45)
    @Column(name = "nombreCdeFamilia")
    private String nombreCdeFamilia;
    @Size(max = 45)
    @Column(name = "apellidoCdeFamilia")
    private String apellidoCdeFamilia;
    @Size(max = 45)
    @Column(name = "tipoDocumentoCdeFamilia")
    private String tipoDocumentoCdeFamilia;
    @Size(max = 45)
    @Column(name = "nDocumentoCdeFamilia")
    private String nDocumentoCdeFamilia;
    @Column(name = "localidadCenso")
    private Integer localidadCenso;
    @Size(max = 45)
    @Column(name = "barrioCenso")
    private String barrioCenso;
    @Size(max = 45)
    @Column(name = "direccionCenso")
    private String direccionCenso;
    @Column(name = "nIntegrantesFamilia")
    private Integer nIntegrantesFamilia;
    @OneToMany(mappedBy = "idCenso")
    private List<Tipodeproblematica> tipodeproblematicaList;
    @JoinColumn(name = "idProyecto", referencedColumnName = "idProyecto")
    @ManyToOne
    private Proyecto idProyecto;

    public Censo() {
    }

    public Censo(Integer idCenso) {
        this.idCenso = idCenso;
    }

    public Integer getIdCenso() {
        return idCenso;
    }

    public void setIdCenso(Integer idCenso) {
        this.idCenso = idCenso;
    }

    public Date getFechaCenso() {
        return fechaCenso;
    }

    public void setFechaCenso(Date fechaCenso) {
        this.fechaCenso = fechaCenso;
    }

    public String getNombreCdeFamilia() {
        return nombreCdeFamilia;
    }

    public void setNombreCdeFamilia(String nombreCdeFamilia) {
        this.nombreCdeFamilia = nombreCdeFamilia;
    }

    public String getApellidoCdeFamilia() {
        return apellidoCdeFamilia;
    }

    public void setApellidoCdeFamilia(String apellidoCdeFamilia) {
        this.apellidoCdeFamilia = apellidoCdeFamilia;
    }

    public String getTipoDocumentoCdeFamilia() {
        return tipoDocumentoCdeFamilia;
    }

    public void setTipoDocumentoCdeFamilia(String tipoDocumentoCdeFamilia) {
        this.tipoDocumentoCdeFamilia = tipoDocumentoCdeFamilia;
    }

    public String getNDocumentoCdeFamilia() {
        return nDocumentoCdeFamilia;
    }

    public void setNDocumentoCdeFamilia(String nDocumentoCdeFamilia) {
        this.nDocumentoCdeFamilia = nDocumentoCdeFamilia;
    }

    public Integer getLocalidadCenso() {
        return localidadCenso;
    }

    public void setLocalidadCenso(Integer localidadCenso) {
        this.localidadCenso = localidadCenso;
    }

    public String getBarrioCenso() {
        return barrioCenso;
    }

    public void setBarrioCenso(String barrioCenso) {
        this.barrioCenso = barrioCenso;
    }

    public String getDireccionCenso() {
        return direccionCenso;
    }

    public void setDireccionCenso(String direccionCenso) {
        this.direccionCenso = direccionCenso;
    }

    public Integer getNIntegrantesFamilia() {
        return nIntegrantesFamilia;
    }

    public void setNIntegrantesFamilia(Integer nIntegrantesFamilia) {
        this.nIntegrantesFamilia = nIntegrantesFamilia;
    }

    @XmlTransient
    public List<Tipodeproblematica> getTipodeproblematicaList() {
        return tipodeproblematicaList;
    }

    public void setTipodeproblematicaList(List<Tipodeproblematica> tipodeproblematicaList) {
        this.tipodeproblematicaList = tipodeproblematicaList;
    }

    public Proyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCenso != null ? idCenso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Censo)) {
            return false;
        }
        Censo other = (Censo) object;
        if ((this.idCenso == null && other.idCenso != null) || (this.idCenso != null && !this.idCenso.equals(other.idCenso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.nuvi.entities.Censo[ idCenso=" + idCenso + " ]";
    }
    
}
