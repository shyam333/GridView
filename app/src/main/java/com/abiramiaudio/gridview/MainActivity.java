package com.abiramiaudio.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int images[] = {

            R.drawable.eight,
            R.drawable.five,
            R.drawable.four,
            R.drawable.leaf,
            R.drawable.nine,
            R.drawable.ten,
            R.drawable.six,
            R.drawable.three,
            R.drawable.two,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.grid);
        GridAdapter gridAdapter = new GridAdapter(this,images);
        gridView.setAdapter(gridAdapter);
    }
}
