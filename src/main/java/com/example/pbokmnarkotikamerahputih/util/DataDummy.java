package com.example.pbokmnarkotikamerahputih.util;

import com.example.pbokmnarkotikamerahputih.model.KnowledgeRepository;
import com.example.pbokmnarkotikamerahputih.model.Putusan;

public class DataDummy {

    private DataDummy() {}

    public static void muatData(KnowledgeRepository repository) {
        Object[][] data = {
                {"2434/Pid.Sus/2023/PN Sby","PN Surabaya","18-01-2024","Heru Oktavianto Bin Suprapto",26,"Sabu-Sabu, Pil Double L",0.375,"Pasal 112 Ayat (1) Jo Pasal 132 Ayat (1) UU 35/2009 Jo Pasal 436 Ayat (2) Jo Pasal 145 Ayat (1) dan (2) UU 17/2023 Jo Pasal 55 Ayat (1) Ke-1 KUHP","Penyimpan & Pengedar",90,1000000000.0,"Taufan Mandala, S.H., M.Hum."},
                {"2434/Pid.Sus/2023/PN Sby","PN Surabaya","18-01-2024","Agus Priyono Bin Suyadi",23,"Sabu-Sabu, Pil Double L",0.375,"Pasal 112 Ayat (1) Jo Pasal 132 Ayat (1) UU 35/2009 Jo Pasal 436 Ayat (2) Jo Pasal 145 Ayat (1) dan (2) UU 17/2023 Jo Pasal 55 Ayat (1) Ke-1 KUHP","Penyimpan & Pembantu",84,1000000000.0,"Taufan Mandala, S.H., M.Hum."},
                {"2439/Pid.Sus/2023/PN Sby","PN Surabaya","-","Moh. Hanik Faisol als Daniel Bin Faisol",30,"Sabu-Sabu",98.902,"Pasal 114 Ayat (2) Jo Pasal 132 Ayat (1) UU 35/2009","Perantara Jual Beli",120,2000000000.0,"-"},
                {"2439/Pid.Sus/2023/PN Sby","PN Surabaya","-","M. Sofyan Mashuri Bin Aruman",28,"Sabu-Sabu",98.902,"Pasal 114 Ayat (2) Jo Pasal 132 Ayat (1) UU 35/2009","Pencari Pesanan",144,2000000000.0,"-"},
                {"2439/Pid.Sus/2023/PN Sby","PN Surabaya","-","Djiwo Bin Sariyah",61,"Sabu-Sabu",98.902,"Pasal 114 Ayat (2) Jo Pasal 132 Ayat (1) UU 35/2009","Penghubung & Pembantu",144,2000000000.0,"-"},
                {"2454/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2459/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2465/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2466/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2471/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2472/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2473/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2478/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2487/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2488/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2495/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2506/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2511/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2512/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2514/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2521/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2522/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2524/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2525/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2526/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2528/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2532/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2533/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2536/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2539/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2540/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2553/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2554/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2558/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2560/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2561/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2572/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2575/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2582/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2586/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2587/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2594/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2595/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2598/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2599/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2600/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2603/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2604/Pid.Sus/2023/PN Sby","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"2725/K/Pid.Sus/2025","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"},
                {"4024/K/Pid.Sus/2025","PN Surabaya","-","-",-,"-",-,"-","-",-,-,"-"}
        };

        for (Object[] d : data) {
            try {
                Putusan p = new Putusan(
                        (String) d[0], (String) d[1], (String) d[2], (String) d[3],
                        (int) d[4],    (String) d[5], (double) d[6], (String) d[7],
                        (String) d[8], (int) d[9],    (double) d[10],(String) d[11]
                );
                repository.simpan(p);
            } catch (Exception e) {
                System.err.println("Gagal memuat dummy: " + d[0] + " - " + e.getMessage());
            }
        }
    }
}