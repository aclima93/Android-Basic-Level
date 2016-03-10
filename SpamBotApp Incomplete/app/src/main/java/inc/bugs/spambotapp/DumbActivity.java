package inc.bugs.spambotapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DumbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumb);

        Button dumb = (Button) findViewById(R.id.dumb_btn);
        dumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: manifest our intent to call the second activity

            }
        });

    }
}
