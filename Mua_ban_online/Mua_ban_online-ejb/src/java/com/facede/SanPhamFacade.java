/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facede;

import com.entity.SanPham;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author username
 */
@Stateless
public class SanPhamFacade extends AbstractFacade<SanPham> implements SanPhamFacadeLocal {

    @PersistenceContext(unitName = "Mua_ban_online-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SanPhamFacade() {
        super(SanPham.class);
    }
    
}
