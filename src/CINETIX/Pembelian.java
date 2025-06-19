/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CINETIX;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Arta
 */
@Entity
@Table(name = "pembelian")
@NamedQueries({
    @NamedQuery(name = "Pembelian.findAll", query = "SELECT p FROM Pembelian p"),
    @NamedQuery(name = "Pembelian.findByNomorIdentitas", query = "SELECT p FROM Pembelian p WHERE p.nomorIdentitas = :nomorIdentitas"),
    @NamedQuery(name = "Pembelian.findByNama", query = "SELECT p FROM Pembelian p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pembelian.findByPilihFilm", query = "SELECT p FROM Pembelian p WHERE p.pilihFilm = :pilihFilm"),
    @NamedQuery(name = "Pembelian.findByPilihBangku", query = "SELECT p FROM Pembelian p WHERE p.pilihBangku = :pilihBangku"),
    @NamedQuery(name = "Pembelian.findByTanggal", query = "SELECT p FROM Pembelian p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "Pembelian.findByMetodePembayaran", query = "SELECT p FROM Pembelian p WHERE p.metodePembayaran = :metodePembayaran")})
public class Pembelian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nomor_identitas")
    private Integer nomorIdentitas;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "pilih_film")
    private String pilihFilm;
    @Basic(optional = false)
    @Column(name = "pilih_bangku")
    private String pilihBangku;
    @Basic(optional = false)
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Basic(optional = false)
    @Column(name = "metode_pembayaran")
    private String metodePembayaran;

    public Pembelian() {
    }

    public Pembelian(Integer nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }

    public Pembelian(Integer nomorIdentitas, String nama, String pilihFilm, String pilihBangku, Date tanggal, String metodePembayaran) {
        this.nomorIdentitas = nomorIdentitas;
        this.nama = nama;
        this.pilihFilm = pilihFilm;
        this.pilihBangku = pilihBangku;
        this.tanggal = tanggal;
        this.metodePembayaran = metodePembayaran;
    }

    public Integer getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void setNomorIdentitas(Integer nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPilihFilm() {
        return pilihFilm;
    }

    public void setPilihFilm(String pilihFilm) {
        this.pilihFilm = pilihFilm;
    }

    public String getPilihBangku() {
        return pilihBangku;
    }

    public void setPilihBangku(String pilihBangku) {
        this.pilihBangku = pilihBangku;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomorIdentitas != null ? nomorIdentitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pembelian)) {
            return false;
        }
        Pembelian other = (Pembelian) object;
        if ((this.nomorIdentitas == null && other.nomorIdentitas != null) || (this.nomorIdentitas != null && !this.nomorIdentitas.equals(other.nomorIdentitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CINETIX.Pembelian[ nomorIdentitas=" + nomorIdentitas + " ]";
    }
    
}
