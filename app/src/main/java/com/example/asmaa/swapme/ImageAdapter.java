package com.example.asmaa.swapme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Asmaa on 8/17/2017.
 */

public class ImageAdapter extends BaseAdapter {
  Context mContext;
    Integer [] mThumbIds;

    public ImageAdapter(Context c,Integer[] imgArray) {
        mContext = c;
        mThumbIds= imgArray;
    }

    @Override
    public int getCount() {
        return  mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(mThumbIds[i]);
        return imageView;

    }
    /* Integer[] mThumbIds = {
            R.drawable.head1,R.drawable.head2,R.drawable.head3,R.drawable.head4,R.drawable.head5,R.drawable.head6,R.drawable.body7,R.drawable.head8,R.drawable.body9,R.drawable.head10,R.drawable.head11,R.drawable.head12
    ,R.drawable.body1,R.drawable.body2,R.drawable.body3,R.drawable.body4,R.drawable.body5,R.drawable.body6,R.drawable.body7,R.drawable.body8,R.drawable.body9,R.drawable.body10,R.drawable.body11,R.drawable.body12,
   R.drawable.legs1,R.drawable.legs2,R.drawable.legs3,R.drawable.legs4,R.drawable.legs5,R.drawable.legs6,R.drawable.legs7,R.drawable.legs8,R.drawable.legs9,R.drawable.legs10,R.drawable.legs11,R.drawable.legs12

    };*/

}
