package com.example.mipt2_martynas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText readText;
    Spinner readSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        new CountActivity();
        readText = (EditText) findViewById(R.id.editTextTextMultiLine);
        String tempReadText = readText.getText().toString();

        Spinner spinnerRead = (Spinner) findViewById(R.id.selectionMenu);
        String spinnerText = spinnerRead.getSelectedItem().toString();
        TextView counter = (TextView) findViewById(R.id.textOutput);

        if (tempReadText.matches(""))
            Toast.makeText(this, "You didn't type anything!", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(this, "Counting...", Toast.LENGTH_SHORT).show();

            if (spinnerText.equals("Count Everything"))
            {
                CountActivity.countEverything(counter,tempReadText);
            }
            else
            {
                CountActivity.countWords(counter,tempReadText);
            }

        }
    }
}