package com.noaimi.nada.tutorialsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buspageButton = findViewById(R.id.bus);
        buspageButton.setOnClickListener(this);

        View engpageButton = findViewById(R.id.eng);
        engpageButton.setOnClickListener(this);

        View aspageButton = findViewById(R.id.as);
        aspageButton.setOnClickListener(this);

        View cespageButton = findViewById(R.id.ces);
        cespageButton.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClick (View v)
    {
        switch (v.getId())
        {
            case R.id.bus:
                Intent i = new Intent(this, bCourses.class);
                startActivity(i);
                break;

            case R.id.eng:
                Intent ii = new Intent(this, eCourses.class);
                startActivity(ii);
                break;

            case R.id.as:
                Intent iii = new Intent(this, aCourses.class);
                startActivity(iii);
                break;

            case R.id.ces:
                Intent iiii = new Intent(this, cCourses.class);
                startActivity(iiii);
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
