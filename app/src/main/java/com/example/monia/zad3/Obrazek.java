package com.example.monia.zad3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Obrazek extends Activity{
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.obrazek);


        Button button1 = (Button) findViewById(R.id.button5);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context,MainActivity.class);
                startActivity(intent);

            }
        });

    }
    public void zmien_obrazek(View v){
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setImageResource(R.drawable.android);

    }
    public void zmien_obrazek2(View v){
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setImageResource(R.drawable.android2);

    }

}
