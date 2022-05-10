package com.example.javabuttun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText d1;
    EditText d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }
    void  initView(){
        Button b_open=findViewById(R.id.b_open);
        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        b_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserDetail();
            }
        });
    }

    void UserDetail(){
        Intent intent=new Intent(this,UserActivity.class);

        intent.putExtra("userid",d1.getText().toString());
        intent.putExtra("userpw",d2.getText().toString());

        startActivity(intent);
    }
}