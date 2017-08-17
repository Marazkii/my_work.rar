package com.example.asmaa.swapme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Asmaa on 8/17/2017.
 */

public class FragmentGride extends Fragment {

GridView gridview;
    Integer[] imgArray = {
            R.drawable.head1, R.drawable.head2, R.drawable.head3, R.drawable.head4, R.drawable.head5, R.drawable.head6, R.drawable.body7, R.drawable.head8, R.drawable.body9, R.drawable.head10, R.drawable.head11, R.drawable.head12
            , R.drawable.body1, R.drawable.body2, R.drawable.body3, R.drawable.body4, R.drawable.body5, R.drawable.body6, R.drawable.body7, R.drawable.body8, R.drawable.body9, R.drawable.body10, R.drawable.body11, R.drawable.body12,
            R.drawable.legs1, R.drawable.legs2, R.drawable.legs3, R.drawable.legs4, R.drawable.legs5, R.drawable.legs6, R.drawable.legs7, R.drawable.legs8, R.drawable.legs9, R.drawable.legs10, R.drawable.legs11, R.drawable.legs12};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_gride, container, true);
        gridview = v.findViewById(R.id.gridview);


        gridview.setAdapter(new ImageAdapter(getContext(), imgArray));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                Toast.makeText(getContext(), "hi" + position, Toast.LENGTH_SHORT).show();
            }
        });
        return v;

    }

}
