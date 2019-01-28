package com.example.christinakouti.easycook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {


    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent homeIntent = new Intent(this, HomeActivity.class);
            startActivity(homeIntent);
            Toast.makeText(this, "Home selected", Toast.LENGTH_LONG).show();
            return true;
        }

            if (id == R.id.About) {
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
                return true;
            }


            if (id == R.id.ContactUs) {
            Intent contactUsIntent = new Intent(this, ContactUsActivity.class);
            startActivity(contactUsIntent);
            return true;
        }

        if (id == R.id.RateUs) {
            Intent rateusIntent = new Intent(this, RateUsActivity.class);
            startActivity(rateusIntent);
            Toast.makeText(this,"reteus selected", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.Userinfo) {
            Intent userinfoIntent = new Intent(this, UserinfoActivity.class);
            startActivity(userinfoIntent);
            return true;
        }

        if (id == R.id.WebView) {
            Intent webviewIntent = new Intent(this, WebviewActivity.class);
            startActivity(webviewIntent);
            return true;
        }

        if (id == R.id.Chicken) {
            Intent chickenIntent = new Intent(this, ChickenActivity.class);
            startActivity(chickenIntent);
            return true;
        }

            return super.onOptionsItemSelected(item);
        }

    public void sendRecipe(View view)
    {
        CheckBox chick=(CheckBox)findViewById(R.id.Chicken);
        CheckBox salm=(CheckBox)findViewById(R.id.Salmon);
        CheckBox past=(CheckBox)findViewById(R.id.Pasta);
        if(chick.isChecked()) {
            Intent intent = new Intent(HomeActivity.this, ChickenActivity.class);
            startActivity(intent);
        }
        if(salm.isChecked())
        {
            Intent intent = new Intent(HomeActivity.this, FishActivity.class);
            startActivity(intent);
        }
        if(past.isChecked())
        {
            Intent intent = new Intent(HomeActivity.this, PastaActivity.class);
            startActivity(intent);
        }

    }

    public void showInfo(View view)
        {
            CheckBox c1 = (CheckBox) findViewById(R.id.Beef);
            CheckBox c2 = (CheckBox) findViewById(R.id.Chicken);
            CheckBox c3 = (CheckBox) findViewById(R.id.Tuna);
            CheckBox c4 = (CheckBox) findViewById(R.id.Salmon);
            CheckBox c5 = (CheckBox) findViewById(R.id.Tomatos);
            CheckBox c6 = (CheckBox) findViewById(R.id.Onions);
            CheckBox c7 = (CheckBox) findViewById(R.id.Potatoes);
            CheckBox c8 = (CheckBox) findViewById(R.id.Garlic);
            CheckBox c9 = (CheckBox) findViewById(R.id.Mushrooms);
            CheckBox c10 = (CheckBox) findViewById(R.id.Carrots);
            CheckBox c11 = (CheckBox) findViewById(R.id.Pasta);
            CheckBox c12 = (CheckBox) findViewById(R.id.Rice);
            CheckBox c13 = (CheckBox) findViewById(R.id.Cheece);
            CheckBox c14 = (CheckBox) findViewById(R.id.Creme);
            CheckBox c15 = (CheckBox) findViewById(R.id.Eggs);
            CheckBox c16 = (CheckBox) findViewById(R.id.Mastard);
            CheckBox c17 = (CheckBox) findViewById(R.id.Honey);
            //  CheckBox c18=(CheckBox)findViewById(R.id.Oil);
            //CheckBox c19=(CheckBox)findViewById(R.id.Wine);


            TextView t = (TextView) findViewById(R.id.output);
            t.setText("");
            if (c1.isChecked()) {
                t.append("Beef,");
            }
            if (c2.isChecked()) {
                t.append("Chicken,");
            }
            if (c3.isChecked()) {
                t.append("Tuna,");
            }
            if (c4.isChecked()) {
                t.append("Salmon,");
            }
            if (c5.isChecked()) {
                t.append("Tomatos,");
            }
            if (c6.isChecked()) {
                t.append("Onion");
            }
            if (c7.isChecked()) {
                t.append("Potatos,");
            }
            if (c8.isChecked()) {
                t.append("Garlic,");
            }
            if (c9.isChecked()) {
                t.append("Mushroom,");
            }
            if (c10.isChecked()) {
                t.append("Carrots.");
            }
            if (c11.isChecked()) {
                t.append("Pasta,");
            }
            if (c12.isChecked()) {
                t.append("Rice,");
            }
            if (c13.isChecked()) {
                t.append("Cheece,");
            }
            if (c14.isChecked()) {
                t.append("Cream,");
            }
            if (c15.isChecked()) {
                t.append("Eggs,");
            }
            if (c16.isChecked()) {
                t.append("Mastard,");
            }
            if (c17.isChecked()) {
                t.append("Honey");
            }


            if(c2.isChecked()&&c4.isChecked()&&c11.isChecked())
            {
                t.setText("Please select chicken or salmon or spaggetti");
            }
            if(c2.isChecked()&&c4.isChecked()&&!c11.isChecked())
            {
                t.setText("Please select chicken or salmon");
            }
            if(c2.isChecked()&&!c4.isChecked()&&c11.isChecked())
            {
                t.setText("Please select chicken or spaggetti");
            }
            if(!c2.isChecked()&&c4.isChecked()&&c11.isChecked())
            {
                t.setText("Please select salmon or spaggetti");
            }



            if (!c1.isChecked() &&
                    !c2.isChecked() &&
                    !c3.isChecked() &&
                    !c4.isChecked() &&
                    !c5.isChecked() &&
                    !c6.isChecked() &&
                    !c7.isChecked() &&
                    !c8.isChecked() &&
                    !c9.isChecked() &&
                    !c10.isChecked() &&
                    !c11.isChecked() &&
                    !c12.isChecked() &&
                    !c13.isChecked() &&
                    !c14.isChecked() &&
                    !c15.isChecked() &&
                    !c16.isChecked() &&
                    !c17.isChecked()) {
                t.setText("Please select something first");
            }


        }
        public void UncheckAll (View view)
        {
            CheckBox c1 = (CheckBox) findViewById(R.id.Beef);
            CheckBox c2 = (CheckBox) findViewById(R.id.Chicken);
            CheckBox c3 = (CheckBox) findViewById(R.id.Tuna);
            CheckBox c4 = (CheckBox) findViewById(R.id.Salmon);
            CheckBox c5 = (CheckBox) findViewById(R.id.Tomatos);
            CheckBox c6 = (CheckBox) findViewById(R.id.Onions);
            CheckBox c7 = (CheckBox) findViewById(R.id.Potatoes);
            CheckBox c8 = (CheckBox) findViewById(R.id.Garlic);
            CheckBox c9 = (CheckBox) findViewById(R.id.Mushrooms);
            CheckBox c10 = (CheckBox) findViewById(R.id.Carrots);
            CheckBox c11 = (CheckBox) findViewById(R.id.Pasta);
            CheckBox c12 = (CheckBox) findViewById(R.id.Rice);
            CheckBox c13 = (CheckBox) findViewById(R.id.Cheece);
            CheckBox c14 = (CheckBox) findViewById(R.id.Creme);
            CheckBox c15 = (CheckBox) findViewById(R.id.Eggs);
            CheckBox c16 = (CheckBox) findViewById(R.id.Mastard);
            CheckBox c17 = (CheckBox) findViewById(R.id.Honey);


            TextView t = (TextView) findViewById(R.id.output);
            t.setText("");

            c1.setChecked(false);
            c2.setChecked(false);
            c3.setChecked(false);
            c4.setChecked(false);
            c5.setChecked(false);
            c6.setChecked(false);
            c7.setChecked(false);
            c8.setChecked(false);
            c9.setChecked(false);
            c10.setChecked(false);
            c11.setChecked(false);
            c12.setChecked(false);
            c13.setChecked(false);
            c14.setChecked(false);
            c15.setChecked(false);
            c16.setChecked(false);
            c17.setChecked(false);

        }
    }



