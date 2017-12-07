package ly.generalassemb.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mUsernameEditText, mPasswordEditText;
    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = (EditText) findViewById(R.id.username);
        mPasswordEditText = (EditText) findViewById(R.id.password);
        mLoginButton = (Button) findViewById(R.id.login);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkLogin()){
                    Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                    intent.putExtra("username",mUsernameEditText.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private boolean checkLogin(){
        boolean isValid = true;

        if(mUsernameEditText.getText().toString().trim().length() == 0){
            isValid = false;
            mUsernameEditText.setError("Enter a username");
        }

        if(mPasswordEditText.getText().toString().trim().length() == 0){
            isValid = false;
            mPasswordEditText.setError("Enter a password");
        } else if(!mPasswordEditText.getText().toString().trim().equals("hello")){
            isValid = false;
            mPasswordEditText.setError("Incorrect password");
        }

        return isValid;
    }
}
