package com.cunanan.cunananquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void toCS (View view){
        Intent intent = new Intent(this, CSScreen.class);
        startActivity(intent);
    }
    public void toIT (View view){
        Intent intent = new Intent(this, ITScreen.class);
        startActivity(intent);
    }
    public void toIS (View view){
        Intent intent = new Intent(this, ISScreen.class);
        startActivity(intent);
    }
}
