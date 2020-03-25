package com.example.bottomnavigation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderIhram extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView imageView;
    TextView mtitle;
    ItemClickListenerIhram clickListenerIhram;

    HolderIhram(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.image_penjelas);
        this.mtitle = itemView.findViewById(R.id.text_penjelas);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.clickListenerIhram.onItemClickListenerIhram(view, getLayoutPosition());
    }

    public void setClickListenerIhram(ItemClickListenerIhram ic){
        this.clickListenerIhram = ic;
    }
}
