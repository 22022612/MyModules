package sg.edu.rp.c346.id22022612.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView c346;
TextView c349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c346 = findViewById(R.id.c346);
        c349 = findViewById(R.id.c349);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("module","Module Code: C346\n Module Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
                startActivity(intent);
            }
        });
        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("module","Module Code: C349\n Module Name: Software Development\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W65D");
                startActivity(intent);
            }
        });
    }
}