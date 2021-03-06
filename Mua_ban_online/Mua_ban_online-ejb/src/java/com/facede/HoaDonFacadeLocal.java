/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facede;

import com.entity.HoaDon;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author username
 */
@Local
public interface HoaDonFacadeLocal {

    void create(HoaDon hoaDon);

    void edit(HoaDon hoaDon);

    void remove(HoaDon hoaDon);

    HoaDon find(Object id);

    List<HoaDon> findAll();

    List<HoaDon> findRange(int[] range);

    int count();
    
}
