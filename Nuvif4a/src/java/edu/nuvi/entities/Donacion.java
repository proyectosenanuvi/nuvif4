/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuvi.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "donacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donacion.findAll", query = "SELECT d FROM Donacion d")
    , @NamedQuery(name = "Donacion.findByIdDonacion", query = "SELECT d FROM Donacion d WHERE d.idDonacion = :idDonacion")
    , @NamedQuery(name = "Donacion.findByNombreDonador", query = "SELECT d FROM Donacion d WHERE d.nombreDonador = :nombreDonador")
    , @NamedQuery(name = "Donacion.findByTipoDocumentoDonador", query = "SELECT d FROM Donacion d WHERE d.tipoDocumentoDonador = :tipoDocumentoDonador")
    , @NamedQuery(name = "Donacion.findByNDocumentoDonador", query = "SELECT d FROM Donacion d WHERE d.nDocumentoDonador = :nDocumentoDonador")
    , @NamedQuery(name = "Donacion.findByNContactoDonador", query = "SELECT d FROM Donacion d WHERE d.nContactoDonador = :nContactoDonador")
    , @NamedQuery(name = "Donacion.findByEmailDonador", query = "SELECT d FROM Donacion d WHERE d.emailDonador = :emailDonador")
    , @NamedQuery(name = "Donacion.findByValorDonacion", query = "SELECT d FROM Donacion d WHERE d.valorDonacion = :valorDonacion")
    , @NamedQuery(name = "Donacion.findByFechaDonacion", query = "SELECT d FROM Donacion d WHERE d.fechaDonacion = :fechaDonacion")})
public class Donacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDonacion")
    private Integer idDonacion;
    @Size(max = 45)
    @Column(name = "nombreDonador")
    private String nombreDonador;
    @Size(max = 45)
    @Column(name = "tipoDocumentoDonador")
    private String tipoDocumentoDonador;
    @Size(max = 45)
    @Column(name = "nDocumentoDonador")
    private String nDocumentoDonador;
    @Size(max = 45)
    @Column(name = "nContactoDonador")
    private String nContactoDonador;
    @Size(max = 45)
    @Column(name = "emailDonador")
    private String emailDonador;
    @Column(name = "valorDonacion")
    private Integer valorDonacion;
    @Column(name = "fechaDonacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDonacion;
    @JoinColumn(name = "idProyecto", referencedColumnName = "idProyecto")
    @ManyToOne
    private Proyecto idProyecto;

    public Donacion() {
    }

    public Donacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Integer getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public String getNombreDonador() {
        return nombreDonador;
    }

    public void setNombreDonador(String nombreDonador) {
        this.nombreDonador = nombreDonador;
    }

    public String getTipoDocumentoDonador() {
        return tipoDocumentoDonador;
    }

    public void setTipoDocumentoDonador(String tipoDocumentoDonador) {
        this.tipoDocumentoDonador = tipoDocumentoDonador;
    }

    public String getNDocumentoDonador() {
        return nDocumentoDonador;
    }

    public void setNDocumentoDonador(String nDocumentoDonador) {
        this.nDocumentoDonador = nDocumentoDonador;
    }

    public String getNContactoDonador() {
        return nContactoDonador;
    }

    public void setNContactoDonador(String nContactoDonador) {
        this.nContactoDonador = nContactoDonador;
    }

    public String getEmailDonador() {
        return emailDonador;
    }

    public void setEmailDonador(String emailDonador) {
        this.emailDonador = emailDonador;
    }

    public Integer getValorDonacion() {
        return valorDonacion;
    }

    public void setValorDonacion(Integer valorDonacion) {
        this.valorDonacion = valorDonacion;
    }

    public Date getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
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
        hash += (idDonacion != null ? idDonacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donacion)) {
            return false;
        }
        Donacion other = (Donacion) object;
        if ((this.idDonacion == null && other.idDonacion != null) || (this.idDonacion != null && !this.idDonacion.equals(other.idDonacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.nuvi.entities.Donacion[ idDonacion=" + idDonacion + " ]";
    }
    
}
