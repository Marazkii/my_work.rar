package com.example.asmaa.swapme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Asmaa on 8/17/2017.
 */

public class FragmentBody extends Fragment {
    ImageView imgBody;
    int b = 1;
    int body[] = {R.drawable.body1, R.drawable.body2, R.drawable.body3, R.drawable.body4, R.drawable.body5, R.drawable.body6, R.drawable.body7, R.drawable.body8, R.drawable.body9, R.drawable.body10, R.drawable.body11, R.drawable.body12};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View v=inflater.inflate(R.layout.fragment_body,container,false);
        imgBody = v.findViewById(R.id.img_body);
        imgBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBody.setImageResource(body[b]);
                b++;
                if (b == 12) {
                    b = 0;
                }

            }
        });


        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("body",body[b]);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
        imgBody.setImageResource(savedInstanceState.getInt("body"));}

    }
}
