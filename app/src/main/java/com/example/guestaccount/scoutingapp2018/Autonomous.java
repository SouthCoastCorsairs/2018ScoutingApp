package com.example.guestaccount.scoutingapp2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Autonomous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomous);
        Button scale_auto_up = (Button) findViewById(R.id.scale_auto_up);
        final TextView scale_auto_entry = (TextView) findViewById(R.id.scale_auto_entry);

        scale_auto_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i++;
                scale_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button scale_auto_down = (Button) findViewById(R.id.scale_auto_down);
        scale_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i--;
                scale_auto_entry.setText(Integer.toString(i));

            }
        }

        );
}

    public void Teleop (View view) {
        Intent tele = new Intent(this, Tele.class);
        startActivity(tele);
    }

    public void Notes (View view) {
        Intent notes = new Intent(this, Notes.class);
        startActivity(notes);
    }

}