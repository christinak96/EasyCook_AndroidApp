package com.example.christinakouti.easycook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PastaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.pasta_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent PastaIntent = new Intent(this, HomeActivity.class);
            startActivity(PastaIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
