package com.example.mywidgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Step 2: Declaring views
    TextView textView;
    EditText editText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText1);
        btn = findViewById(R.id.btn);

        // Step 3 Adding the Functionality

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText.getText().toString();

                //Displaying the entered name

                Toast.makeText(MainActivity.this, "Hello, "+name, Toast.LENGTH_SHORT).show();
            }
        });
     }
}