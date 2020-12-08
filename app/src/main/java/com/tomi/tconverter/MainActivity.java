package com.tomi.tconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* THIS CODE USES:
- ON CLICK LISTENERS
- DIALOGUE ALERT BUTTON (verify an action)
- input and output of numerical values
 */

public class MainActivity extends AppCompatActivity {

    TextView txtJours;
    Button btnSortir, btnConvert, btnRec;
    EditText txtAns;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJours=findViewById(R.id.txtJours);
        txtAns=findViewById(R.id.txtAns);
        btnSortir=findViewById(R.id.btnSortir);
        btnConvert=findViewById(R.id.btnConvert);
        btnRec=findViewById(R.id.btnRec);

        btnConvert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cnvrt();
            }
        });

        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                recommencer();
            }
        });

        btnSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                sortir();
            }
        });

    }

    private void cnvrt()
    {
        String valueAns = txtAns.getText().toString();
        double ans= Double.parseDouble(valueAns);
        double jours = ans * 365;
        txtJours.setText("" + jours);
    }

    private void recommencer()
    {
        txtJours.setText("");
        txtAns.setText("");
    }

    private void sortir()
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Verifier");
        dialog.setMessage("Voulez-vous fermer l'application?");
        dialog.setCancelable(true);

        dialog.setPositiveButton(
                "Oui",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int
                            id) {
                        finish();
                        System.exit(0);
                    }
                });

        dialog.setNegativeButton(
                "Non",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = dialog.create();
        alert.show();
    }

}