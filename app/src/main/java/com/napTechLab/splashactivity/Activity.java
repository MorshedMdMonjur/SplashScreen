package com.napTechLab.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity extends AppCompatActivity {
    Button button;
    TextView text;
    EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_);
        text=(TextView) findViewById(R.id.text);
        edit= (EditText)findViewById(R.id.edit);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),edit.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
       




    }
}