package com.example.monia.zad3;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView text1;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    EditText name;
    EditText surname;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        name = (EditText) findViewById(R.id.editText);
        surname = (EditText) findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnieto1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnieto2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnieto3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView5);
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context,Obrazek.class);
                startActivity(intent);

                name.getText();
                surname.getText();
                textView.setText(name.getText()+" "+surname.getText());
            }
        });
    }
}
