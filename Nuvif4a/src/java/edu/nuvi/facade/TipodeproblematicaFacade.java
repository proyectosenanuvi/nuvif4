/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuvi.facade;

import edu.nuvi.entities.Tipodeproblematica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class TipodeproblematicaFacade extends AbstractFacade<Tipodeproblematica> {

    @PersistenceContext(unitName = "Nuvif4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipodeproblematicaFacade() {
        super(Tipodeproblematica.class);
    }
    
}
