package com.example.guestaccount.scoutingapp2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Autonomous extends AppCompatActivity {
    Button scale_auto_up;
    Button scale_auto_down;
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomous);

        scale_auto_up = (Button)findViewById(R.id.scale_auto_up);
        scale_auto_down = (Button)findViewById(R.id.scale_auto_down);

        scale_auto_up.setOnClickListener((OnClickListener) this);
        scale_auto_down.setOnClickListener((OnClickListener) this);

        i=0;

/*
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
                if (i <0) {i = 0;}
                scale_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button switch_auto_up = (Button) findViewById(R.id.switch_auto_up);
        final TextView switch_auto_entry = (TextView) findViewById(R.id.switch_auto_entry);
        switch_auto_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i++;
            switch_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        final Button switch_auto_down = (Button) findViewById(R.id.switch_auto_down);
        switch_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i--;
            if (i <0) {i = 0;}
            switch_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button deliver_auto_up = (Button) findViewById(R.id.deliver_auto_up);
        final TextView deliver_auto_entry = (TextView) findViewById(R.id.deliver_auto_entry);
        deliver_auto_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i++;
            deliver_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button deliver_auto_down = (Button) findViewById(R.id.deliver_auto_down);
        deliver_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i--;
            if (i <0) {i = 0;}
            deliver_auto_entry.setText(Integer.toString(i));

            }
        }

        ); */
}
 public void scale_auto(View v) {
        if(v==scale_auto_up){
            i++;
        }  else if(v==scale_auto_down){
            i--;
            if (i<0){
                i=0;
            }
        }
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