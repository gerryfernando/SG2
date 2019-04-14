package com.example.asus.test.Adapter;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.test.Model.Makanan;
import com.example.asus.test.R;

import java.util.List;

/**
 * Created by ASUS on 04/10/2019.
 */

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.MyViewHolder> {

    private Context context;

    public ListMenuAdapter(Context context, List<Makanan> makananList) {
        this.context = context;
        this.makananList = makananList;
    }

    private List<Makanan> makananList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ListMenuAdapter.MyViewHolder holder, int position) {
        final Makanan makanan =makananList.get(1);
        holder.foodTitle.setText(makanan.getTitle());
        holder.foodPrice.setText("Rp "+makanan.getPrice());

        holder.cardMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView foodTitle;
        TextView foodPrice;
        CardView cardMenu;


        public MyViewHolder(View itemView) {
            super(itemView);
            foodTitle = (TextView) itemView.findViewById(R.id.tv_judul_makanan);
            foodPrice = (TextView) itemView.findViewById(R.id.tv_harga_makanan);
            cardMenu = (CardView) itemView.findViewById(R.id.view);


        }
    }
}
