package br.com.pedrocostanunes.atvdispositivosmoveis160424;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1500); // aqui está a mimir por 1 segundo e eio, em outras palavras, o sistema para pelo tempo em milisegundos gerando a animação
                    startActivity(new Intent(MainActivity.this, ActivityLogin.class));
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }; thread1.start();
    }
}