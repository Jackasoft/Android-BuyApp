package com.example.buym;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        List<Items> list = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        list.add(new Items("1","Food","200ksh",R.drawable.food));
        list.add(new Items("2","Drugs","500ksh",R.drawable.drugs));
        list.add(new Items("3","Phones","14000ksh",R.drawable.phones));
        list.add(new Items("4","Soap","200ksh",R.drawable.soap));
        list.add(new Items("5","Shoes","800ksh",R.drawable.shoes));
        list.add(new Items("6","TV set","20000ksh",R.drawable.tv));
        list.add(new Items("7","Watch","400ksh",R.drawable.watch));
        list.add(new Items("8","Beddings","3500ksh",R.drawable.matterress));
        list.add(new Items("9","Tvs","30500ksh",R.drawable.tv2));
        list.add(new Items("10","Samsang","35000ksh",R.drawable.phones2));
        list.add(new Items("11","Detergents","500ksh",R.drawable.detegents));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),list));


    }
}