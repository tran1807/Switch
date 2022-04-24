package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch switchwifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchwifi = (Switch) findViewById(R.id.switchwifi);

        switchwifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Bật wifi", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Tắt wifi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}