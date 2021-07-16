package vn.poly.mxmusic.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

import vn.poly.mxmusic.MainActivity;
import vn.poly.mxmusic.R;

public class LoadingScreen extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        //Ân toolbar
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).hide();
        setContentView(R.layout.activity_loading_screen);
        //start screen
        intent = new Intent(LoadingScreen.this, MainActivity.class);
        new Thread(() -> {
            try {
                Thread.sleep(2222);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(intent);
            finish();
        }).start();
    }
}