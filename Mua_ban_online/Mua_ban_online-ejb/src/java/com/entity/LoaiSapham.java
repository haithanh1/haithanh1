/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author username
 */
@Entity
@Table(name = "loai_sapham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoaiSapham.findAll", query = "SELECT l FROM LoaiSapham l")
    , @NamedQuery(name = "LoaiSapham.findByMaLoaisp", query = "SELECT l FROM LoaiSapham l WHERE l.maLoaisp = :maLoaisp")
    , @NamedQuery(name = "LoaiSapham.findByTenLoaisp", query = "SELECT l FROM LoaiSapham l WHERE l.tenLoaisp = :tenLoaisp")})
public class LoaiSapham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ma_loaisp")
    private String maLoaisp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ten_loaisp")
    private String tenLoaisp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maLoaisp")
    private List<SanPham> sanPhamList;

    public LoaiSapham() {
    }

    public LoaiSapham(String maLoaisp) {
        this.maLoaisp = maLoaisp;
    }

    public LoaiSapham(String maLoaisp, String tenLoaisp) {
        this.maLoaisp = maLoaisp;
        this.tenLoaisp = tenLoaisp;
    }

    public String getMaLoaisp() {
        return maLoaisp;
    }

    public void setMaLoaisp(String maLoaisp) {
        this.maLoaisp = maLoaisp;
    }

    public String getTenLoaisp() {
        return tenLoaisp;
    }

    public void setTenLoaisp(String tenLoaisp) {
        this.tenLoaisp = tenLoaisp;
    }

    @XmlTransient
    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maLoaisp != null ? maLoaisp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoaiSapham)) {
            return false;
        }
        LoaiSapham other = (LoaiSapham) object;
        if ((this.maLoaisp == null && other.maLoaisp != null) || (this.maLoaisp != null && !this.maLoaisp.equals(other.maLoaisp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.LoaiSapham[ maLoaisp=" + maLoaisp + " ]";
    }
    
}
