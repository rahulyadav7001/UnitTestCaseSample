package com.ryandro.unittestcasesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv_testHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_result = findViewById(R.id.btn_result);
        tv_testHeader = findViewById(R.id.tv_testHeader);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Result : ", "" + sumValue(2, 5));
                tv_testHeader.setText(""+sumValue(2, 5));
            }
        });
    }

    public int sumValue(int no1, int n02) {
        return (no1 + n02);
    }
}
