package net.jlamothe.foodlog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AddLogActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_log);
    }

    public void onCancel(View view)
    {
        finish();
    }
}
