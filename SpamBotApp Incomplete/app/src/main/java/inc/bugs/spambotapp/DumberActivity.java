package inc.bugs.spambotapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumber);

        Button dumber = (Button) findViewById(R.id.dumber_btn);
        dumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: structure our email intent with appropriate extras

            }
        });

    }
}
