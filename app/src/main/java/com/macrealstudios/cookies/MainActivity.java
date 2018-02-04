package com.macrealstudios.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button eatBtn = (Button) findViewById(R.id.eatBtn);

        eatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView statusText = findViewById(R.id.status_text_view);
                ImageView imageView = findViewById(R.id.android_cookie_image_view);
                int statusTextNumber = 0;
                if (statusTextNumber < 3) {
                    imageView.setImageResource(R.drawable.after_cookie);
                    statusText.setText("I'm so full");
                    Toast.makeText(MainActivity.this, "So fulll!!", Toast.LENGTH_SHORT).show();
                    statusTextNumber++;
                }
            }
        });
    }
}