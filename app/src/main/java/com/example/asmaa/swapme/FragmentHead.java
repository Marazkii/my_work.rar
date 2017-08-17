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

public class FragmentHead extends Fragment{
    int saved=0;
    ImageView imgHead;
    int head[] = {R.drawable.head1, R.drawable.head2, R.drawable.head3, R.drawable.head4, R.drawable.head5, R.drawable.head6, R.drawable.body7, R.drawable.head8, R.drawable.body9, R.drawable.head10, R.drawable.head11, R.drawable.head12};
int h=1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_head, container, false);
        imgHead =  v.findViewById(R.id.img_head);
        imgHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgHead.setImageResource(head[h]);
                 saved=h;
                h++;
                if (h == 12) {
                    h = 0;
                    //saved=head[h];

                }

            }
        });
        return v;
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("head",head[saved]);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            imgHead.setImageResource(savedInstanceState.getInt("head"));}

    }
}
