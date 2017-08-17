package com.example.asmaa.swapme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Asmaa on 8/17/2017.
 */

public class FragmentLeg extends Fragment {
    ImageView imgLeg;
    int leg[] = {R.drawable.legs1, R.drawable.legs2, R.drawable.legs3, R.drawable.legs4, R.drawable.legs5, R.drawable.legs6, R.drawable.legs7, R.drawable.legs8, R.drawable.legs9, R.drawable.legs10, R.drawable.legs11, R.drawable.legs12};
    int l = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View v=inflater.inflate(R.layout.fragment_leg, container, false);
        imgLeg =  v.findViewById(R.id.img_leg);
        imgLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgLeg.setImageResource(leg[l]);
                l++;
                if (l == 12) {
                    l = 0;
                }

            }
        });
        return v;
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("leg",leg[l]);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            imgLeg.setImageResource(savedInstanceState.getInt("leg"));}

    }
}
