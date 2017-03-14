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
@Table(name = "khach_hang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhachHang.findAll", query = "SELECT k FROM KhachHang k")
    , @NamedQuery(name = "KhachHang.findByStt", query = "SELECT k FROM KhachHang k WHERE k.stt = :stt")
    , @NamedQuery(name = "KhachHang.findByFistname", query = "SELECT k FROM KhachHang k WHERE k.fistname = :fistname")
    , @NamedQuery(name = "KhachHang.findByLastName", query = "SELECT k FROM KhachHang k WHERE k.lastName = :lastName")
    , @NamedQuery(name = "KhachHang.findBySoDt", query = "SELECT k FROM KhachHang k WHERE k.soDt = :soDt")
    , @NamedQuery(name = "KhachHang.findByEmail", query = "SELECT k FROM KhachHang k WHERE k.email = :email")
    , @NamedQuery(name = "KhachHang.findByDiachi", query = "SELECT k FROM KhachHang k WHERE k.diachi = :diachi")})
public class KhachHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private Integer stt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Fist_name")
    private String fistname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "so_dt")
    private int soDt;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "diachi")
    private String diachi;
    @JoinColumn(name = "maKH", referencedColumnName = "MaKH")
    @ManyToOne(optional = false)
    private Login maKH;

    public KhachHang() {
    }

    public KhachHang(Integer stt) {
        this.stt = stt;
    }

    public KhachHang(Integer stt, String fistname, String lastName, int soDt, String diachi) {
        this.stt = stt;
        this.fistname = fistname;
        this.lastName = lastName;
        this.soDt = soDt;
        this.diachi = diachi;
    }

    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSoDt() {
        return soDt;
    }

    public void setSoDt(int soDt) {
        this.soDt = soDt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
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
        hash += (stt != null ? stt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhachHang)) {
            return false;
        }
        KhachHang other = (KhachHang) object;
        if ((this.stt == null && other.stt != null) || (this.stt != null && !this.stt.equals(other.stt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.KhachHang[ stt=" + stt + " ]";
    }
    
}
