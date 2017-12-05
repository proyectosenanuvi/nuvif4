/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuvi.facade;

import edu.nuvi.entities.Donacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class DonacionFacade extends AbstractFacade<Donacion> {

    @PersistenceContext(unitName = "Nuvif4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DonacionFacade() {
        super(Donacion.class);
    }
    
}
