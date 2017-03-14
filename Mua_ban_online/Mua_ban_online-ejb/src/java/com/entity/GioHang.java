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
@Table(name = "gio_hang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GioHang.findAll", query = "SELECT g FROM GioHang g")
    , @NamedQuery(name = "GioHang.findByMaSp", query = "SELECT g FROM GioHang g WHERE g.maSp = :maSp")
    , @NamedQuery(name = "GioHang.findByTenNcungcap", query = "SELECT g FROM GioHang g WHERE g.tenNcungcap = :tenNcungcap")
    , @NamedQuery(name = "GioHang.findBySoLuongDat", query = "SELECT g FROM GioHang g WHERE g.soLuongDat = :soLuongDat")
    , @NamedQuery(name = "GioHang.findByTinhTrang", query = "SELECT g FROM GioHang g WHERE g.tinhTrang = :tinhTrang")
    , @NamedQuery(name = "GioHang.findByNgayDat", query = "SELECT g FROM GioHang g WHERE g.ngayDat = :ngayDat")})
public class GioHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_sp")
    private Integer maSp;
    @Size(max = 30)
    @Column(name = "ten_Ncungcap")
    private String tenNcungcap;
    @Basic(optional = false)
    @NotNull
    @Column(name = "so_luong_dat")
    private int soLuongDat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tinh_trang")
    private String tinhTrang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ngay_dat")
    private String ngayDat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSp")
    private List<SanPham> sanPhamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSp")
    private List<HoaDon> hoaDonList;

    public GioHang() {
    }

    public GioHang(Integer maSp) {
        this.maSp = maSp;
    }

    public GioHang(Integer maSp, int soLuongDat, String tinhTrang, String ngayDat) {
        this.maSp = maSp;
        this.soLuongDat = soLuongDat;
        this.tinhTrang = tinhTrang;
        this.ngayDat = ngayDat;
    }

    public Integer getMaSp() {
        return maSp;
    }

    public void setMaSp(Integer maSp) {
        this.maSp = maSp;
    }

    public String getTenNcungcap() {
        return tenNcungcap;
    }

    public void setTenNcungcap(String tenNcungcap) {
        this.tenNcungcap = tenNcungcap;
    }

    public int getSoLuongDat() {
        return soLuongDat;
    }

    public void setSoLuongDat(int soLuongDat) {
        this.soLuongDat = soLuongDat;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    @XmlTransient
    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    @XmlTransient
    public List<HoaDon> getHoaDonList() {
        return hoaDonList;
    }

    public void setHoaDonList(List<HoaDon> hoaDonList) {
        this.hoaDonList = hoaDonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maSp != null ? maSp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GioHang)) {
            return false;
        }
        GioHang other = (GioHang) object;
        if ((this.maSp == null && other.maSp != null) || (this.maSp != null && !this.maSp.equals(other.maSp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.GioHang[ maSp=" + maSp + " ]";
    }
    
}
