package com.example.christinakouti.easycook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class UserinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.userinfo_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent UserinfoIntent = new Intent(this, HomeActivity.class);
            startActivity(UserinfoIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void userinfo_submit(View view){

        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        TextView txtName=(TextView) findViewById(R.id.txtName);
        TextView txtDob=(TextView) findViewById(R.id.txtDob);
        TextView txtCuisine=(TextView) findViewById(R.id.txtCuisine);
        Switch switchGender=(Switch) findViewById(R.id.switchMaleFemale);
        String outputName= txtName.getText().toString();
        String outputDob= txtDob.getText().toString();
        String outputCuisine= txtCuisine.getText().toString();
        String outputGender;
        TextView txtUserinfoOutput = (TextView) findViewById(R.id.txtUserinfoOutput);



        if (switchGender.isChecked()){
            outputGender="Male";
        }
        else {
            outputGender="Female";
        }

        if (outputName.matches("")) {
            txtUserinfoOutput.setText("Please enter your Name");
        }
        else if (outputDob.matches("")) {
            txtUserinfoOutput.setText("Please set your Date of Birth");
        }
        else if(outputCuisine.matches("")){
            txtUserinfoOutput.setText("Please select your cuisine prefered type");
        }
        else {
            txtUserinfoOutput.setText("Name: " + outputName + "\nDate Of Birth: " + outputDob + "\nPreffered Type of Cuisine: " + outputCuisine + "\nGender: " + outputGender);
        }
    }
    public void sendUserInput(View v)
    {
        EditText n=(EditText) findViewById(R.id.txtName);
        EditText d=(EditText) findViewById(R.id.txtDob);
        EditText c=(EditText) findViewById(R.id.txtCuisine);

        String text1=n.getText().toString();
        String text2=d.getText().toString();
        String text3=c.getText().toString();

        Bundle userInput=new Bundle();
        userInput.putString("name",text1);
        userInput.putString("dob",text2);
        userInput.putString("cuisine",text3);
        Intent in=new Intent(this,RateUsActivity.class);
        in.putExtras(userInput);
        startActivity(in);

    }


}
