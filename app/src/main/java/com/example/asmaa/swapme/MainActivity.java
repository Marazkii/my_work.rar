package com.example.asmaa.swapme;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentGrid.OnGridInteraction {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onItemClick(int position) {
        FragmentHead fragmentHead = FragmentHead.newInstance(position);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_head, fragmentHead)
                .commit();
    }
}
