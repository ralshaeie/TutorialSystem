package com.noaimi.nada.tutorialsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class eCourses extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecourses);

        View Button1 = findViewById(R.id.me);
        Button1.setOnClickListener(this);

        View Button2 = findViewById(R.id.eg);
        Button2.setOnClickListener(this);

        View Button3 = findViewById(R.id.ee);
        Button3.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.e_courses, menu);
        return true;
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

    public void onClick (View v)
    {
        switch (v.getId())
        {
            case R.id.me:
                Intent i = new Intent(this, mInformation.class);
                startActivity(i);
                break;

            case R.id.eg:
                Intent ii = new Intent(this, eInformation.class);
                startActivity(ii);
                break;

            case R.id.ee:
                Intent iii = new Intent(this, eeInformation.class);
                startActivity(iii);
                break;

        }
    }

}
