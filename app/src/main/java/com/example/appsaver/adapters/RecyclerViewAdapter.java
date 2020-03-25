package com.example.appsaver.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.appsaver.R;
import com.example.appsaver.model.Consultants;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mcontext;
    private List<Consultants> mdata;
    RequestOptions option;


    public RecyclerViewAdapter(Context mcontext, List<Consultants> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;

        // Request option for Glide
        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        view = inflater.inflate(R.layout.consultant_row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mdata.get(position).getName());
        holder.tv_rating.setText(mdata.get(position).getRating());
        holder.tv_location.setText(mdata.get(position).getVicinity());
        // Load Image from the internet and set it into Imageview using Glide

        Glide.with(mcontext).load(mdata.get(position).getIcon()).apply(option).into(holder.img_thumbnail);


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
    TextView tv_name,tv_rating,tv_location;
    Button review;
    ImageView img_thumbnail;





        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.consultant_name);
            tv_rating = itemView.findViewById(R.id.rating);
            tv_location = itemView.findViewById(R.id.loc);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);
            review = itemView.findViewById(R.id.review);

        }
    }
}
