package com.edu.rb.mytracker2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    public void IntentNvMatch()
    {
        Intent intent = new Intent (this, Nv_Match.class);
        startActivity(intent);
    }

    public void IntentStats5()
    {
        Intent intent = new Intent (this, Stats5.class);
        startActivity(intent);
    }

    public void IntentStats()
    {
        Intent intent = new Intent (this, Stats.class);
        startActivity(intent);
    }

    public void ClickHandler(View view) throws ExecutionException, InterruptedException{
        if(view.getId()==R.id.nv_match){
            Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
            IntentNvMatch();
        }
        if(view.getId()==R.id.Stats5){
            IntentStats5();
        }
        if(view.getId()==R.id.Stats){
            IntentStats();
        }
    }
}
