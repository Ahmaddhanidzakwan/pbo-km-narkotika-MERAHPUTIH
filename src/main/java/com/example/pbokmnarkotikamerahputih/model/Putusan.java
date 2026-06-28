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
}
public String getNomorPerkara() { return nomorPerkara; }
public void setNomorPerkara(String nomorPerkara) { this.nomorPerkara = nomorPerkara; }

public String getPengadilan() { return pengadilan; }
public void setPengadilan(String pengadilan) { this.pengadilan = pengadilan; }

public String getTanggalPutusan() { return tanggalPutusan; }
public void setTanggalPutusan(String tanggalPutusan) { this.tanggalPutusan = tanggalPutusan; }

public String getNamaTerdakwa() { return namaTerdakwa; }
public void setNamaTerdakwa(String namaTerdakwa) { this.namaTerdakwa = namaTerdakwa; }

public int getUmurTerdakwa() { return umurTerdakwa; }
public void setUmurTerdakwa(int umurTerdakwa) { this.umurTerdakwa = umurTerdakwa; }

public String getJenisNarkotika() { return jenisNarkotika; }
public void setJenisNarkotika(String jenisNarkotika) { this.jenisNarkotika = jenisNarkotika; }

public double getBeratBarangBukti() { return beratBarangBukti; }
public void setBeratBarangBukti(double beratBarangBukti) { this.beratBarangBukti = beratBarangBukti; }

public String getPasalDilanggar() { return pasalDilanggar; }
public void setPasalDilanggar(String pasalDilanggar) { this.pasalDilanggar = pasalDilanggar; }

public String getPeranTerdakwa() { return peranTerdakwa; }
public void setPeranTerdakwa(String peranTerdakwa) { this.peranTerdakwa = peranTerdakwa; }

public int getLamaHukumanBulan() { return lamaHukumanBulan; }
public void setLamaHukumanBulan(int lamaHukumanBulan) { this.lamaHukumanBulan = lamaHukumanBulan; }

public double getJumlahDenda() { return jumlahDenda; }
public void setJumlahDenda(double jumlahDenda) { this.jumlahDenda = jumlahDenda; }

public String getNamaHakim() { return namaHakim; }
public void setNamaHakim(String namaHakim) { this.namaHakim = namaHakim; }