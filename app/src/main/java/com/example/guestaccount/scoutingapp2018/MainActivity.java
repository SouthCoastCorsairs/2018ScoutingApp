package com.example.guestaccount.scoutingapp2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.guestaccount.scoutingapp2018.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the use taps the Start button
     */
    public void startMatch(View view) {
        //Do something in response to button
            Intent intent = new Intent(this, Autonomous.class);
        //    EditText editText =(EditText) findViewById(R.id.editText);
        //    String message =editText.getText().toString();
        //    intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        //}

        //public void increaseScale (View view) {
        //  TextView Scale_Display = findViewById(R.id.Scale_display);
        //  int Scale = Integer.parseInt(Scale_Display.getText().toString());
        //  Scale_Display.setText(""+Scale++);
    }
}