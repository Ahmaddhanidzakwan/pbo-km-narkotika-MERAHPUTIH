package com.example.pbokmnarkotikamerahputih.model;

import java.util.ArrayList;
import java.util.List;

public class StatistikPutusanTahunan extends StatistikPutusan {
    private String tahun;

    public StatistikPutusanTahunan(List<Putusan> semuaData, String tahun) {
        super(filterData(semuaData, tahun));
        this.tahun = tahun;
    }

    private static List<Putusan> filterData(List<Putusan> semuaData, String tahun) {
        List<Putusan> hasil = new ArrayList<>();
        for (Putusan p : semuaData) {
            if (p.getTanggalPutusan() != null && p.getTanggalPutusan().endsWith(tahun))
                hasil.add(p);
        }
        return hasil;
    }

    @Override
    public void tampilkanLaporan() {
        System.out.printf("=== LAPORAN TAHUN %s ===%n", tahun);
        super.tampilkanLaporan();
    }
}