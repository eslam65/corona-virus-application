package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;

import com.example.coronavirus.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button button  ;
    private Button button2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.bt) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity() ;
            }
        }) ;

        button2 = findViewById(R.id.bt2) ;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2() ;
            }
        });
    }
    public void openLoginActivity() {
        Intent intent =  new Intent(this , LoginActivity.class) ;
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this , Activity2.class) ;
        startActivity(intent);
    }
}