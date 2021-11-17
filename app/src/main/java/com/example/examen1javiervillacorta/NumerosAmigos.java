package com.example.examen1javiervillacorta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosAmigos extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView n1Textview, n2Textview, resultado;
        EditText n1Text, n2Text;

        n1Textview = (TextView) findViewById(R.id.n1_textview);
        n2Textview = (TextView) findViewById(R.id.n2_textview);
        resultado = (TextView) findViewById(R.id.resultado);


        Button calcButton = (Button) findViewById(R.id.calc_button);
        calcButton.setOnClickListener(onCalcButtonClick());

    }


    //boton de calculo
    public View.OnClickListener onCalcButtonClick(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1Text = (EditText) findViewById(R.id.n1_text);
                EditText n2Text = (EditText) findViewById(R.id.n2_text);



            }
        };
    }
}
