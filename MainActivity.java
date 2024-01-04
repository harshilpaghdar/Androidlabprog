package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextName=findViewById(R.id.editTextName);
        Button buttonSubmit=findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Toast.makeTest(MainActivity.this,"hello", Toast.LENGTH_SHORT).show();
            }
    });
}
}