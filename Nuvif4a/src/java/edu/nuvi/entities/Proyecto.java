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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p")
    , @NamedQuery(name = "Proyecto.findByIdProyecto", query = "SELECT p FROM Proyecto p WHERE p.idProyecto = :idProyecto")
    , @NamedQuery(name = "Proyecto.findByNombreProyecto", query = "SELECT p FROM Proyecto p WHERE p.nombreProyecto = :nombreProyecto")
    , @NamedQuery(name = "Proyecto.findByFechaInicioProyecto", query = "SELECT p FROM Proyecto p WHERE p.fechaInicioProyecto = :fechaInicioProyecto")
    , @NamedQuery(name = "Proyecto.findByFechaFinProyecto", query = "SELECT p FROM Proyecto p WHERE p.fechaFinProyecto = :fechaFinProyecto")
    , @NamedQuery(name = "Proyecto.findByCostoMaterial", query = "SELECT p FROM Proyecto p WHERE p.costoMaterial = :costoMaterial")
    , @NamedQuery(name = "Proyecto.findByCostopersonal", query = "SELECT p FROM Proyecto p WHERE p.costopersonal = :costopersonal")
    , @NamedQuery(name = "Proyecto.findBySolucionProyecto", query = "SELECT p FROM Proyecto p WHERE p.solucionProyecto = :solucionProyecto")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProyecto")
    private Integer idProyecto;
    @Size(max = 45)
    @Column(name = "nombreProyecto")
    private String nombreProyecto;
    @Column(name = "fechaInicioProyecto")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioProyecto;
    @Column(name = "fechaFinProyecto")
    @Temporal(TemporalType.DATE)
    private Date fechaFinProyecto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costoMaterial")
    private Float costoMaterial;
    @Column(name = "costopersonal")
    private Float costopersonal;
    @Size(max = 1000)
    @Column(name = "solucionProyecto")
    private String solucionProyecto;
    @JoinTable(name = "proyecto_usuario", joinColumns = {
        @JoinColumn(name = "idProyecto", referencedColumnName = "idProyecto")}, inverseJoinColumns = {
        @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")})
    @ManyToMany
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "idProyecto")
    private List<Donacion> donacionList;
    @OneToMany(mappedBy = "idProyecto")
    private List<Cotizacion> cotizacionList;
    @OneToMany(mappedBy = "idProyecto")
    private List<Censo> censoList;
    @OneToMany(mappedBy = "idProyecto")
    private List<Personal> personalList;
    @OneToMany(mappedBy = "idProyecto")
    private List<MaterialProyecto> materialProyectoList;

    public Proyecto() {
    }

    public Proyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Date getFechaInicioProyecto() {
        return fechaInicioProyecto;
    }

    public void setFechaInicioProyecto(Date fechaInicioProyecto) {
        this.fechaInicioProyecto = fechaInicioProyecto;
    }

    public Date getFechaFinProyecto() {
        return fechaFinProyecto;
    }

    public void setFechaFinProyecto(Date fechaFinProyecto) {
        this.fechaFinProyecto = fechaFinProyecto;
    }

    public Float getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(Float costoMaterial) {
        this.costoMaterial = costoMaterial;
    }

    public Float getCostopersonal() {
        return costopersonal;
    }

    public void setCostopersonal(Float costopersonal) {
        this.costopersonal = costopersonal;
    }

    public String getSolucionProyecto() {
        return solucionProyecto;
    }

    public void setSolucionProyecto(String solucionProyecto) {
        this.solucionProyecto = solucionProyecto;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<Donacion> getDonacionList() {
        return donacionList;
    }

    public void setDonacionList(List<Donacion> donacionList) {
        this.donacionList = donacionList;
    }

    @XmlTransient
    public List<Cotizacion> getCotizacionList() {
        return cotizacionList;
    }

    public void setCotizacionList(List<Cotizacion> cotizacionList) {
        this.cotizacionList = cotizacionList;
    }

    @XmlTransient
    public List<Censo> getCensoList() {
        return censoList;
    }

    public void setCensoList(List<Censo> censoList) {
        this.censoList = censoList;
    }

    @XmlTransient
    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    @XmlTransient
    public List<MaterialProyecto> getMaterialProyectoList() {
        return materialProyectoList;
    }

    public void setMaterialProyectoList(List<MaterialProyecto> materialProyectoList) {
        this.materialProyectoList = materialProyectoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.nuvi.entities.Proyecto[ idProyecto=" + idProyecto + " ]";
    }
    
}
