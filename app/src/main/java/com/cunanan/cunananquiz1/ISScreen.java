package com.cunanan.cunananquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isscreen);
    }
    public void toHome1 (View view){
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }
    public void toCS1 (View view){
        Intent intent = new Intent(this, CSScreen.class);
        startActivity(intent);
    }
    public void toIT1 (View view){
        Intent intent = new Intent(this, ITScreen.class);
        startActivity(intent);
    }
}

