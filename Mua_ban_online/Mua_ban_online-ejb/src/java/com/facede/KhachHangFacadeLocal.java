/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facede;

import com.entity.KhachHang;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author username
 */
@Local
public interface KhachHangFacadeLocal {

    void create(KhachHang khachHang);

    void edit(KhachHang khachHang);

    void remove(KhachHang khachHang);

    KhachHang find(Object id);

    List<KhachHang> findAll();

    List<KhachHang> findRange(int[] range);

    int count();
    
}
