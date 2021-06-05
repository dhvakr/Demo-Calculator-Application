package com.yourname.democalci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {


    Button btn0 , btndot, btnequal, btnclear, btnbract, btndele, btndivi, btn7, btn8, btn9, btn6, btn5, btn4, btn3, btn2, btn1, btnmulite, btnminis, btnpuls, btnpercent;

    TextView clcinput, clcoutput;

    String process;

    boolean checkBracket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);

        btn1 = findViewById(R.id.btn1);

        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btndot = findViewById(R.id.btndot);
        btnequal = findViewById(R.id.btnequal);
        btnclear = findViewById(R.id.btnclear);
        btnbract = findViewById(R.id.btnbract);
        btndele = findViewById(R.id.btndele);
        btndivi = findViewById(R.id.btndivi);
        btnmulite = findViewById(R.id.btnmulite);
        btnminis = findViewById(R.id.btnminis);
        btnpuls = findViewById(R.id.btnpuls);
        btnpercent = findViewById(R.id.btnpercent);



        clcinput = findViewById(R.id.clcinput);
        clcoutput = findViewById(R.id.clcoutput);

        btndot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+".");

            }
        });

        btnbract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if (checkBracket) {
                    process = clcinput.getText().toString();
                    clcinput.setText(process +")");
                    checkBracket = false;

                }else {
                    process = clcinput.getText().toString();
                    clcinput.setText(process +"(");
                    checkBracket = true;
                }

            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();

                process = process.replaceAll("×","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");


                org.mozilla.javascript.Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable, process, "javascript", 1, null).toString();


                }catch (Exception e) {

                    finalResult="0";
                }

                clcoutput.setText(finalResult);



            }
        });


        btndele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = clcinput.getText().toString();
                if(s.length() != 0) {
                    s = s.substring(0, s.length() -1);
                    clcinput.setText(s);

                }

            }
        });


        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clcinput.setText("");
                clcoutput.setText("");

            }
        });

        btndivi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"÷");

            }
        });

        btnminis.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"-");

            }
        });

        btnmulite.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"×");

            }
        });

        btnpuls.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"+");

            }
        });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"%");

            }
        });



        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"0");

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"4");

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                process = clcinput.getText().toString();
                clcinput.setText(process+"9");

            }
        });
    }
}