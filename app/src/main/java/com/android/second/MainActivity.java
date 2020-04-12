package com.android.second;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<weapon> lstWeapon;

    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstWeapon = new ArrayList<>();
        lstWeapon.add(new weapon("AK-47","keterangan Senjata :  " +
                "                                         " +
                "singkatan dari Avtomat Kalashnikova 1947,adalah senapan serbu yang dirancang oleh Mikhail Kalashnikov, " +
                "diproduksi oleh pembuat senjata Rusia IZhMASh, dan digunakan oleh banyak negara Blok Timur semasa Perang Dingin. " +
                "Senapan ini diadopsi dan dijadikan senapan standar Uni Soviet pada tahun 1947.[2] Jika dibandingkan dengan senapan yang digunakan semasa Perang Dunia II, " +
                "AK-47 mempunyai ukuran lebih kecil, dengan jangkauan yang lebih pendek, " +
                "memakai peluru dengan kaliber 7,62 x 39 mm yang lebih kecil, dan memiliki pilihan tembakan (selective-fire)." +
                "AK-47 termasuk salah satu senapan serbu pertama dan hingga kini merupakan senapan serbu yang paling banyak diproduksi.",R.drawable.akempattuju));
        lstWeapon.add(new weapon("Assault Riffle","keterangan Senjata : " +
                "                                       " +
                "Senapan serbu (bahasa Inggris: Assault rifle) adalah senjata api otomatis yang merupakan senapan laras panjang atau karabin, " +
                "yang memiliki pilihan tembakan (selective-fire), dan menggunakan amunisi kaliber menengah. " +
                "Senapan serbu masuk dalam kategori di antara senapan mesin ringan, yang berfungsi untuk menembak secara full-otomatis sebagai senjata pendukung, " +
                "dan submachine gun, senjata otomatis yang menggunakan peluru ukuran peluru pistol sebagai senjata api jarak dekat. " +
                "Senapan serbu sudah menjadi persenjataan standar untuk tentara modern, menggantikan senapan laras panjang era Perang Dunia II, " +
                "seperti M1 Garand dan SKS.",R.drawable.assaultrifle));
        lstWeapon.add(new weapon("Beretta M9","keterangan Senjata : " +
                "                                      " +
                "Diterjemahkan dari bahasa Inggris-Beretta M9 — secara resmi Pistol, Semiautomatic, 9mm, " +
                "M9 — adalah sebutan untuk pistol semi-otomatis Beretta 92F yang digunakan oleh Angkatan Bersenjata Amerika Serikat. " +
                "M9 diadopsi oleh militer Amerika Serikat sebagai pistol dinas mereka pada tahun 1985.",R.drawable.beretta));
        lstWeapon.add(new weapon("Brass Knuckles","keterangan Senjata : " +
                "                                       " +
                "Keling (bahasa Inggrisː brass knuckles, knuckles, knucks, brass knucks, knucklebusters, knuckledusters, an English punch atau classic) " +
                "adalah sebuah senjata yang terbuat dari logam yang dapat dipasang melingkari keempat buku jari terdepan dari tangan. " +
                "Senjata digunakan dalam pertarungan jarak dekat fisik antar individu yang mengutamakan tinju. " +
                "Jenis logam yang digunakan umumnya yang memiliki tingkat kekerasan dan massa jenis yang tinggi untuk " +
                "menambah tingkat kerusakan yang diakibatkan oleh senjata tersebut. Pegangan (grip) " +
                "yang terpasang di dalam kepalan tangan mencegah kerusakan pada buku jari pengguna " +
                "karena gaya balik yang diakibatkan dari pukulan tersebut (Hukum Newton Ketiga)",R.drawable.brassknuckles));
        lstWeapon.add(new weapon("M249 Light Machine Gun","keterangan Senjata :     " +
                "                                       " +
                "Senapan mesin ringan M249 (Inggris: M249 light machine gun (LMG), sebelumnya bernama M249 Squad Automatic Weapon (SAW) (Senjata Otomatis Regu), " +
                "secara resmi bernama Light Machine Gun, 5.56 mm, M249 adalah senapan mesin operasi gas berpendingin udara menggunakan " +
                "amunisi kaliber 5,56 mm varian FN Minimi buatan FN Herstal asal Belgia versi Amerika yang digunakan oleh " +
                "Angkatan Bersenjata Amerika Serikat. Senapan ini merupakan jawaban atas kebutuhan militer Amerika Serikat akan senjata api " +
                "yang mempunyai rata-rata tembakan (rate of fire), akurasi dan mobilitas yang tinggi.",R.drawable.mlightmachinegun));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycleview_id);
        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,lstWeapon);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


        btnExit = (Button) findViewById(R.id.btnExit);



    }
}
