package com.example.spneer;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

class MyAdapter extends BaseAdapter {
     String[] food_name;
     int [] img;
     Context context;


    public MyAdapter(MainActivity mainActivity, String[] food_name, int[] img) {
        this.food_name=food_name;
        this.img=img;
        this.context=mainActivity;
    }



    @Override
    public int getCount() {
        return food_name.length;  //回傳數量
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
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.spinner_item,viewGroup, false);  //找xml檔Layout
        ImageView images = view.findViewById(R.id.imageView);
        TextView comment=view.findViewById(R.id.textView2);



        // now set our resources on views
        images.setImageResource(img[i]);
        comment.setText(food_name[i]);



        return view;
    }

}
