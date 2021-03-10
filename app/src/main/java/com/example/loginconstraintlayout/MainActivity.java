package com.example.loginconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk button
    Button btnLogin;

    //deklarasi variabel untuk Edittext
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menyimpan input user di edit text email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda:"+nama+" dan password anda"+password+"", Toast.LENGTH_LONG);

                String email = "satriawira@gmail.com";
                String pass = "satria123";

                if (nama.equals(email) && password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Login sukses", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (!nama.equals(email) && password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Email salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.equals(email) && !password.equals(pass))
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    t = Toast.makeText(getApplicationContext(),
                            "Email dan password salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}