package com.cobacobaaja.anime_boruto5;

import android.content.Intent;
import android.os.Bundle;

import com.cobacobaaja.anime_boruto5.Adapter.ListAnimeAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListAnimeAdapter.OnItemClickListener {
    private RecyclerView rvHeroes;
    private ArrayList<Anime> list = new ArrayList<>();
    ListAnimeAdapter listAnimeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            rvHeroes = findViewById(R.id.rv_heroes);
            rvHeroes.setHasFixedSize(true);
            showRecyclerList();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
        private void showRecyclerList() {
            list.addAll(AnimeData.getListData());
            rvHeroes.setLayoutManager(new LinearLayoutManager(this));
            listAnimeAdapter = new ListAnimeAdapter(list,getApplicationContext());
            listAnimeAdapter.SetOnItemClickListener(this);

            rvHeroes.setAdapter(listAnimeAdapter);
        }

        @Override
        public void onItemClick(int position) {
            String type = "ANIME";
            Anime anime = new Anime();
            anime.setPhoto(list.get(position).getPhoto());
            anime.setDetail(list.get(position).getDetail());
            anime.setName(list.get(position).getName());


            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_ANIME, anime);
            startActivity(intent);

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent (MainActivity.this, AboutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
