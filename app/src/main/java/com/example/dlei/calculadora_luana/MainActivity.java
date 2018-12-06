package com.example.dlei.calculadora_luana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edt_aluminio = (EditText) findViewById(R.id.edt_aluminio);
        EditText edt_papel = (EditText) findViewById(R.id.edt_Papel);
        EditText edt_plastico = (EditText) findViewById(R.id.edt_Plastico);
        EditText edt_papelao = (EditText) findViewById(R.id.edt_Papelao);

        Button btn_aluminio = (Button) findViewById(R.id.btn_Aluminio);
        Button btn_papel = (Button) findViewById(R.id.btn_Papel);
        Button btn_plastico = (Button) findViewById(R.id.btn_Plastico);
        Button btn_papelao = (Button) findViewById(R.id.btn_Papelao);



        btn_aluminio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(edt_aluminio.getText().toString());
                double soma = valor1 * 0.14;
                TextView n = (TextView) findViewById(R.id.txt_Aluminio);

                n.setText("=kjfgjkhakja");

            }
        });



    }
}
