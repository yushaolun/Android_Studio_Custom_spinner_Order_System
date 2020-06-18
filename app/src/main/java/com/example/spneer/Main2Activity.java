package com.example.spneer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView3=findViewById(R.id.textView3);
        String comment;

        comment=getIntent().getStringExtra("comment");
        Log.v("com",""+comment);
        textView3.setText(""+comment);
    }
}
