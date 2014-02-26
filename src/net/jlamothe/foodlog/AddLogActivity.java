package net.jlamothe.foodlog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Date;

public class AddLogActivity extends Activity
{
    public static final String EXTRA_MESSAGE = "net.jlamothe.foodlog.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_log);
    }

    public void onSave(View view) {
        Date now = new Date();
        EditText textBox = (EditText) findViewById(R.id.add_log_description);
        String description = textBox.getText().toString();
        String message = "You ate " + description + " on " + now.toString();
        Log log = new Log(now, message);
        if(Data.addLog(log)) {
            Intent intent = new Intent(this, SaveNotificationActivity.class);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivityForResult(intent, 1);
        }
        else {
            Toast toast = Toast.makeText(this, "Error saving log", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void onCancel(View view) {
        finish();
    }

    @Override
    protected void onActivityResult(int code, int result, Intent data) {
        finish();
    }
}
