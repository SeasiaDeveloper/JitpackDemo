package com.example.mylibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast(this);
    }

    public void showToast(Context context) {
        Toast.makeText(context, "JitpackDemo", Toast.LENGTH_LONG).show();
    }
}
