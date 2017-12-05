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
@Table(name = "tipodeproblematica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipodeproblematica.findAll", query = "SELECT t FROM Tipodeproblematica t")
    , @NamedQuery(name = "Tipodeproblematica.findByIdTipoProblematica", query = "SELECT t FROM Tipodeproblematica t WHERE t.idTipoProblematica = :idTipoProblematica")
    , @NamedQuery(name = "Tipodeproblematica.findByTipoProblematica", query = "SELECT t FROM Tipodeproblematica t WHERE t.tipoProblematica = :tipoProblematica")})
public class Tipodeproblematica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoProblematica")
    private Integer idTipoProblematica;
    @Size(max = 45)
    @Column(name = "tipoProblematica")
    private String tipoProblematica;
    @JoinColumn(name = "idCenso", referencedColumnName = "idCenso")
    @ManyToOne
    private Censo idCenso;

    public Tipodeproblematica() {
    }

    public Tipodeproblematica(Integer idTipoProblematica) {
        this.idTipoProblematica = idTipoProblematica;
    }

    public Integer getIdTipoProblematica() {
        return idTipoProblematica;
    }

    public void setIdTipoProblematica(Integer idTipoProblematica) {
        this.idTipoProblematica = idTipoProblematica;
    }

    public String getTipoProblematica() {
        return tipoProblematica;
    }

    public void setTipoProblematica(String tipoProblematica) {
        this.tipoProblematica = tipoProblematica;
    }

    public Censo getIdCenso() {
        return idCenso;
    }

    public void setIdCenso(Censo idCenso) {
        this.idCenso = idCenso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoProblematica != null ? idTipoProblematica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodeproblematica)) {
            return false;
        }
        Tipodeproblematica other = (Tipodeproblematica) object;
        if ((this.idTipoProblematica == null && other.idTipoProblematica != null) || (this.idTipoProblematica != null && !this.idTipoProblematica.equals(other.idTipoProblematica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.nuvi.entities.Tipodeproblematica[ idTipoProblematica=" + idTipoProblematica + " ]";
    }
    
}
