package com.lee.baseactivity.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lee.baseactivity.R;

public class TwoActivity extends AppCompatActivity {

    private TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvShow = (TextView) findViewById(R.id.tv_show);
        tvShow.setText(getIntent().getStringExtra("param"));
    }

    public static void actionStart(Context context,String data){
        Intent intent = new Intent(context,TwoActivity.class);
        intent.putExtra("param",data);
        context.startActivity(intent);
    }
}
