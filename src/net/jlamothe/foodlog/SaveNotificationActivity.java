package net.jlamothe.foodlog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SaveNotificationActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_notification);
        Intent intent = getIntent();
        String message = intent.getStringExtra(AddLogActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.save_notification_text);
        textView.setText(message);
    }
}
