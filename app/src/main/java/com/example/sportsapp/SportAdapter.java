package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {

    List<SportModel> sportModelList;

    public SportAdapter(List<SportModel> sportModelList) {
        this.sportModelList = sportModelList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout,parent,false);

        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {

        SportModel sportModel = sportModelList.get(position);
        holder.sportName.setText(sportModel.getSportName());
        holder.sportImage.setImageResource(sportModel.getSportImage());

    }

    @Override
    public int getItemCount() {
        return sportModelList.size();
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder {

        private TextView sportName;
        private ImageView sportImage;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            this.sportName = itemView.findViewById(R.id.cil_tv_sport_name);
            this.sportImage = itemView.findViewById(R.id.cil_iv_sport_image);


        }
    }
}
