package inc.bugs.reversesimonsays;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReverseSimonSays extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_simon_says);

        final String DEFAULT_TEXT = getString(R.string.simon_said_text);
        final int DEFAULT_COLOR = Color.TRANSPARENT;

        // Get a value from the SharedPreferences
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String lastButtonText = settings.getString("LastButtonText", DEFAULT_TEXT); // key and default value
        int lastButtonColor = settings.getInt("LastButtonColor", DEFAULT_COLOR); // key and default value

        // the TextView that changes color
        applyTextAndColor(lastButtonText, lastButtonColor);

        // our Reset button
        Button resetButton = (Button) findViewById(R.id.reset_btn);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveAndApply(DEFAULT_TEXT, DEFAULT_COLOR);
            }
        });

        // red button
        Button redButton = (Button) findViewById(R.id.red_button);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAndApply(getString(R.string.red), Color.RED);
            }
        });

        // green button
        Button greenButton = (Button) findViewById(R.id.green_button);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAndApply(getString(R.string.green), Color.GREEN);
            }
        });

        // blue button
        Button blueButton = (Button) findViewById(R.id.blue_button);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAndApply(getString(R.string.blue), Color.BLUE);
            }
        });

        // yellow button
        Button yellowButton = (Button) findViewById(R.id.yellow_button);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAndApply(getString(R.string.yellow), Color.YELLOW);
            }
        });


    }

    private void saveTextAndColor(String text, int color){

        // To set a value in the SharedPreferences we need an Editor object to make preference changes.
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("LastButtonText", text);
        editor.putInt("LastButtonColor", color);

        // Commit the edits!
        editor.commit();
    }

    public void applyTextAndColor(String text, int color){

        // paint the TextView and change the text
        TextView simonSaidTV = (TextView) findViewById(R.id.simon_said_tv);
        simonSaidTV.setText(text);
        simonSaidTV.setBackgroundColor(color);
    }

    public void saveAndApply(String text, int color){

        saveTextAndColor(text, color);
        applyTextAndColor(text, color);
    }

}
