package com.example.thal3.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Curriculo extends AppCompatActivity {

    EditText editQualidades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculo);

        editQualidades = (EditText)findViewById(R.id.editQualidades);
    }
}
