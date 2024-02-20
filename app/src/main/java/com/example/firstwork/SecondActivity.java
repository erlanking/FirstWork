package com.example.firstwork;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView laste, namee, fathee, agee;
    Button btne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        laste = findViewById(R.id.laste);
        namee = findViewById(R.id.namee);
        fathee = findViewById(R.id.fathe);
        agee = findViewById(R.id.agee);
        btne = findViewById(R.id.btne);

        Intent intent = getIntent();
        String surname = intent.getStringExtra("f");
        String sname = intent.getStringExtra("n");
        String sfath = intent.getStringExtra("fa");
        String sage = intent.getStringExtra("a");

        laste.setText(surname);
        namee.setText(sname);
        fathee.setText(sfath);
        agee.setText(sage);

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}