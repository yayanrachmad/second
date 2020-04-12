package com.android.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Weapon_Activity extends AppCompatActivity {

    private TextView tvnama,tvdeskripsi ;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_);

        tvnama = (TextView) findViewById(R.id.txtnama);
        tvdeskripsi = (TextView) findViewById(R.id.txtdeskripsi);
        img = (ImageView) findViewById(R.id.thumbnail);

        //recieve data
        Intent intent = getIntent();
        String Nama = intent.getExtras().getString("Nama");
        String deskripsi = intent.getExtras().getString("deskripsi");
        int image = intent.getExtras().getInt("Thumbnail");

        tvnama.setText(Nama);
        tvdeskripsi.setText(deskripsi);
        img.setImageResource(image);
    }
}
