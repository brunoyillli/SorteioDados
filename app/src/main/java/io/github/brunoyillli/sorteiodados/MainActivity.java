package io.github.brunoyillli.sorteiodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        int resultado = 0;
        TextView texto = findViewById(R.id.textoResultadoD20);

        resultado = new Random().nextInt(21);

        texto.setText("Resultado: " + resultado);
    }

}