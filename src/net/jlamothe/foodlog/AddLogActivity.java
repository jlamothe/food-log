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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_log);
    }

    public void onSave(View view) {
        Date now = new Date();
        EditText textBox = (EditText) findViewById(R.id.add_log_description);
        String description = textBox.getText().toString().trim();
        if(description.isEmpty()) {
            Toast.makeText(this, "You must enter a description.", Toast.LENGTH_SHORT).show();
            return;
        }
        Log log = new Log(now, description);
        if(Data.addLog(log)) {
            Toast.makeText(this, "Log successfully saved", Toast.LENGTH_SHORT).show();
            finish();
        }
        else
            Toast.makeText(this, "Error saving log", Toast.LENGTH_SHORT).show();
    }

    public void onCancel(View view) {
        finish();
    }
}
