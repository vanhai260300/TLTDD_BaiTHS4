package com.nvh.meete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewUuDai, recyclerViewdaitiec ;
    AdapterItem adapterItem;
    ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.viewFlipper);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1500);
        viewFlipper.startFlipping();

        List<Item> listUuDai = new ArrayList<>();
        listUuDai.add(new Item(R.drawable.uadai1,"Hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        listUuDai.add(new Item(R.drawable.uadai2,"Hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        listUuDai.add(new Item(R.drawable.uadai3,"Hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        listUuDai.add(new Item(R.drawable.uadai1,"Hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        listUuDai.add(new Item(R.drawable.uadai1,"hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        listUuDai.add(new Item(R.drawable.uadai1,"hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        listUuDai.add(new Item(R.drawable.uadai1,"hà Nội Ngon","Tặng Nam Nhỏ và Trà Chanh", "30 Ông ích Khiêm"));
        setRecyclerViewUuDai(listUuDai);
        setRecyclerViewDaiTiec(listUuDai);


    }
    public void setRecyclerViewUuDai(List<Item> itemList){
        recyclerViewUuDai=findViewById(R.id.recycle_uuDai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerViewUuDai.setLayoutManager(layoutManager);
        adapterItem = new AdapterItem(this,itemList);
        recyclerViewUuDai.setAdapter(adapterItem);
    }
    public void setRecyclerViewDaiTiec(List<Item> itemList){
        recyclerViewUuDai=findViewById(R.id.recycle_daitiec);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerViewUuDai.setLayoutManager(layoutManager);
        adapterItem = new AdapterItem(this,itemList);
        recyclerViewUuDai.setAdapter(adapterItem);
    }
}