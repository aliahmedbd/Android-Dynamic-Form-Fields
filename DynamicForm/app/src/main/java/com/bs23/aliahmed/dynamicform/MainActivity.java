package com.bs23.aliahmed.dynamicform;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.BetterSpinner;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    View myView;
    ViewGroup parent;
    LinearLayout formLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView = findViewById(R.id.custom_view);
        parent = (ViewGroup) myView.getParent();
        parent.removeView(myView);

        formLayout = (LinearLayout)findViewById(R.id.formLayout);
        formLayout.removeAllViews();
        formLayout.setOrientation(LinearLayout.VERTICAL);
        formLayout.setPadding(MyDynamicFields.dpToPx(16), MyDynamicFields.dpToPx(16), MyDynamicFields.dpToPx(16), MyDynamicFields.dpToPx(16));

        MyDynamicFields.setEditText(formLayout,this,"Enter Name");
        setSpinnerAdapter(MyDynamicFields.setSpinner(formLayout,this,"Location"));
        MyDynamicFields.setEditText(formLayout,this,"Exact Location");
        setSpinnerAdapter(MyDynamicFields.setSpinner(formLayout,this,"Department"));
        MyDynamicFields.setButton(formLayout,this,"Submit");
    }


    public void setSpinnerAdapter(BetterSpinner locationSpinner){
        List<String> locationList = new ArrayList<>();
        locationList.add("Dhaka");
        locationList.add("Comilla");
        locationList.add("Chittagong");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.select_dialog_item,locationList);
        locationSpinner.setAdapter(arrayAdapter);
    }

}

