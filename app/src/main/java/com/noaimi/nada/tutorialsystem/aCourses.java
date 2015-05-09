package com.noaimi.nada.tutorialsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class aCourses extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_courses);

        View Button = findViewById(R.id.irl);
        Button.setOnClickListener(this);

        View bilpageButton = findViewById(R.id.bil);
        bilpageButton.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.a_courses, menu);
        return true;
    }

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.irl:
                Intent i = new Intent(this, iInformation.class);
                startActivity(i);
                break;

            case R.id.bil:
                Intent ii = new Intent(this, BIL.class);
                startActivity(ii);
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
