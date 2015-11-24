package com.example.swatir.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    /** Called when the user touches the button */
    public void clickButton1(View view) {
        // Do something in response to button click
        displayToast(R.string.string_TT1);
    }

    /** Called when the user touches the button 2 */
    public void clickButton2(View view) {
        // Do something in response to button click
        displayToast(R.string.string_TT2);
    }

    /** Called when the user touches the button 3 */
    public void clickButton3(View view) {
        // Do something in response to button click
        displayToast(R.string.string_TT3);
    }

    /** Called when the user touches the button 4 */
    public void clickButton4(View view) {
        // Do something in response to button click
        displayToast(R.string.string_TT4);
    }

    /** Called when the user touches the button 5 */
    public void clickButton5(View view) {
        // Do something in response to button click
        displayToast(R.string.string_TT5);
    }

    /** Called when the user touches the button 6 */
    public void clickButton6(View view) {
        // Do something in response to button click

        displayToast(R.string.string_TT6);
    }

    private void displayToast(int textid) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Resources res = getResources();
        String text = res.getString(textid);
        CharSequence styledText = Html.fromHtml(text);

        Toast toast = Toast.makeText(context, styledText, duration);
        toast.show();
    }


}
