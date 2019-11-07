package com.example.gridviewtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {


    int images[] = {
      R.drawable.iconone, R.drawable.icontwo, R.drawable.iconthree
    };

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] countryNames = getResources().getStringArray(R.array.countrynames);

        gridView = findViewById(R.id.myGridView);

        CustomAdapter customAdapter = new CustomAdapter(this, images, countryNames);

        gridView.setAdapter(customAdapter);




    }
}
