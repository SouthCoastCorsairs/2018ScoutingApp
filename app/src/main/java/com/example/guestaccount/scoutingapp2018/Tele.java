package com.example.guestaccount.scoutingapp2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);
    }

    public void Autonomous (View view) {
        Intent Auto = new Intent(this, Autonomous.class);
        startActivity(Auto);
    }

    public void Notes (View view) {
        Intent notes = new Intent(this, Notes.class);
        startActivity(notes);
    }
}
