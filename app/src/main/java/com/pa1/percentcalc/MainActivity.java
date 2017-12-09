package com.pa1.percentcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView tvAnswer;
        EditText etpercent,etNumber;
        Button btnCal;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            tvAnswer=findViewById(R.id.tvAnswer);
            etNumber=findViewById(R.id.etNumber);
            etpercent=findViewById(R.id.etPercent);
            btnCal=findViewById(R.id.btnCal);

            btnCal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //if(!(etNumber.getText()==null)&&(etpercent.getText()==null)) {
                        int num = Integer.parseInt(String.valueOf(etNumber.getText()));
                        int per = Integer.parseInt(String.valueOf(etpercent.getText()));
                        int answer = (num*per)/100;
                        tvAnswer.setText(" "+answer);
                    //}
                }
            });


        }
    }
