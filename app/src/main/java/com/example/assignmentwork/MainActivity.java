package com.example.assignmentwork;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.assignmentwork.R;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvMain = findViewById(R.id.tvMain);
    }

    public void onClick(View view) {
        if (tvMain == null) {
            tvMain = findViewById(R.id.tvMain);
        }
        tvMain.setText(R.string.hello);
    }

    public void onChangeColor(View view) {
        if (tvMain == null) {
            tvMain = findViewById(R.id.tvMain);
        }
        tvMain.setTextColor(Color.RED);
    }
}