package com.example.list_view;
import android.app.ListActivity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class SMSInbox extends ListActivity{
	@Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // We'll define a custom screen layout here (the one shown above), but
        // typically, you could just use the standard ListActivity layout.
       //setContentView(R.layout.activity_list_view_demo);

        // Query for all people contacts using the Contacts.People convenience class.
        // Put a managed wrapper around the retrieved cursor so we don't have to worry about
        // requerying or closing it as the activity changes state.
        Cursor cursor = getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
        startManagingCursor(cursor);

        // Now create a new list adapter bound to the cursor.
        // SimpleListAdapter is designed for binding to a Cursor.
        @SuppressWarnings("deprecation")
		ListAdapter adapter = new SimpleCursorAdapter(
                this, // Context.
                android.R.layout.simple_list_item_2,  // Specify the row template to use (here, two columns bound to the two retrieved cursor rows).
                cursor,                                              // Pass in the cursor to bind to.
                new String[] {cursor.getString(cursor.getColumnIndexOrThrow("body")).toString() , cursor.getString(cursor.getColumnIndexOrThrow("address")).toString()},         // Array of cursor columns to bind to.
                new int[] {android.R.id.text1, android.R.id.text2});  // Parallel array of which template objects to bind to those columns.
        // Bind to our new adapter.
        setListAdapter(adapter);
                }

}
