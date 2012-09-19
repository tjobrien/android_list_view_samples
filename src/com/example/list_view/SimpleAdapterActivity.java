package com.example.list_view;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.support.v4.app.NavUtils;

public class SimpleAdapterActivity extends Activity {
	ListView mListView;
	//uses a defined layout
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        mListView = (ListView) this.findViewById(R.id.list);
        Log.v("SimpleAdapterActivity", "reference to ListView");
        //Data to load - see below for another set of data.
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        
        HashMap<String, String> item = new HashMap<String, String>();
        HashMap<String, String> item2 = new HashMap<String, String>();
        HashMap<String, String> item3 = new HashMap<String, String>();
        HashMap<String, String> item4 = new HashMap<String, String>();
        
        item.put("name", "Branko");
        item.put("lastname", "Ajzele");
        item.put("email", "branko.ajzele@some-email.com");
        
        item2.put("name", "Tomislav");
        item2.put("lastname", "Bilic");
        item2.put("email", "tomislav.bilic@some-email.com");
        
        item3.put("name", "Vedran");
        item3.put("lastname", "Subotic");
        item3.put("email", "vedran.subotic@some-email.com");        
        
        item4.put("name", "Zeljko");
        item4.put("lastname", "Prsa");
        item4.put("email", "zeljko.prsa@some-email.com");        
        
        list.add(item);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        
        //String[] columns = new String[] { "name", "lastname", "email" };
        int[] renderTo = new int[] { R.id.name, R.id.lastname, R.id.email };
        // or
        List<Map> data = GetSampleData();
        String [] columns = new String[]{"display_name", "age", "comment"};
       // ListAdapter listAdapter = new SimpleAdapter(this, list, R.layout.simple_adapter_list_row, columns, renderTo);//works
        
        //use the data from below - note column need to match first element of of map
        ListAdapter listAdapter = new SimpleAdapter(this, (List<? extends Map<String, ?>>) data, R.layout.simple_adapter_list_row, columns, renderTo);//works

        mListView.setAdapter(listAdapter);
        
        
    }
	List<Map> GetSampleData() {
        List<Map> list = new ArrayList<Map>();

       Map<String, String> map = new HashMap<String, String>();
        map.put("display_name", "Tom OBrien");
        map.put("age", "75");
        map.put("comment", "Tom looks way older");
        list.add(map);
        map = new HashMap<String, String>();
        map.put("display_name", "Jason G");
        map.put("age", "28");
        map.put("comment", "Jason looks his age.");
        list.add(map);

       return list;
        }



}
