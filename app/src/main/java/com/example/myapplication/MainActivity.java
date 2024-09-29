package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayList<Integer> imageList=new ArrayList<>();
    private ImageView img;
    private ArrayList<String> list = new ArrayList<String>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageList=new ArrayList<>();

        img=findViewById(R.id.img);
        listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(this);
        imageList.add(R.drawable.barcelona);
        imageList.add(R.drawable.realmadrid);
        imageList.add(R.drawable.manchestercity);
        imageList.add(R.drawable.liverpool);
        list.add("Barcelona");
        list.add("Real Madrid");
        list.add("Manchester City");
        list.add("Liverpool");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        img.setImageResource(imageList.get(i));
        Toast.makeText(this,"click : "+list.get(i),Toast.LENGTH_SHORT).show();


}
}