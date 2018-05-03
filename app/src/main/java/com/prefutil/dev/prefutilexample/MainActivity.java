package com.prefutil.dev.prefutilexample;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

import com.prefutil.dev.prefutil.PrefUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.texView);
        final EditText editText = findViewById(R.id.etName);

        Button clearButton = findViewById(R.id.btnClear);
        Button refreshButton = findViewById(R.id.btnRefresh);
        Button saveButton = findViewById(R.id.btnSave);

        final PrefUtil prefUtil = PrefUtil.Init(this);
        textView.setText(prefUtil.getString("Name"));

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefUtil.clearALl();
            }
        });

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(prefUtil.getString("Name"));
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefUtil.save("Name",editText.getText().toString());
                textView.setText(prefUtil.getString("Name"));
            }
        });

    }
}
