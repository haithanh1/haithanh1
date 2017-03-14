/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facede;

import com.entity.GioHang;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author username
 */
@Local
public interface GioHangFacadeLocal {

    void create(GioHang gioHang);

    void edit(GioHang gioHang);

    void remove(GioHang gioHang);

    GioHang find(Object id);

    List<GioHang> findAll();

    List<GioHang> findRange(int[] range);

    int count();
    
}
