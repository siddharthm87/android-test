package com.sid.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MyAndroidAppActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

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
    }
}
