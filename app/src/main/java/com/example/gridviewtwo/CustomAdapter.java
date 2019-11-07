package com.example.gridviewtwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] images;
    String[] countryNames;
    Context context;

    LayoutInflater inflater;

    CustomAdapter(Context context, int[] images, String[] countryNames){

        this.context = context;

        this.images = images;

        this.countryNames = countryNames;


    }


    @Override
    public int getCount() {
        return countryNames.length;
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

        if(view == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.sampleview, viewGroup, false);

        }

        ImageView imageView = view.findViewById(R.id.imageViewId);

        TextView textView = view.findViewById(R.id.mytextViewId);

        imageView.setImageResource(images[i]);

        textView.setText(countryNames[i]);


        return view;
    }
}
