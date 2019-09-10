package com.cobacobaaja.anime_boruto5;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ANIME = "EXTRA_ANIME";
    TextView name, detail;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Anime anime = getIntent().getParcelableExtra(EXTRA_ANIME);
        name = findViewById(R.id.tv_item_name);
        detail = findViewById(R.id.tv_item_detail);
        photo = findViewById(R.id.img_item_photo);
        if (anime != null) {
            name.setText(anime.getName());
            detail.setText(anime.getDetail());
            photo.setImageResource(anime.getPhoto());
        }




    }
}
