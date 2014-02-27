package net.jlamothe.foodlog;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class LogInspectorActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_inspector);
        LogAdapter adapter = new LogAdapter(this, Data.logs);
        ListView listView = (ListView) findViewById(R.id.log_inspector_list);
        listView.setAdapter(adapter);
    }
}
