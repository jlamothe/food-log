package net.jlamothe.foodlog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onAddLog(View view)
    {
        Intent intent = new Intent(this, AddLogActivity.class);
        startActivity(intent);
    }
}
