package com.example.myfavoritesinger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = getIntent().getStringExtra("Name");
        Integer photo = getIntent().getIntExtra("Photo",0);
        String detail = getIntent().getStringExtra("Detail");
        setTitle(name);

        TextView tvName = findViewById(R.id.tv_item_name);
        ImageView imgPhoto = findViewById(R.id.img_item_photo);
        TextView tvDetail = findViewById(R.id.tv_item_detail);

        tvName.setText(name);
        tvDetail.setText(detail);

        Glide.with(this)
                .load(photo)
                .into(imgPhoto);
    }
}