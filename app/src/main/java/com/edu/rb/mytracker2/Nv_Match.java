package com.edu.rb.mytracker2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class Nv_Match extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nv_match);

        setTitle("Nouveau Match");
    }

    public void neuf_trous()
    {
        Intent intent = new Intent (this, Neuf_trous.class);
        startActivity(intent);
    }

    public void dixhuit_trous()
    {
        Intent intent = new Intent (this, DixHuit_trous.class);
        startActivity(intent);
    }

    public void ClickHandler(View view) throws ExecutionException, InterruptedException{
        if(view.getId()==R.id.neuf){
            Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
            neuf_trous();
        }
        if(view.getId()==R.id.dixhuit){
            dixhuit_trous();
        }

    }
}
