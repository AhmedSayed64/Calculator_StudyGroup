package com.example.ahmedsayed.studygroup_task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nu1, nu2;
    private Button sub, add, mul, div;
    private TextView result;
    private double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inti();
        //  operations();
        final ArrayList<Button> arr = new ArrayList<>();
        arr.add(sub);
        arr.add(add);
        arr.add(div);
        arr.add(mul);
        for (int i = 0; i < arr.size(); i++) {
            final int finalI = i;
            arr.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        double num1 = Double.parseDouble(nu1.getText().toString());
                        double num2 = Double.parseDouble(nu2.getText().toString());

                        if (arr.get(finalI).getId() == R.id.sub_btn) {
                            res = num1 - num2;
                            result.setText("Result : " + res);
                        } else if (arr.get(finalI).getId() == R.id.add_btn) {
                            res = num1 + num2;
                            result.setText("Result : " + res);
                        } else if (arr.get(finalI).getId() == R.id.mul_btn) {
                            res = num1 * num2;
                            result.setText("Result : " + res);
                        } else if (arr.get(finalI).getId() == R.id.div_btn) {
                            res = num1 / num2;
                            result.setText("Result : " + res);
                        }
                    } catch (Exception e) {
                        Toast.makeText(getBaseContext(), "Please Enter Valid 2 Numbers", Toast.LENGTH_SHORT).show();

                    }


                }
            });
        }


    }

    public void inti() {
        nu1 = (EditText) findViewById(R.id.n1_tv);
        nu2 = (EditText) findViewById(R.id.n2_tv);
        sub = (Button) findViewById(R.id.sub_btn);
        add = (Button) findViewById(R.id.add_btn);
        mul = (Button) findViewById(R.id.mul_btn);
        div = (Button) findViewById(R.id.div_btn);
        result = (TextView) findViewById(R.id.result_tv);
    }

    public double operations() {

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(nu1.getText().toString());
                double num2 = Double.parseDouble(nu2.getText().toString());
                res = num1 - num2;
                result.setText("Result : " + res);

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(nu1.getText().toString());
                double num2 = Double.parseDouble(nu2.getText().toString());
                res = num1 + num2;
                result.setText("Result : " + res);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(nu1.getText().toString());
                double num2 = Double.parseDouble(nu2.getText().toString());
                res = num1 * num2;
                result.setText("Result : " + res);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(nu1.getText().toString());
                double num2 = Double.parseDouble(nu2.getText().toString());
                res = num1 / num2;
                result.setText("Result : " + res);
            }
        });
        return res;

    }

}
