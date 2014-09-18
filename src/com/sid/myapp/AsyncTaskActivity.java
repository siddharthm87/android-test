package com.sid.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AsyncTaskActivity extends Activity {
    private Button button;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.async_task_layout);
        button = (Button) findViewById(R.id.btnProgressBar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //start asyncTask
            }
        });
    }

    
}