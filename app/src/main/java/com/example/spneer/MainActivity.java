package com.example.spneer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;


    Spinner spinner;
    public int img[] = {R.drawable.food_3,R.drawable.food_4, R.drawable.food_5, R.drawable.food_6};  //食物照片
    String[] food_name;


    Spinner drink_spinner;
    public int drink_img[] = {R.drawable.apple,R.drawable.orange, R.drawable.bo};  //飲料照片
    String[] drink_name;

    String food_comment;
    String drink_comment;
    String comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);


        food_name=getResources().getStringArray(R.array.food);  //string xml
        spinner=findViewById(R.id.spinner);
        MyAdapter adapter=new MyAdapter(this,food_name,img);   //食物adapter


        drink_name=getResources().getStringArray(R.array.drink);
        drink_spinner=findViewById(R.id.drink_spinner);
        DrinkMyadapter drinkadapter=new  DrinkMyadapter(this,drink_name,drink_img);   //飲料adapter

        spinner.setAdapter(adapter);
        drink_spinner.setAdapter(drinkadapter);
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {  //按下食物spinner 執行底下
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
             food_comment="";
             food_comment=food_name[i]+"  ";
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


      });

        drink_spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {   //按下飲料spinner 執行底下
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                drink_comment="";
                drink_comment=drink_name[i]+"  ";
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }

    public void btn1(View view) {
        comment=drink_comment+food_comment;
        Intent intent=new Intent(this,Main2Activity.class);  //傳值到Main2Activity
        intent.putExtra("comment",comment);

        startActivity(intent);  //發送出去
        finish();   //把app從記憶體清除


    }
}
