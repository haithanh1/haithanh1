/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author username
 */
@Entity
@Table(name = "san_pham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPham.findAll", query = "SELECT s FROM SanPham s")
    , @NamedQuery(name = "SanPham.findById", query = "SELECT s FROM SanPham s WHERE s.id = :id")
    , @NamedQuery(name = "SanPham.findByTenSp", query = "SELECT s FROM SanPham s WHERE s.tenSp = :tenSp")
    , @NamedQuery(name = "SanPham.findBySoLuongSp", query = "SELECT s FROM SanPham s WHERE s.soLuongSp = :soLuongSp")
    , @NamedQuery(name = "SanPham.findByGiaTien", query = "SELECT s FROM SanPham s WHERE s.giaTien = :giaTien")
    , @NamedQuery(name = "SanPham.findByMota", query = "SELECT s FROM SanPham s WHERE s.mota = :mota")})
public class SanPham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten_sp")
    private String tenSp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "so_luong_sp")
    private int soLuongSp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gia_tien")
    private int giaTien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "mota")
    private String mota;
    @JoinColumn(name = "ma_sp", referencedColumnName = "ma_sp")
    @ManyToOne(optional = false)
    private GioHang maSp;
    @JoinColumn(name = "ma_loaisp", referencedColumnName = "ma_loaisp")
    @ManyToOne(optional = false)
    private LoaiSapham maLoaisp;

    public SanPham() {
    }

    public SanPham(Integer id) {
        this.id = id;
    }

    public SanPham(Integer id, String tenSp, int soLuongSp, int giaTien, String mota) {
        this.id = id;
        this.tenSp = tenSp;
        this.soLuongSp = soLuongSp;
        this.giaTien = giaTien;
        this.mota = mota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuongSp() {
        return soLuongSp;
    }

    public void setSoLuongSp(int soLuongSp) {
        this.soLuongSp = soLuongSp;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public GioHang getMaSp() {
        return maSp;
    }

    public void setMaSp(GioHang maSp) {
        this.maSp = maSp;
    }

    public LoaiSapham getMaLoaisp() {
        return maLoaisp;
    }

    public void setMaLoaisp(LoaiSapham maLoaisp) {
        this.maLoaisp = maLoaisp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SanPham)) {
            return false;
        }
        SanPham other = (SanPham) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.SanPham[ id=" + id + " ]";
    }
    
}
