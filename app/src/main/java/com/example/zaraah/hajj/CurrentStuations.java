package com.example.zaraah.hajj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//
public class CurrentStuations extends AppCompatActivity {
    Button button ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_stuation);

        // this button to accept request, and tracking patient's location
        button = (Button) findViewById(R.id.button);
      button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrentStuations.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}

