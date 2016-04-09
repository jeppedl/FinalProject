package com.example.pmr.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar1;
    private ProgressBar progressBar2;
    public Button button;

    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ProgressBar progressBar1 = (ProgressBar)findViewById (R.id.progressBar1);
        progressBar1.setProgress(45);

        ((TextView) findViewById(R.id.textview_progressbar1)).setText("Walking - 75%");

        ProgressBar progressBar2 = (ProgressBar)findViewById (R.id.progressBar2);
        progressBar2.setProgress(60);

        ((TextView) findViewById(R.id.textview_progressbar2)).setText("Running - 90%");


        button = (Button)findViewById(R.id.content_main_button);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),SyncActivity.class);
                    startActivity(i);
                }
            });
        textView = (TextView)findViewById(R.id.content_main_textView2);
        /*textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this,Goals.class);
                startActivity(m);
            }
        });*/

        textView2 = (TextView)findViewById(R.id.content_main_textView3);
            textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this,Goals.class);
                startActivity(n);
            }
        });

    }

    public void oncl(View v){
        Intent n = new Intent(MainActivity.this,Goals.class);
        startActivity(n);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
