package com.distro.wtcbatangharidistro;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DistroWTC extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distro_wtc);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.distro_wtc, menu);
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
    public void openAir(View v){
    	Intent jaka = new Intent(getApplicationContext(),AirBorne.class);
    	startActivity(jaka);
    }
    public void openCelcius(View v){
    	Intent tomy = new Intent(getApplicationContext(),Celcius.class);
    	startActivity(tomy);
    }
    public void openMiami(View v){
    	Intent jakatomy = new Intent (getApplicationContext(),MiamiActivity.class);
    	startActivity(jakatomy);
    }
}
