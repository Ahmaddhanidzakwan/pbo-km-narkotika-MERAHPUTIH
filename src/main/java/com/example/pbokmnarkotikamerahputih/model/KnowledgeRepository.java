package com.example.pbokmnarkotikamerahputih.model;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeRepository {
    private final List<Putusan> daftarPutusan;

    public KnowledgeRepository() {
        daftarPutusan = new ArrayList<>();
    }

    public void tambahPutusan(Putusan putusan) {
        if (putusan != null) {
            daftarPutusan.add(putusan);
        }
    }

    public List<Putusan> getSemuaPutusan() {
        return new ArrayList<>(daftarPutusan);
    }

    public Putusan cariBerdasarkanNomor(String nomor) {
        for (Putusan p : daftarPutusan) {
            if (p.getNomorPerkara().equalsIgnoreCase(nomor)) {
                return p;
            }
        }
        return null;
    }

    public boolean hapusPutusan(String nomor) {
        return daftarPutusan.removeIf(p -> p.getNomorPerkara().equalsIgnoreCase(nomor));
    }

    public int getJumlahData() {
        return daftarPutusan.size();
    }
}