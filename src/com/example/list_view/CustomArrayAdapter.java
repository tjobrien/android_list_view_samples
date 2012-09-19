package com.example.list_view;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class CustomArrayAdapter extends ArrayAdapter<String> {

	private final Context context;
	private final String[] values;
	private final String [] keys;
	//constructor
	public CustomArrayAdapter(Context context, String[] values, String[] keys) {
		super(context, R.layout.list_row, values);
		this.context = context;
		this.values = values;
		this.keys = keys;
	}

	 @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.list_row, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.label_1);
	    TextView textView2 = (TextView) rowView.findViewById(R.id.label_2);
	    TextView textView3 = (TextView) rowView.findViewById(R.id.label_3);
	    textView.setText(values[position]);
	    // set the same value for the second textView
	    textView2.setText(keys[position]); //examples have this setting a imageview with logic.  
	    textView3.setText("hello android");

	    return rowView;
	  }

}
