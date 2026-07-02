package com.example.pbokmnarkotikamerahputih.model;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeRepository {
    private final List<Putusan> daftarPutusan;

    public KnowledgeRepository() {
        daftarPutusan = new ArrayList<>();
    }

    public void tambahPutusan(Putusan putusan) {
        if (putusan != null) daftarPutusan.add(putusan);
    }

    public List<Putusan> getSemuaPutusan() {
        return new ArrayList<>(daftarPutusan);
    }
}