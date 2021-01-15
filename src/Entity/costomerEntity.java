package Entity;

import java.util.Date;

public class costomerEntity {
    
    private int nomerid,umur;
    public String nama,tanggal,alamat,kota,password,notelp;

    public costomerEntity(int nomerid, int umur, String notelp, String nama, String tanggal, String alamat, String kota, String password) {
        this.nomerid = nomerid;
        this.umur = umur;
        this.notelp = notelp;
        this.nama = nama;
        this.tanggal = tanggal;
        this.alamat = alamat;
        this.kota = kota;
        this.password = password;
    }

    public int getNomerid() {
        return nomerid;
    }

    public int getUmur() {
        return umur;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKota() {
        return kota;
    }

    public String getPassword() {
        return password;
    }

    public void setNomerid(int nomerid) {
        this.nomerid = nomerid;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}