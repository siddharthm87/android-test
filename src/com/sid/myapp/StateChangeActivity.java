package com.sid.myapp;

/**
 * Created by siddharthmolleti on 9/2/14.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StateChangeActivity extends Activity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.state_change);
        tv = (TextView) findViewById(R.id.textView);
        tv.setText("On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tv.setText("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tv.setText("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tv.setText("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        tv.setText("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv.setText("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv.setText("onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        tv.setText("savedInstance");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedState) {
        tv.setText("onRestoreInstaneState");
    }
}
