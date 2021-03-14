package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.saveBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("question", ((EditText) findViewById(R.id.newQuestion)).getText().toString());
                data.putExtra("answer", ((EditText) findViewById(R.id.newAnswer)).getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });




    }

}