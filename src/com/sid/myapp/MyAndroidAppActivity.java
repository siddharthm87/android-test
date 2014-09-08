package com.sid.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;



public class MyAndroidAppActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final ListView listView = (ListView) findViewById(R.id.listView);
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        Button startWebview = (Button) findViewById(R.id.buttonActivity);
        startWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAndroidAppActivity.this, WebviewActivity.class);
                startActivity(intent);
            }
        });

        Button dialogLauncher = (Button) findViewById(R.id.dialogLauncher);
        dialogLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(view.getContext(), "You clicked on dialog launcher", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button switchFragment = (Button) findViewById(R.id.switchFragment);
        switchFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAndroidAppActivity.this, ListViewLoader.class);
                startActivity(intent);

            }
        });

        Button checkState = (Button) findViewById(R.id.checkState);
        switchFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAndroidAppActivity.this, StateChangeActivity.class);
                startActivity(intent);

            }
        });

        Button showList = (Button) findViewById(R.id.showList);
        showList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setVisibility(View.VISIBLE);

            }
        });

        Button hideList = (Button) findViewById(R.id.hideLIst);
        hideList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setVisibility(View.GONE);

            }
        });

        Button launchSpinner = (Button) findViewById(R.id.launchSpinner);
        launchSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAndroidAppActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
