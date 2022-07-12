package ch.ritter1.apps.langapptest;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AppCompat extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LanguageManager languageManager = new LanguageManager(this);
        languageManager.updateResource(languageManager.getLang());
    }
}
