package com.example.pbokmnarkotikamerahputih.model;

import java.util.List;

public class StatistikPutusan implements IPelaporan {
    protected List<Putusan> data;
    protected int totalKasus;
    protected double rataRataHukuman;
    protected double rataRataDenda;

    public StatistikPutusan(List<Putusan> data) {
        this.data = data;
        hitungData();
    }

    @Override
    public void hitungData() {
        totalKasus = data.size();
        if (totalKasus == 0) {
            rataRataHukuman = 0;
            rataRataDenda = 0;
            return;
        }
        double totalHukuman = 0, totalDenda = 0;
        for (Putusan p : data) {
            totalHukuman += p.getLamaHukumanBulan();
            totalDenda += p.getJumlahDenda();
        }
        rataRataHukuman = totalHukuman / totalKasus;
        rataRataDenda = totalDenda / totalKasus;
    }

    @Override
    public void tampilkanLaporan() {
        System.out.println("=== LAPORAN STATISTIK KESELURUHAN ===");
        System.out.printf("Total Kasus: %d%n", totalKasus);
        System.out.printf("Rata-rata Hukuman: %.2f bulan%n", rataRataHukuman);
        System.out.printf("Rata-rata Denda: Rp %.2f%n", rataRataDenda);
    }
}