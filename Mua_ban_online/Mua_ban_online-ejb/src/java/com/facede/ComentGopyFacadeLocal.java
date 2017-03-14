/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facede;

import com.entity.ComentGopy;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author username
 */
@Local
public interface ComentGopyFacadeLocal {

    void create(ComentGopy comentGopy);

    void edit(ComentGopy comentGopy);

    void remove(ComentGopy comentGopy);

    ComentGopy find(Object id);

    List<ComentGopy> findAll();

    List<ComentGopy> findRange(int[] range);

    int count();
    
}
