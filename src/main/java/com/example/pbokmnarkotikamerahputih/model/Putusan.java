package com.example.pbokmnarkotikamerahputih.model;

public class Putusan {
    private String nomorPerkara;
    private String pengadilan;
    private String tanggalPutusan;
    private String namaTerdakwa;
    private int umurTerdakwa;
    private String jenisNarkotika;
    private double beratBarangBukti;
    private String pasalDilanggar;
    private String peranTerdakwa;
    private int lamaHukumanBulan;
    private double jumlahDenda;
    private String namaHakim;
}
public Putusan() {}

public Putusan(String nomorPerkara, String pengadilan, String tanggalPutusan,
               String namaTerdakwa, int umurTerdakwa, String jenisNarkotika,
               double beratBarangBukti, String pasalDilanggar, String peranTerdakwa,
               int lamaHukumanBulan, double jumlahDenda, String namaHakim) {
    this.nomorPerkara = nomorPerkara;
    this.pengadilan = pengadilan;
    this.tanggalPutusan = tanggalPutusan;
    this.namaTerdakwa = namaTerdakwa;
    this.umurTerdakwa = umurTerdakwa;
    this.jenisNarkotika = jenisNarkotika;
    this.beratBarangBukti = beratBarangBukti;
    this.pasalDilanggar = pasalDilanggar;
    this.peranTerdakwa = peranTerdakwa;
    this.lamaHukumanBulan = lamaHukumanBulan;
    this.jumlahDenda = jumlahDenda;
    this.namaHakim = namaHakim;
}