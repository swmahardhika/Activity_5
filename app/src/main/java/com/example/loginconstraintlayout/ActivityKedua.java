package com.example.loginconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    TextView txemail, txpassword;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txemail = findViewById(R.id.tvEmail);

        txpassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString( "a");

        String pass = bundle.getString("b");

        txemail.setText(email);

        txpassword.setText(pass);
    }
}
