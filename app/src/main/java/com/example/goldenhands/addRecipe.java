package com.example.goldenhands;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class addRecipe extends AppCompatActivity {

    TextView showTime;
    TextView showTime2;
    int cTime=0;//set value for time
    int tPrep=0;


    private LinearLayout parentLinearLayout;
    private LinearLayout parentLinearLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        showTime=(TextView)findViewById(R.id.time);
        showTime2=(TextView)findViewById(R.id.time2);

        parentLinearLayout = (LinearLayout) findViewById(R.id.parent_linear_layout);
        parentLinearLayout2 = (LinearLayout) findViewById(R.id.parent_linear_layout2);
    }


     //increase time value
    public void tUp2(View v){
        cTime++;
        showTime.setText(Integer.toString(cTime));
    }

    public void tDown2(View v){
        cTime--;
        showTime.setText(Integer.toString(cTime));
    }



    public void tUp(View v){
        tPrep++;
        showTime2.setText(Integer.toString(tPrep));
    }

    public void tDown(View v){
        tPrep--;
        showTime2.setText(Integer.toString(tPrep));

    }
    //back button
    public void back(View v){
        Intent n= new Intent(this,MainActivity.class);
        startActivity(n);
        finish();
    }

    //add field
    public void onAddField(View v) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.field, null);
        // Add the new row before the add field button.
       parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() );
    }

    public void onDelete(View v) {
        parentLinearLayout.removeView((View) v.getParent());
    }


    //add steps

    public void onAddStep(View v) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.step, null);
        // Add the new row before the add field button.
        parentLinearLayout2.addView(rowView, parentLinearLayout2.getChildCount() );
    }

    public void onSDelete(View v) {
        parentLinearLayout2.removeView((View) v.getParent());
    }

}
