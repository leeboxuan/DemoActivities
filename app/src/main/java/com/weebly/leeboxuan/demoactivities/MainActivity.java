package com.weebly.leeboxuan.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText) findViewById(R.id.editTextName);
                EditText etAge = (EditText) findViewById(R.id.editTextAge);

                String[] info = {etName.getText().toString(), etAge.getText().toString()};
                Intent i = new Intent(MainActivity.this, DemoActivities2.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });

    }

}
