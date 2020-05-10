package com.example.nuevaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantallados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);

      Integer edad = (Integer)super.getIntent().getExtras().get("edad");

        TextView tvedad = (TextView)super.findViewById(R.id.tvedad);

    }
}
