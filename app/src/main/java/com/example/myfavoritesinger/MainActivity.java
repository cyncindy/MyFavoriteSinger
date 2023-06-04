package com.example.myfavoritesinger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DetailInterface {
    private RecyclerView rvSingers;
    private ArrayList<Singer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSingers = findViewById(R.id.rv_singers);
        rvSingers.setHasFixedSize(true);

        list.addAll(SingersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvSingers.setLayoutManager(new LinearLayoutManager(this));
        ListSingerAdapter listSingerAdapter = new ListSingerAdapter(list, this);
        rvSingers.setAdapter(listSingerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_profile){
            startActivity(new Intent(MainActivity.this, profile.class));
        }
        return true;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        intent.putExtra("Name", list.get(position).getName());
        intent.putExtra("Photo", list.get(position).getPhoto());
        intent.putExtra("Detail", list.get(position).getDetail());

        startActivity(intent);

    }
}