package com.example.pbokmnarkotikamerahputih.util;

import com.example.pbokmnarkotikamerahputih.model.KnowledgeRepository;
import com.example.pbokmnarkotikamerahputih.model.Putusan;

/**
 * ============================================================
 *  CLASS: DataDummy   [UTIL]
 *  Menyediakan minimal 50 data sampel Putusan untuk demo.
 * ============================================================
 */
public class DataDummy {

    private DataDummy() {}

    public static void muatData(KnowledgeRepository repository) {
        Object[][] data = {
                {"1001/Pid.Sus/2024/PN Sby","PN Surabaya","15-03-2024","Budi Santoso",34,"Sabu-Sabu",125.5,"Pasal 114 UU 35/2009","Pengedar",96,1500000.0,"H. Ahmad Fauzi"},
                {"1002/Pid.Sus/2024/PN Jkt","PN Jakarta Pusat","22-04-2024","Agus Prasetyo",28,"Ekstasi",500.0,"Pasal 112 UU 35/2009","Pengedar",72,800000.0,"H. Bambang Susilo"},
                {"1003/Pid.Sus/2024/PN Mks","PN Makassar","10-02-2024","Rudi Hartono",41,"Ganja",2500.0,"Pasal 111 UU 35/2009","Pengedar",84,1000000.0,"H. Rachmat Hidayat"},
                {"1004/Pid.Sus/2024/PN Mdn","PN Medan","05-11-2024","Siti Aminah",25,"Sabu-Sabu",75.3,"Pasal 127 UU 35/2009","Pengguna",24,200000.0,"Hj. Nur Azizah"},
                {"1005/Pid.Sus/2024/PN Bdg","PN Bandung","18-06-2024","Dedi Kurniawan",37,"Heroin",50.0,"Pasal 114 UU 35/2009","Pengedar",120,2000000.0,"H. Surya Atmaja"},
                {"1006/Pid.Sus/2024/PN Smg","PN Semarang","14-09-2024","Wahyu Nugroho",30,"Sabu-Sabu",200.0,"Pasal 114 UU 35/2009","Kurir",60,800000.0,"H. Dwi Prasetyo"},
                {"1007/Pid.Sus/2024/PN Plg","PN Palembang","27-07-2024","Andi Firmansyah",22,"Ganja",800.0,"Pasal 111 UU 35/2009","Pengguna",36,500000.0,"H. Zulkifli Harun"},
                {"1008/Pid.Sus/2024/PN Sby","PN Surabaya","03-08-2024","Dewi Rahayu",19,"Ekstasi",200.0,"Pasal 127 UU 35/2009","Pengguna",18,100000.0,"H. Ahmad Fauzi"},
                {"1009/Pid.Sus/2024/PN Dpk","PN Depok","11-12-2024","Rizky Maulana",26,"Sabu-Sabu",310.0,"Pasal 112 UU 35/2009","Pengedar",84,1200000.0,"Hj. Sri Wahyuni"},
                {"1010/Pid.Sus/2024/PN Tng","PN Tangerang","29-01-2024","Hendri Setiawan",45,"Tramadol",1000.0,"Pasal 197 UU 36/2009","Pengedar",48,300000.0,"H. Mulyadi Santosa"},
                {"1011/Pid.Sus/2024/PN Mks","PN Makassar","14-05-2024","Rahmat Hidayat",33,"Sabu-Sabu",450.0,"Pasal 114 UU 35/2009","Penyimpan",144,5000000.0,"H. Rachmat Hidayat"},
                {"1012/Pid.Sus/2024/PN Bdg","PN Bandung","21-03-2024","Yusuf Hidayat",29,"Ganja",1200.0,"Pasal 111 UU 35/2009","Pengedar",60,700000.0,"H. Surya Atmaja"},
                {"1013/Pid.Sus/2024/PN Jkt","PN Jakarta Selatan","08-10-2024","Cindy Lestari",24,"Ekstasi",150.0,"Pasal 112 UU 35/2009","Pengedar",54,600000.0,"H. Bambang Susilo"},
                {"1014/Pid.Sus/2024/PN Smg","PN Semarang","17-09-2024","Teguh Wibowo",38,"Sabu-Sabu",680.0,"Pasal 114 UU 35/2009","Kurir",72,900000.0,"H. Dwi Prasetyo"},
                {"1015/Pid.Sus/2024/PN Mdn","PN Medan","23-06-2024","Lina Marlina",31,"Heroin",35.0,"Pasal 127 UU 35/2009","Pengguna",30,300000.0,"Hj. Nur Azizah"},
                {"1016/Pid.Sus/2024/PN Sby","PN Surabaya","11-11-2024","Fajar Nugroho",27,"Sabu-Sabu",92.0,"Pasal 112 UU 35/2009","Pengedar",66,800000.0,"H. Ahmad Fauzi"},
                {"1017/Pid.Sus/2024/PN Plg","PN Palembang","04-04-2024","Maya Sari",23,"Ganja",600.0,"Pasal 111 UU 35/2009","Pengguna",24,200000.0,"H. Zulkifli Harun"},
                {"1018/Pid.Sus/2024/PN Dpk","PN Depok","19-08-2024","Irfan Setiadi",35,"Sabu-Sabu",1100.0,"Pasal 114 UU 35/2009","Penyimpan",180,8000000.0,"Hj. Sri Wahyuni"},
                {"1019/Pid.Sus/2024/PN Tng","PN Tangerang","26-02-2024","Nila Kusuma",20,"Ekstasi",80.0,"Pasal 127 UU 35/2009","Pengguna",12,100000.0,"H. Mulyadi Santosa"},
                {"1020/Pid.Sus/2024/PN Bdg","PN Bandung","07-07-2024","Eko Susanto",42,"Tramadol",2000.0,"Pasal 197 UU 36/2009","Pengedar",36,250000.0,"H. Surya Atmaja"},
                {"1021/Pid.Sus/2024/PN Sby","PN Surabaya","02-05-2024","Dian Pertiwi",28,"Sabu-Sabu",55.0,"Pasal 127 UU 35/2009","Pengguna",18,150000.0,"H. Ahmad Fauzi"},
                {"1022/Pid.Sus/2024/PN Mks","PN Makassar","30-08-2024","Syamsul Bahri",50,"Ganja",3500.0,"Pasal 111 UU 35/2009","Penyimpan",120,3000000.0,"H. Rachmat Hidayat"},
                {"1023/Pid.Sus/2024/PN Smg","PN Semarang","15-10-2024","Putri Wulandari",21,"Ekstasi",300.0,"Pasal 112 UU 35/2009","Kurir",48,500000.0,"H. Dwi Prasetyo"},
                {"1024/Pid.Sus/2024/PN Jkt","PN Jakarta Timur","12-07-2024","Hendra Wijaya",36,"Sabu-Sabu",780.0,"Pasal 114 UU 35/2009","Pengedar",96,1800000.0,"H. Bambang Susilo"},
                {"1025/Pid.Sus/2024/PN Mdn","PN Medan","01-06-2024","Fitri Handayani",27,"Heroin",65.0,"Pasal 114 UU 35/2009","Pengedar",90,1400000.0,"Hj. Nur Azizah"},
                {"1026/Pid.Sus/2024/PN Plg","PN Palembang","09-11-2024","Ahmad Dahlan",44,"Sabu-Sabu",420.0,"Pasal 112 UU 35/2009","Pengedar",78,1100000.0,"H. Zulkifli Harun"},
                {"1027/Pid.Sus/2024/PN Dpk","PN Depok","20-09-2024","Rini Susanti",26,"Ganja",950.0,"Pasal 111 UU 35/2009","Pengedar",54,600000.0,"Hj. Sri Wahyuni"},
                {"1028/Pid.Sus/2024/PN Tng","PN Tangerang","13-03-2024","Bambang Irawan",39,"Tramadol",1500.0,"Pasal 197 UU 36/2009","Pengedar",42,300000.0,"H. Mulyadi Santosa"},
                {"1029/Pid.Sus/2024/PN Sby","PN Surabaya","24-12-2024","Suryani Dewi",32,"Sabu-Sabu",235.0,"Pasal 114 UU 35/2009","Kurir",60,750000.0,"H. Ahmad Fauzi"},
                {"1030/Pid.Sus/2024/PN Bdg","PN Bandung","06-04-2024","Wahid Muharram",48,"Kokain",12.5,"Pasal 114 UU 35/2009","Pengguna",36,1000000.0,"H. Surya Atmaja"},
                {"1031/Pid.Sus/2024/PN Mks","PN Makassar","19-01-2024","Baharuddin Aco",53,"Sabu-Sabu",890.0,"Pasal 114 UU 35/2009","Penyimpan",156,6000000.0,"H. Rachmat Hidayat"},
                {"1032/Pid.Sus/2024/PN Smg","PN Semarang","08-05-2024","Endang Lestari",29,"Ganja",450.0,"Pasal 111 UU 35/2009","Pengedar",48,550000.0,"H. Dwi Prasetyo"},
                {"1033/Pid.Sus/2024/PN Jkt","PN Jakarta Barat","28-09-2024","Ridwan Kamil Jr",31,"Ekstasi",420.0,"Pasal 112 UU 35/2009","Pengedar",66,900000.0,"H. Bambang Susilo"},
                {"1034/Pid.Sus/2024/PN Mdn","PN Medan","16-07-2024","Nurlela Hasibuan",22,"Sabu-Sabu",145.0,"Pasal 112 UU 35/2009","Kurir",48,500000.0,"Hj. Nur Azizah"},
                {"1035/Pid.Sus/2024/PN Plg","PN Palembang","03-12-2024","Gunawan Prasetyo",40,"Heroin",28.0,"Pasal 127 UU 35/2009","Pengguna",24,200000.0,"H. Zulkifli Harun"},
                {"1036/Pid.Sus/2024/PN Dpk","PN Depok","11-10-2024","Sri Mulyaningsih",35,"Sabu-Sabu",560.0,"Pasal 114 UU 35/2009","Pengedar",84,1300000.0,"Hj. Sri Wahyuni"},
                {"1037/Pid.Sus/2024/PN Tng","PN Tangerang","25-04-2024","Lukman Hakim",37,"Ganja",1800.0,"Pasal 111 UU 35/2009","Pengedar",72,850000.0,"H. Mulyadi Santosa"},
                {"1038/Pid.Sus/2024/PN Sby","PN Surabaya","02-11-2024","Arief Rahman",24,"Ekstasi",250.0,"Pasal 112 UU 35/2009","Pengedar",60,700000.0,"H. Ahmad Fauzi"},
                {"1039/Pid.Sus/2024/PN Bdg","PN Bandung","17-06-2024","Tina Suhartini",33,"Tramadol",800.0,"Pasal 197 UU 36/2009","Pengedar",30,200000.0,"H. Surya Atmaja"},
                {"1040/Pid.Sus/2024/PN Mks","PN Makassar","09-02-2024","Muh. Arif Fadillah",27,"Sabu-Sabu",370.0,"Pasal 112 UU 35/2009","Pengedar",72,950000.0,"H. Rachmat Hidayat"},
                {"1041/Pid.Sus/2024/PN Smg","PN Semarang","22-06-2024","Agustina Prihatini",26,"Ganja",700.0,"Pasal 111 UU 35/2009","Pengguna",30,250000.0,"H. Dwi Prasetyo"},
                {"1042/Pid.Sus/2024/PN Jkt","PN Jakarta Utara","14-08-2024","Hendro Wicaksono",43,"Sabu-Sabu",1350.0,"Pasal 114 UU 35/2009","Penyimpan",168,7000000.0,"H. Bambang Susilo"},
                {"1043/Pid.Sus/2024/PN Mdn","PN Medan","03-04-2024","Zul Fahri Nasution",30,"Heroin",42.0,"Pasal 114 UU 35/2009","Pengedar",78,1050000.0,"Hj. Nur Azizah"},
                {"1044/Pid.Sus/2024/PN Plg","PN Palembang","21-10-2024","Ratna Dewi",25,"Ekstasi",180.0,"Pasal 112 UU 35/2009","Pengedar",54,650000.0,"H. Zulkifli Harun"},
                {"1045/Pid.Sus/2024/PN Dpk","PN Depok","16-11-2024","Dwi Susanto",38,"Sabu-Sabu",690.0,"Pasal 114 UU 35/2009","Kurir",78,1000000.0,"Hj. Sri Wahyuni"},
                {"1046/Pid.Sus/2024/PN Tng","PN Tangerang","07-05-2024","Supriyadi",46,"Tramadol",2500.0,"Pasal 197 UU 36/2009","Penyimpan",60,500000.0,"H. Mulyadi Santosa"},
                {"1047/Pid.Sus/2024/PN Sby","PN Surabaya","30-12-2024","Lilis Suryani",28,"Kokain",8.5,"Pasal 114 UU 35/2009","Pengedar",108,3500000.0,"H. Ahmad Fauzi"},
                {"1048/Pid.Sus/2024/PN Bdg","PN Bandung","25-07-2024","Dicky Firmansyah",32,"Sabu-Sabu",280.0,"Pasal 112 UU 35/2009","Pengedar",72,850000.0,"H. Surya Atmaja"},
                {"1049/Pid.Sus/2024/PN Mks","PN Makassar","12-04-2024","Nirmala Sari",23,"Ganja",550.0,"Pasal 111 UU 35/2009","Pengguna",24,200000.0,"H. Rachmat Hidayat"},
                {"1050/Pid.Sus/2024/PN Smg","PN Semarang","28-07-2024","Fandi Ahmad",34,"Sabu-Sabu",820.0,"Pasal 114 UU 35/2009","Pengedar",90,1350000.0,"H. Dwi Prasetyo"},
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
