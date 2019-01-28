package com.example.christinakouti.easycook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactUsActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);



        editTextName = findViewById(R.id.edit_text_name);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextMessage = findViewById(R.id.edit_text_message);
        button = findViewById(R.id.button);

        editTextName.addTextChangedListener(SubmitTextWatcher);
        editTextEmail.addTextChangedListener(SubmitTextWatcher);
        editTextMessage.addTextChangedListener(SubmitTextWatcher);

        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    public void openDialog(){
        SubmitDialog submitDialog = new SubmitDialog();
        submitDialog.show(getSupportFragmentManager(),"submit dialog");
    }


    private TextWatcher SubmitTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String nameInput = editTextName.getText().toString().trim();
            String emailInput = editTextEmail.getText().toString().trim();
            String messageInput = editTextMessage.getText().toString().trim();

            button.setEnabled(!nameInput.isEmpty() && !emailInput.isEmpty() && !messageInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar
            getMenuInflater().inflate(R.menu.contact_us_menu, menu);
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
