package com.example.list_view;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void startActivityCursor(View v) {
        Intent intent = new Intent(this, ListViewDemo.class);
        startActivity(intent);
    }
    public void startActivityAdapter(View v){
    	Intent intent = new Intent(this, ArrayActivity.class);
    	startActivity(intent);
    }
    public void startActivityCustomAdapter(View v){
    	Intent intent = new Intent(this, CustomAdapterActivity.class);
    	startActivity(intent);
    	
    }
    public void startActivitySimpleAdapter(View v){
    	Intent intent = new Intent(this, SimpleAdapterActivity.class);
    	startActivity(intent);
    	
    }
  
    
}
