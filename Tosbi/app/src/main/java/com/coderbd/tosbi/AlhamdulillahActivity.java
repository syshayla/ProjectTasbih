package com.coderbd.tosbi;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlhamdulillahActivity extends AppCompatActivity {
    TextView countter;
    Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alhamdulillah);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        countter =findViewById(R.id.txtAlhamdulillah);
        btnCount = findViewById(R.id.btnAlhamdulillah);

    }
    int count = 0;
    public void goCount(View view){
        count++;
        countter.setText(String.valueOf(count));
    }
    int count1 = 0;
    public void startAgain(View view){

        countter.setText("0");
        count1++;
        countter.setText(String.valueOf(count));
    }


    public void clear(View v) {
        countter.setText("0");
    }

}
