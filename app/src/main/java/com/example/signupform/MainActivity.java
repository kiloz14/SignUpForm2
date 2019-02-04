package com.example.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText email;
    EditText password;
    EditText rePwd;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.editText);
        email = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        rePwd  = findViewById(R.id.editText4);
        button = findViewById(R.id.saveButt);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name, em, pwd, repwd;

                name = userName.getText().toString();
                em = email.getText().toString();
                pwd = password.getText().toString();
                repwd = rePwd.getText().toString();

                if(name.isEmpty() || em.isEmpty()|| pwd.isEmpty()|| repwd.isEmpty()){
                    Toast tot = Toast.makeText(getApplicationContext(), "Please fill with Credentials",Toast.LENGTH_LONG);
                    tot.show();
                }else{

                    Toast one = Toast.makeText(getApplicationContext(), "Welcome " + name, Toast.LENGTH_LONG);
                    one.show();

                }

                if (!pwd.equals(repwd)){
                    Toast toa = Toast.makeText(getApplicationContext(), "YOUR PASSWORDS DON'T MATCH", Toast.LENGTH_LONG);
                    toa.show();
                }





            }
        });
    }

}
