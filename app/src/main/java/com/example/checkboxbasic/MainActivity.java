package com.example.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox cb1, cb2, cb3, cb4, cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.cb1);
        cb1.setOnClickListener(this);
        cb2 = findViewById(R.id.cb2);
        cb2.setOnClickListener(this);
        cb3 = findViewById(R.id.cb3);
        cb3.setOnClickListener(this);
        cb4 = findViewById(R.id.cb4);
        cb4.setOnClickListener(this);
        cb5 = findViewById(R.id.cb5);
        cb5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.cb1 :

                if (cb1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.cb2 :

                if (cb2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "java", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.cb3 :

                if (cb3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.cb4 :

                if (cb4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.cb5 :

                if (cb5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Unity 3D", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

}
