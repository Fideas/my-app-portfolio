package com.nicolascarrasco.www.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    final int DURATION = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void makeToast (String msg){
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, msg, DURATION);
        toast.show();
    }

    /**
     * Launch the corresponding app from the portfolio
     * @param view
     */
    public void launchApp(View view) {
        String msg = getString(R.string.launch_toast);
        String append = "";
        //Select the right app name for the toast
        switch (view.getId()){
            case R.id.spotify_button:
                append = getString(R.string.spotify_button);
                break;
            case R.id.football_button:
                append = getString(R.string.football_button);
                break;
            case R.id.library_button:
                append = getString(R.string.library_button);
                break;
            case R.id.bigger_button:
                append = getString(R.string.bigger_button);
                break;
            case R.id.reader_button:
                append = getString(R.string.reader_button);
                break;
            case R.id.my_app_button:
                append = getString(R.string.my_app_button);
                break;
        }
        msg = msg.concat(append);
        //Make Toast
        makeToast(msg);
    }
}
