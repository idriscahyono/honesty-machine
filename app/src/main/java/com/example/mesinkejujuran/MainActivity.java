package com.example.mesinkejujuran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager frm = getSupportFragmentManager();
        FragmentTransaction frt = frm.beginTransaction();

          frt.add(R.id.frame1, new FragmentSatu());
          frt.add(R.id.frame2, new FragmentDua());

        frt.commit();
    }
}
