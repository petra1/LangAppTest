package ch.ritter1.apps.langapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompat {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton en = findViewById(R.id.gb_btn);
        ImageButton de = findViewById(R.id.de_btn);
        ImageButton nl = findViewById(R.id.nl_btn);
        LanguageManager lang = new LanguageManager(this);



        en.setOnClickListener(view ->
        {
            lang.updateResource("en");
            recreate();
        });
        de.setOnClickListener(view ->
        {
            lang.updateResource("de");
            recreate();
        });
        nl.setOnClickListener(view ->
        {
            lang.updateResource("nl");
            recreate();
        });
        findViewById(R.id.go_btn).setOnClickListener(view ->{

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }


                );
    }
}