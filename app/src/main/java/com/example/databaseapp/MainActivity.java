package com.example.databaseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button CreateNewCustomer, ManageRecords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateNewCustomer = (Button)findViewById(R.id.createnewcustomer);
        ManageRecords = (Button)findViewById(R.id.managerecords);
        CreateNewCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this, CreateNewCustomer.class);
                startActivity(in);
            }
        });
        ManageRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this, ManageRecords.class);
                startActivity(in);
            }
        });

    }
}