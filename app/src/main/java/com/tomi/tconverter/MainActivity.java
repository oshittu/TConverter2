package com.tomi.tconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtAns;

    public void convert(View view)
    {
        Double ans;
        Double jours;

        txtAns=findViewById(R.id.txtAns);
        ans=Double.parseDouble(txtAns.getText().toString());
        jours=(ans*365);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}