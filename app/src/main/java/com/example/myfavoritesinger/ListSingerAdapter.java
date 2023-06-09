package com.example.myfavoritesinger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSingerAdapter extends RecyclerView.Adapter<ListSingerAdapter.ListViewHolder> {
    private final DetailInterface detailInterface;

    private ArrayList<Singer> listSinger;

    public ListSingerAdapter(ArrayList<Singer> list, DetailInterface detailInterface) {
        this.listSinger = list;
        this.detailInterface = detailInterface;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_singer, parent, false);
        return new ListViewHolder(view, detailInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Singer singer = listSinger.get(position);

        Glide.with(holder.itemView.getContext())
                .load(singer.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(singer.getName());
        holder.tvDetail.setText(singer.getDetail());

    }

    @Override
    public int getItemCount() {
        return listSinger.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView, DetailInterface detailInterface) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (detailInterface != null){
                        int position = getAdapterPosition();

                        if (position != RecyclerView.NO_POSITION) {
                            detailInterface.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
