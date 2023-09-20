package com.example.anotado_v1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Delay de 2s para a Splash Screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // Manda para a página inicial depois do tempo
                startActivity(new Intent(SplashScreen.this, MainActivity.class));

                // Mata a Splash Screen depois do tempo
                finish();

            }
        }, 2000);
    }
}
