package com.example.selectionwidget;

public class alamat {
    // Membuat fungsi internal
    private String daerah;
    private String kota;
    private String provinsi;

    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini kita dapat menginput data
    public alamat(String daerah, String kota, String provinsi) {
        this.daerah = daerah;
        this.kota = kota;
        this.provinsi = provinsi;
    }
    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini akan mengembalikan nilainya sendiri
    public String getDaerah() {
        return daerah;
    }
    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini kita dapat menginput data
    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini akan mengembalikan nilainya sendiri
    public String getKota() {
        return kota;
    }
    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini kita dapat menginput data
    public void setKota(String kota) {
        this.kota = kota;
    }

    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini akan mengembalikan nilainya sendiri
    public String getProvinsi() {
        return provinsi;
    }
    // membuat fungsi yang dapat di akses dimana saja pada fungsi ini kita dapat menginput data
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
}

