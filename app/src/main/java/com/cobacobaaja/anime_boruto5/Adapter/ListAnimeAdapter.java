package com.cobacobaaja.anime_boruto5.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cobacobaaja.anime_boruto5.Anime;
import com.cobacobaaja.anime_boruto5.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAnimeAdapter extends RecyclerView.Adapter<ListAnimeAdapter.ListViewHolder> {
    private ArrayList<Anime> listAnimes;
    OnItemClickListener mListener;
    Context context;
    public  interface OnItemClickListener{
        void onItemClick(int position);
    }
        public void SetOnItemClickListener(OnItemClickListener mListener){
        this.mListener = mListener;
        }


    public ListAnimeAdapter(ArrayList<Anime> listAnimes, Context context) {
        this.listAnimes = listAnimes;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_anime, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Anime anime = listAnimes.get(position);

        holder.tvName.setText(anime.getName());
        //holder.tvDetail.setText(anime.getDetail());
        holder.imgPhoto.setImageResource(anime.getPhoto());
    }

    @Override
    public int getItemCount() {
        return listAnimes.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener !=null){
                        int position = (getAdapterPosition());
                        if(position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });


        }
    }
}

