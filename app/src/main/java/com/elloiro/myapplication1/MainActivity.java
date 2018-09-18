package com.elloiro.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public static final float MILLES_PER_KM = 0.621371f;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text_km = findViewById(R.id.text_km);
        text_km.setText("1.5");
    }

    public void on_click_millas(View view)
    {
        EditText text_km = findViewById(R.id.text_km);
        EditText text_millas = findViewById(R.id.text_millas);
        String skm = text_km.getText().toString();
        if(!skm.equals(""))
        {
            float km = Float.valueOf(skm);
            float millas = km * MILLES_PER_KM;
            String s_millas = Float.toString(millas);
            text_millas.setText(s_millas);
        }
    }

    public void on_click_km(View view)
    {
        EditText text_km = findViewById(R.id.text_km);
        EditText text_millas = findViewById(R.id.text_millas);
        String s_millas = text_millas.getText().toString();
        if(!s_millas.isEmpty())
        {
            float millas = Float.valueOf(s_millas);
            float km = millas / MILLES_PER_KM;
            String skm = Float.toString(km);
            text_km.setText(skm);
        }

    }
}
