package com.nvh.meete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.itemViewholder> {
    Context context;
    List<Item> itemList;

    public AdapterItem(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_item,parent,false);
        return new itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterItem.itemViewholder holder, int position) {
        holder.imageView.setImageResource(itemList.get(position).getImage());
        holder.ten.setText(itemList.get(position).getName());
        holder.giamgia.setText(itemList.get(position).getGiamgia());
        holder.diachi.setText(itemList.get(position).getDiachi());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class itemViewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView diachi,giamgia,ten;
        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            ten = itemView.findViewById(R.id.tenquan);
            diachi = itemView.findViewById(R.id.diachi);
            giamgia = itemView.findViewById(R.id.giamgia);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
