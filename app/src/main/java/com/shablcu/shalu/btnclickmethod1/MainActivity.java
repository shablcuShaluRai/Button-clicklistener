package com.shablcu.shalu.btnclickmethod1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
Button clickbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clickbtn=(Button)findViewById(R.id.button);

        clickbtn.setOnClickListener(new ShablcuHandler());

    }

    class ShablcuHandler implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        Log.d("oops","click btn metrhod 2");

    }
    }

}
