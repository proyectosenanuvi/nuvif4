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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByIdPersonal", query = "SELECT p FROM Personal p WHERE p.idPersonal = :idPersonal")
    , @NamedQuery(name = "Personal.findByNombrePersonal", query = "SELECT p FROM Personal p WHERE p.nombrePersonal = :nombrePersonal")
    , @NamedQuery(name = "Personal.findByApellidoPersonal", query = "SELECT p FROM Personal p WHERE p.apellidoPersonal = :apellidoPersonal")
    , @NamedQuery(name = "Personal.findByProfesionPersonal", query = "SELECT p FROM Personal p WHERE p.profesionPersonal = :profesionPersonal")
    , @NamedQuery(name = "Personal.findByEdadPersonal", query = "SELECT p FROM Personal p WHERE p.edadPersonal = :edadPersonal")
    , @NamedQuery(name = "Personal.findByCategoriaPersonal", query = "SELECT p FROM Personal p WHERE p.categoriaPersonal = :categoriaPersonal")
    , @NamedQuery(name = "Personal.findByTipoDocumentoPesonal", query = "SELECT p FROM Personal p WHERE p.tipoDocumentoPesonal = :tipoDocumentoPesonal")
    , @NamedQuery(name = "Personal.findByNDocumentoPersonal", query = "SELECT p FROM Personal p WHERE p.nDocumentoPersonal = :nDocumentoPersonal")
    , @NamedQuery(name = "Personal.findByNContactoPersonal", query = "SELECT p FROM Personal p WHERE p.nContactoPersonal = :nContactoPersonal")
    , @NamedQuery(name = "Personal.findByEmailPersonal", query = "SELECT p FROM Personal p WHERE p.emailPersonal = :emailPersonal")
    , @NamedQuery(name = "Personal.findBySueldo", query = "SELECT p FROM Personal p WHERE p.sueldo = :sueldo")
    , @NamedQuery(name = "Personal.findByDisponibilidad", query = "SELECT p FROM Personal p WHERE p.disponibilidad = :disponibilidad")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPersonal")
    private Integer idPersonal;
    @Size(max = 45)
    @Column(name = "nombrePersonal")
    private String nombrePersonal;
    @Size(max = 45)
    @Column(name = "apellidoPersonal")
    private String apellidoPersonal;
    @Size(max = 45)
    @Column(name = "profesionPersonal")
    private String profesionPersonal;
    @Column(name = "edadPersonal")
    private Integer edadPersonal;
    @Size(max = 45)
    @Column(name = "categoriaPersonal")
    private String categoriaPersonal;
    @Size(max = 45)
    @Column(name = "tipoDocumentoPesonal")
    private String tipoDocumentoPesonal;
    @Size(max = 45)
    @Column(name = "nDocumentoPersonal")
    private String nDocumentoPersonal;
    @Size(max = 45)
    @Column(name = "nContactoPersonal")
    private String nContactoPersonal;
    @Size(max = 45)
    @Column(name = "emailPersonal")
    private String emailPersonal;
    @Column(name = "sueldo")
    private Integer sueldo;
    @Column(name = "disponibilidad")
    private Boolean disponibilidad;
    @JoinColumn(name = "idProyecto", referencedColumnName = "idProyecto")
    @ManyToOne
    private Proyecto idProyecto;

    public Personal() {
    }

    public Personal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String getApellidoPersonal() {
        return apellidoPersonal;
    }

    public void setApellidoPersonal(String apellidoPersonal) {
        this.apellidoPersonal = apellidoPersonal;
    }

    public String getProfesionPersonal() {
        return profesionPersonal;
    }

    public void setProfesionPersonal(String profesionPersonal) {
        this.profesionPersonal = profesionPersonal;
    }

    public Integer getEdadPersonal() {
        return edadPersonal;
    }

    public void setEdadPersonal(Integer edadPersonal) {
        this.edadPersonal = edadPersonal;
    }

    public String getCategoriaPersonal() {
        return categoriaPersonal;
    }

    public void setCategoriaPersonal(String categoriaPersonal) {
        this.categoriaPersonal = categoriaPersonal;
    }

    public String getTipoDocumentoPesonal() {
        return tipoDocumentoPesonal;
    }

    public void setTipoDocumentoPesonal(String tipoDocumentoPesonal) {
        this.tipoDocumentoPesonal = tipoDocumentoPesonal;
    }

    public String getNDocumentoPersonal() {
        return nDocumentoPersonal;
    }

    public void setNDocumentoPersonal(String nDocumentoPersonal) {
        this.nDocumentoPersonal = nDocumentoPersonal;
    }

    public String getNContactoPersonal() {
        return nContactoPersonal;
    }

    public void setNContactoPersonal(String nContactoPersonal) {
        this.nContactoPersonal = nContactoPersonal;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
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
        hash += (idPersonal != null ? idPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.idPersonal == null && other.idPersonal != null) || (this.idPersonal != null && !this.idPersonal.equals(other.idPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.nuvi.entities.Personal[ idPersonal=" + idPersonal + " ]";
    }
    
}
