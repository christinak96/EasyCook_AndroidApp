package com.example.christinakouti.easycook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FishActivity extends AppCompatActivity {

    public Button but2;

    public void go2pasta(View view) {

        Intent intent = new Intent(FishActivity.this, PastaActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.fish_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent FishIntent = new Intent(this, HomeActivity.class);
            startActivity(FishIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
