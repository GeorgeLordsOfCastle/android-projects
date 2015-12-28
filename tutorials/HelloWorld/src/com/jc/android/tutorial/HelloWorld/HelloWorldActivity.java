package com.jc.android.tutorial.HelloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class HelloWorldActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_world_menu, menu);
        return true;
    }
}
