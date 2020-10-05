package br.senai.sc.senai;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void onClickBtnMostrar(View v) {
        EditText editTextTexto = findViewById(R.id.et_texto);
        EditText editTextOutroTexto = findViewById(R.id.et_texto2);
        String textoConca = editTextTexto.getText() + " " + editTextOutroTexto.getText();
        Toast.makeText(MainActivity.this, textoConca, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnApaga(View v) {
        EditText editTextApaga = (EditText)findViewById(R.id.et_texto);
        editTextApaga.setText("");
        EditText editTextOutroApaga = (EditText)findViewById(R.id.et_texto2);
        editTextOutroApaga.setText("");

    }
}