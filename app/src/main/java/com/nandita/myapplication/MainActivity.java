package com.nandita.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = findViewById(R.id.b1);
        final Button b2 = findViewById(R.id.b2);
        final Button b3 = findViewById(R.id.b3);
        final Button b4 = findViewById(R.id.b4);
        final  Button b5 = findViewById(R.id.b5);
        final Button b6 = findViewById(R.id.b6);
        final Button b7 = findViewById(R.id.b7);
        final Button b8 = findViewById(R.id.b8);
        final Button b9 = findViewById(R.id.b9);
        final Button b0 = findViewById(R.id.b0);
        final Button bplus = findViewById(R.id.bplus);
        final Button bminus = findViewById(R.id.bminus);
        final Button bmul = findViewById(R.id.bmul);
        final Button bdiv = findViewById(R.id.bdiv);
        final Button bpoint = findViewById(R.id.bpoint);
        final Button bequal = findViewById(R.id.bequal);
        final Button clr = findViewById(R.id.clr);

        final float[] exp1 = new float[1];
        final float[] exp2 = new float[1];
        final char[] op = new char[1];

        final TextView Tv = findViewById(R.id.tv1);
        final TextView Tv2 = findViewById(R.id.tv2);


        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv2.setText("");
                Tv.setText("");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b1.getText());

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b2.getText());

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b3.getText());

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b4.getText());

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b5.getText());

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b6.getText());

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b7.getText());

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b8.getText());

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b9.getText());

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(b0.getText());

            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Tv.append(bplus.getText());
                exp1[0] = Float.parseFloat(Tv.getText().toString());
                Tv2.setText(Tv.getText());
                Tv.setText("");
                op[0] = '+';
                Tv2.append("+");
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Tv.append(bminus.getText());
                exp1[0] = Float.parseFloat(Tv.getText().toString());
                Tv2.setText(Tv.getText());
                Tv.setText("");
                op[0] = '-';
                Tv2.append("-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Tv.append(bmul.getText());
                exp1[0] = Float.parseFloat(Tv.getText().toString());
                Tv2.setText(Tv.getText());
                Tv.setText("");
                op[0] = '*';
                Tv2.append("*");

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Tv.append(bdiv.getText());
                exp1[0] = Float.parseFloat(Tv.getText().toString());
                Tv2.setText(Tv.getText());
                Tv.setText("");
                op[0] = '/';
                Tv2.append("/");
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tv.append(bpoint.getText());

            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, String. exp1[0], Toast.LENGTH_SHORT).show();
                exp2[0] = Float.parseFloat(Tv.getText().toString());
                Tv2.append(Tv.getText());

                Tv.setText("");

              float answer = 0;

              switch(op[0]){

                  case '+': answer = exp1[0] + exp2[0];
                            Tv.setText(String.valueOf( answer));
                            break;

                  case '-': answer = exp1[0] - exp2[0];
                      Tv.setText(String.valueOf(answer));
                      break;

                  case '*': answer = exp1[0] * exp2[0];
                      Tv.setText(String.valueOf( answer));
                      break;

                  case '/': answer = exp1[0] / exp2[0];
                      Tv.setText(String.valueOf( answer));
                      break;

                  default: Toast.makeText(MainActivity.this, "RESULT", LENGTH_LONG).show();


              }
            }
        });
    }
}