package com.example.christinakouti.easycook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateUsActivity extends AppCompatActivity {
    RatingBar r1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);

        r1 = (RatingBar) findViewById(R.id.ratingBar);
        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), String.valueOf(rating), Toast.LENGTH_LONG).show();
            }
        });

        Intent in =getIntent();
        Bundle userInput=in.getExtras();
        String name=userInput.getString("name");
        String dob=userInput.getString("dob");
        String cuisine=userInput.getString("cuisine");
        String message="Hello "+name+" ,\nborn on "+dob+" ,\nWe see you like "+cuisine+" cousine ,\nWelcome to this app";
        TextView t=(TextView) findViewById(R.id.textRate);
        t.setText(message);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.rate_us_menu, menu);
        return true;
    }

    public void displayMessage1(View x)
    {
        RadioGroup group = (RadioGroup) findViewById(R.id.group1);
        TextView t1 = (TextView) findViewById(R.id.text1);

        int id = group.getCheckedRadioButtonId();

        if(id == R.id.radioButton1)
        {
            t1.setText("Great, that makes us very happy!");
        }
        else if(id == R.id.radioButton2)
        {
            t1.setText("We are sorry to hear that!");
        }

    }
    public void displayMessage2(View x)
    {
        RadioGroup group = (RadioGroup) findViewById(R.id.group2);
        TextView t1 = (TextView) findViewById(R.id.text2);

        int id = group.getCheckedRadioButtonId();

        if(id == R.id.radioButton3)
        {
            t1.setText("Yes!");
        }
        else if(id == R.id.radioButton4)
        {
            t1.setText("Please, Let us know what you don't like.");
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent rateusIntent = new Intent(this, HomeActivity.class);
            startActivity(rateusIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
