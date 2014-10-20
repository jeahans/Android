package com.example.jeanette.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainScreen extends Activity implements View.OnClickListener {

    Button startSpil, highscore, upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        startSpil = (Button) findViewById(R.id.start);
        highscore = (Button) findViewById(R.id.highScore);
        upload    = (Button) findViewById(R.id.upload);

        startSpil.setOnClickListener(this);
        highscore.setOnClickListener(this);
        upload.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v==startSpil){
            startActivity(new Intent(this, Spiltyper.class));
        }else if(v==highscore){
            startActivity(new Intent(this, Highscore.class));
        }else if(v==upload){
            startActivity(new Intent(this, Upload.class));

        }

    }
}
