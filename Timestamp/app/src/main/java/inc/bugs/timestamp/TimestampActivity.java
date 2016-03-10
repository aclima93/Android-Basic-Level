package inc.bugs.timestamp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class TimestampActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timestamp);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Welcome back!", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();

        TextView timestamp = (TextView) findViewById(R.id.timestamp_tv);
        timestamp.setText("Last log: " + DateFormat.getDateTimeInstance().format(new Date()));

        Toast.makeText(getApplicationContext(), "Be back later", Toast.LENGTH_SHORT).show();
    }
}
