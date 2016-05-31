package com.lee.baseactivity.view;

import android.os.Bundle;
import android.view.View;

import com.lee.baseactivity.R;
import com.lee.baseactivity.utils.ActivityCollector;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });

        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwoActivity.actionStart(MainActivity.this,"hello");
            }
        });
    }
}
