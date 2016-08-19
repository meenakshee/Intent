package com.example.minaxipc.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button mbtn3,mbtn4;
    EditText medt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mbtn3=(Button)findViewById(R.id.btn3);
        mbtn4=(Button)findViewById(R.id.btn4);
        medt1=(EditText)findViewById(R.id.edt1);
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, "Hello This is second activity", Toast.LENGTH_LONG).show();
            }


        });
        Intent i = new Intent(this,  Main2Activity.class);
        startActivityForResult(i, 1);
        Intent intent = new Intent();
        intent.putExtra("medt1","meenakshee");
        setResult(RESULT_OK, intent);
        finish();

    }
}