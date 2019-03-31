package com.example.goldenhands;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class stepAct extends AppCompatActivity {
    int steps=1;
    TextView showNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step);
        showNum=(TextView)findViewById(R.id.textView5);
    }


    public void tUp2(View v){
        steps++;
        showNum .setText(Integer.toString(steps))
        ;
    }
}
