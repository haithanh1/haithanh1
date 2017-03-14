/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facede;

import com.entity.LoaiSapham;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author username
 */
@Local
public interface LoaiSaphamFacadeLocal {

    void create(LoaiSapham loaiSapham);

    void edit(LoaiSapham loaiSapham);

    void remove(LoaiSapham loaiSapham);

    LoaiSapham find(Object id);

    List<LoaiSapham> findAll();

    List<LoaiSapham> findRange(int[] range);

    int count();
    
}
