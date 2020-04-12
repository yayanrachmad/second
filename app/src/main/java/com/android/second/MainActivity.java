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
        lstWeapon.add(new weapon("AK-47","deskripsi",R.drawable.akempattuju));
        lstWeapon.add(new weapon("Assault Riffle","deskripsi",R.drawable.assaultrifle));
        lstWeapon.add(new weapon("Beretta M9","deskripsi",R.drawable.beretta));
        lstWeapon.add(new weapon("Brass Knuckles","deskripsi",R.drawable.brassknuckles));
        lstWeapon.add(new weapon("M249 Light Machine Gun","deskripsi",R.drawable.mlightmachinegun));
        lstWeapon.add(new weapon("AK-47","deskripsi",R.drawable.akempattuju));
        lstWeapon.add(new weapon("Assault Riffle","deskripsi",R.drawable.assaultrifle));
        lstWeapon.add(new weapon("Beretta M9","deskripsi",R.drawable.beretta));
        lstWeapon.add(new weapon("Brass Knuckles","deskripsi",R.drawable.brassknuckles));
        lstWeapon.add(new weapon("M249 Light Machine Gun","deskripsi",R.drawable.mlightmachinegun));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycleview_id);
        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,lstWeapon);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


        btnExit = (Button) findViewById(R.id.btnExit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });

    }
}
