package com.example.swtrdg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    LinearLayout lnv;
    ToggleButton tgl;
    RadioGroup rg;
    Button btn;
    RadioButton rgr, rgg, rgb, rgw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lnv=(LinearLayout) findViewById(R.id.lnv);
        tgl=(ToggleButton) findViewById(R.id.tgl);
        rg=(RadioGroup) findViewById(R.id.rg);
        btn=(Button) findViewById(R.id.btn);
        rgr=(RadioButton) findViewById(R.id.RGR);
        rgg=(RadioButton) findViewById(R.id.RGG);
        rgb=(RadioButton) findViewById(R.id.RGB);
        rgw=(RadioButton) findViewById(R.id.RGW);
    }

    public void red(View view) {
        if(!(tgl.isChecked())) lnv.setBackgroundColor(0xFFFF0000);

    }

    public void green(View view) {
        if(!(tgl.isChecked())) lnv.setBackgroundColor(0xFF00FF00);
    }

    public void blue(View view) {
        if(!(tgl.isChecked())) lnv.setBackgroundColor(0xFF0000FF);
    }

    public void white(View view) {
        if(!(tgl.isChecked())) lnv.setBackgroundColor(0xFFFFFFFF);
    }

    public void chng(View view) {
        if(tgl.isChecked()){
            if(rgr.isChecked()) lnv.setBackgroundColor(0xFFFF0000);
            if(rgg.isChecked()) lnv.setBackgroundColor(0xFF00FF00);
            if(rgb.isChecked()) lnv.setBackgroundColor(0xFF0000FF);
            if(rgw.isChecked()) lnv.setBackgroundColor(0xFFFFFFFF);
        }
    }
}