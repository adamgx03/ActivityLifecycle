package com.abooth.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MyActivity extends Activity {

    private String createMSG;
    private String startMSG;
    private String resumeMSG;
    private String pauseMSG;
    private String stopMSG;
    private String restartMSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        initializeMessages();

        Toast.makeText(this, createMSG, Toast.LENGTH_LONG).show();
        Log.d(msg, createMSG);
    }

    private void initializeMessages() {
        createMSG = (String) getResources().getText(R.string.create_message);
        startMSG = (String) getResources().getText(R.string.start_message);
        resumeMSG = (String) getResources().getText(R.string.resume_message);
        pauseMSG = (String) getResources().getText(R.string.pause_message);
        stopMSG = (String) getResources().getText(R.string.stop_message);
        restartMSG = (String) getResources().getText(R.string.restart_message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, startMSG, Toast.LENGTH_LONG).show();
        Log.d(msg, startMSG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, resumeMSG, Toast.LENGTH_LONG).show();
        Log.d(msg, resumeMSG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, pauseMSG, Toast.LENGTH_LONG).show();
        Log.d(msg, pauseMSG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, restartMSG, Toast.LENGTH_LONG).show();
        Log.d(msg, restartMSG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, stopMSG, Toast.LENGTH_LONG).show();
        Log.d(msg, stopMSG);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //INFLATE THE MENU
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //HANDLE ACTION BAR ITEM CLICKS HERE.  THE ACTION BAR WILL
        //AUTOMATICALLY HANDLE CLICKS ON THE HOME/UP BUTTON, SO LONG
        //AS YOU SPECIFY A PARENT ACTIVITY IN AndroidManifest.xml
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
