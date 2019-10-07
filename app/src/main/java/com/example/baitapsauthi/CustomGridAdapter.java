package com.example.baitapsauthi;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;


public class CustomGridAdapter  extends BaseAdapter {
    private Context context;

    private  int[] hinhLogo;



    public CustomGridAdapter(Context context, int[] hinhLogo) {
        this.context = context;
        this.hinhLogo = hinhLogo;
    }


    @Override
    public int getCount() {
        return hinhLogo.length;
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
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView =  layoutInflater.inflate(R.layout.girlview_row,null);
        ImageView imageView =convertView.findViewById(R.id.imagegr);
        imageView.setImageResource(hinhLogo[position]);
        return convertView;
    }


}
