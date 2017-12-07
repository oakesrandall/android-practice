package ly.generalassemb.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mTextView = (TextView) findViewById(R.id.welcome);
        mTextView.setText("Hello "+getIntent().getStringExtra("username")+"!");
    }
}
