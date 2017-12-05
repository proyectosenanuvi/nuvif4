/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuvi.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "material_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialProyecto.findAll", query = "SELECT m FROM MaterialProyecto m")
    , @NamedQuery(name = "MaterialProyecto.findByIdMaterialProyecto", query = "SELECT m FROM MaterialProyecto m WHERE m.idMaterialProyecto = :idMaterialProyecto")
    , @NamedQuery(name = "MaterialProyecto.findByCantidadMaterial", query = "SELECT m FROM MaterialProyecto m WHERE m.cantidadMaterial = :cantidadMaterial")
    , @NamedQuery(name = "MaterialProyecto.findByValorUnitario", query = "SELECT m FROM MaterialProyecto m WHERE m.valorUnitario = :valorUnitario")})
public class MaterialProyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMaterialProyecto")
    private Integer idMaterialProyecto;
    @Column(name = "cantidadMaterial")
    private Integer cantidadMaterial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorUnitario")
    private Float valorUnitario;
    @JoinColumn(name = "idProyecto", referencedColumnName = "idProyecto")
    @ManyToOne
    private Proyecto idProyecto;
    @JoinColumn(name = "idMaterial", referencedColumnName = "idMaterial")
    @ManyToOne
    private Material idMaterial;

    public MaterialProyecto() {
    }

    public MaterialProyecto(Integer idMaterialProyecto) {
        this.idMaterialProyecto = idMaterialProyecto;
    }

    public Integer getIdMaterialProyecto() {
        return idMaterialProyecto;
    }

    public void setIdMaterialProyecto(Integer idMaterialProyecto) {
        this.idMaterialProyecto = idMaterialProyecto;
    }

    public Integer getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(Integer cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Proyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Material getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Material idMaterial) {
        this.idMaterial = idMaterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterialProyecto != null ? idMaterialProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialProyecto)) {
            return false;
        }
        MaterialProyecto other = (MaterialProyecto) object;
        if ((this.idMaterialProyecto == null && other.idMaterialProyecto != null) || (this.idMaterialProyecto != null && !this.idMaterialProyecto.equals(other.idMaterialProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.nuvi.entities.MaterialProyecto[ idMaterialProyecto=" + idMaterialProyecto + " ]";
    }
    
}
