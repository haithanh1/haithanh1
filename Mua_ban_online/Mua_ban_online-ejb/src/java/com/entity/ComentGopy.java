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
import javax.persistence.Lob;
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
@Table(name = "coment_gopy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComentGopy.findAll", query = "SELECT c FROM ComentGopy c")
    , @NamedQuery(name = "ComentGopy.findByMagopy", query = "SELECT c FROM ComentGopy c WHERE c.magopy = :magopy")
    , @NamedQuery(name = "ComentGopy.findByTieuDe", query = "SELECT c FROM ComentGopy c WHERE c.tieuDe = :tieuDe")
    , @NamedQuery(name = "ComentGopy.findByNgayTl", query = "SELECT c FROM ComentGopy c WHERE c.ngayTl = :ngayTl")})
public class ComentGopy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "magopy")
    private Integer magopy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tieu_de")
    private String tieuDe;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "noi_dung")
    private String noiDung;
    @Size(max = 10)
    @Column(name = "ngay_tl")
    private String ngayTl;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "noi_dung_tl")
    private String noiDungTl;
    @JoinColumn(name = "maKH", referencedColumnName = "MaKH")
    @ManyToOne(optional = false)
    private Login maKH;

    public ComentGopy() {
    }

    public ComentGopy(Integer magopy) {
        this.magopy = magopy;
    }

    public ComentGopy(Integer magopy, String tieuDe, String noiDung) {
        this.magopy = magopy;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
    }

    public Integer getMagopy() {
        return magopy;
    }

    public void setMagopy(Integer magopy) {
        this.magopy = magopy;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNgayTl() {
        return ngayTl;
    }

    public void setNgayTl(String ngayTl) {
        this.ngayTl = ngayTl;
    }

    public String getNoiDungTl() {
        return noiDungTl;
    }

    public void setNoiDungTl(String noiDungTl) {
        this.noiDungTl = noiDungTl;
    }

    public Login getMaKH() {
        return maKH;
    }

    public void setMaKH(Login maKH) {
        this.maKH = maKH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (magopy != null ? magopy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComentGopy)) {
            return false;
        }
        ComentGopy other = (ComentGopy) object;
        if ((this.magopy == null && other.magopy != null) || (this.magopy != null && !this.magopy.equals(other.magopy))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ComentGopy[ magopy=" + magopy + " ]";
    }
    
}
