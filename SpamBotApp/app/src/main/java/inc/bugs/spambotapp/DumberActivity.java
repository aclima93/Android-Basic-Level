package inc.bugs.spambotapp;

import android.content.Intent;
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

                // structure our intent
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipientArray = new String[]{"victim1@google.com", "victim2@google.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, recipientArray);
                intent.putExtra(Intent.EXTRA_TEXT, "Viagra 50% off");

                // the following statement checks whether there is any app that can handle the intent
                startActivity(Intent.createChooser(intent, "Send Email Using: "));

            }
        });

    }
}
