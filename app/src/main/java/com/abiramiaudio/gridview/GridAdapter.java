package com.abiramiaudio.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    Context context;
    int[] images;
    View view;
    LayoutInflater layoutInflater;

    public GridAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null)
        {
            view = new View(context);
            view = layoutInflater.inflate(R.layout.grid_item,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.img);
            imageView.setImageResource(images[position]);

        }
        return view;
    }
}
