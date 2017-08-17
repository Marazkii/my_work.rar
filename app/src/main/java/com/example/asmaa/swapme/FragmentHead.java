package com.example.asmaa.swapme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Asmaa on 8/17/2017.
 */

public class FragmentHead extends Fragment {
    private static final String EXTRA_FRAGMENT_INDEX = "EXTRA_FRAGMENT_INDEX";
    ImageView imgHead;
    int head[] = {R.drawable.head1, R.drawable.head2, R.drawable.head3, R.drawable.head4, R.drawable.head5, R.drawable.head6, R.drawable.head7, R.drawable.head8, R.drawable.head9, R.drawable.head10, R.drawable.head11, R.drawable.head12};
    int h = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_head, container, false);

        imgHead = v.findViewById(R.id.img_head);

        if (getArguments() !=null){
            h = getArguments().getInt(EXTRA_FRAGMENT_INDEX);
            imgHead.setImageResource(head[h]);
        }

        imgHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h++;
                imgHead.setImageResource(head[h]);
                if (h == 12) {
                    h = 0;
                }
            }
        });
        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("head", h);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            Log.e("tag", "onActivityCreated: " + savedInstanceState.getInt("head"));
            h = savedInstanceState.getInt("head");
            imgHead.setImageResource(head[h]);
        }

    }

    public static FragmentHead newInstance(int pos) {
        FragmentHead fragmentHead = new FragmentHead();
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_FRAGMENT_INDEX, pos);
        fragmentHead.setArguments(bundle);
        return fragmentHead;
    }
}
