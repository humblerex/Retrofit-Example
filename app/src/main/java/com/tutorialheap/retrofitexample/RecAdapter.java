package com.tutorialheap.retrofitexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 7/17/2017.
 */

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {


    private List<Items> items;
    private Context context;

    public RecAdapter(List<Items> items, Context context )
    {
        this.items = items;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.countryname.setText(items.get(position).getCountryname());
//        holder.population.setText(items.get(position).getPopulation());
        holder.rank.setText(items.get(position).getRank());
        Picasso.with(context)
                .load(items.get(position).getFlag())
                .into(holder.flag);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView countryname,rank;
        ImageView flag;

        public MyViewHolder(View itemView) {
            super(itemView);
            countryname = (TextView) itemView.findViewById(R.id.name);
            rank = (TextView) itemView.findViewById(R.id.rank);
          flag = (ImageView) itemView.findViewById(R.id.flag);

        }
    }

}
