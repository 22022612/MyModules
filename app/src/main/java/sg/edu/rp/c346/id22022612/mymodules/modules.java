package sg.edu.rp.c346.id22022612.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class modules extends AppCompatActivity {
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        tvDisplay = findViewById(R.id.tvDisplay);
        Intent intent =getIntent();
        String info = intent.getStringExtra("module");

        tvDisplay.setText(info);


    }
}