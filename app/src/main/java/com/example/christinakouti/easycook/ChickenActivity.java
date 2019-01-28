package com.example.christinakouti.easycook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ChickenActivity extends AppCompatActivity {


    public Button but1;

    public void go2next(View view){

        Intent intent = new Intent(ChickenActivity.this,FishActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.chicken_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent ContactUsIntent = new Intent(this, HomeActivity.class);
            startActivity(ContactUsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
