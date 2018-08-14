package com.phoenix.beizerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.phoenix.beizerdemo.view.Bezier;


public class BezierActivity extends AppCompatActivity {
    private Bezier bezier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bezier);
        bezier = (Bezier) findViewById(R.id.bezier2); }
}
