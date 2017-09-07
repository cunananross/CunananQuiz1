package com.cunanan.cunananquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ITScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itscreen);
    }
    public void toHome2 (View view){
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }
    public void toCS2 (View view){
        Intent intent = new Intent(this, CSScreen.class);
        startActivity(intent);
    }
    public void toIS2 (View view){
        Intent intent = new Intent(this, ISScreen.class);
        startActivity(intent);
    }
}
