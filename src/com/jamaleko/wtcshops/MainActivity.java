package com.jamaleko.wtcshops;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
  //method tombol gambar
  	public void open1(View v){
  		Intent intent1 = new Intent(getApplicationContext(),AW.class);
  		startActivity(intent1);
  	}
  	public void open2(View v){
  		Intent intent2 = new Intent(getApplicationContext(),DineAndChat.class);
  		startActivity(intent2);
  	}
  	public void open3(View v){
  		Intent intent3 = new Intent(getApplicationContext(),Jco.class);
  		startActivity(intent3);
  	}
}
