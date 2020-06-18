package com.example.spneer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkMyadapter extends BaseAdapter {

    Context context;
    String []drink_name;
    int []drink_img;
    public DrinkMyadapter(MainActivity mainActivity, String[] drink_name, int[] drink_img) {
        this.context=mainActivity;
        this.drink_img=drink_img;
        this.drink_name=drink_name;

    }

    @Override
    public int getCount() {
        return drink_name.length; //回傳數量

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
        view = layoutInflater.inflate(R.layout.drink_spinner_item,viewGroup, false);  //找xml檔Layout
        ImageView images = view.findViewById(R.id.imageView);
        TextView comment=view.findViewById(R.id.textView2);



        // now set our resources on views
        images.setImageResource(drink_img[i]);
        comment.setText(drink_name[i]);



        return view;

    }
}
