/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuvi.facade;

import edu.nuvi.entities.Censo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class CensoFacade extends AbstractFacade<Censo> {

    @PersistenceContext(unitName = "Nuvif4aPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CensoFacade() {
        super(Censo.class);
    }
    
}
