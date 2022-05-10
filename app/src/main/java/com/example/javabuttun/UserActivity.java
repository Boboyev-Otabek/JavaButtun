package com.example.javabuttun;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        initViews();
    }

    void initViews(){
        TextView text=findViewById(R.id.text);

        String userid=getIntent().getStringExtra("userid");
        String userpw=getIntent().getStringExtra("userpw");

        text.setText("UserID "+userid+ "\nUserPW "+userpw);

    }
}
