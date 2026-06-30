package com.example.pbokmnarkotikamerahputih.model;

import java.util.List;

public class StatistikPutusan implements IPelaporan {
    protected List<Putusan> data;
    protected int totalKasus;
    protected double rataRataHukuman;
    protected double rataRataDenda;

    public StatistikPutusan(List<Putusan> data) {
        this.data = data;
    }

    @Override
    public void hitungData() {
        totalKasus = data.size();
        if (totalKasus == 0) {
            rataRataHukuman = 0;
            rataRataDenda = 0;
            return;
        }
    }
}