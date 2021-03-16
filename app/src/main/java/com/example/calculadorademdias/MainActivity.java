package com.example.calculadorademdias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nota_um, nota_dois, nota_tres;
    Button button;
    TextView notaFinal;
    String notaUm, notaDois, notaTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();

        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
        );

        nota_um = findViewById(R.id.nota_um);
        nota_dois = findViewById(R.id.nota_dois);
        nota_tres = findViewById(R.id.nota_tres);
        notaFinal = findViewById(R.id.NotaFinal);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notaUm = nota_um.getText().toString();
                notaDois = nota_dois.getText().toString();
                notaTres = nota_tres.getText().toString();

                if (notaUm.equals("")){
                    notaUm = "0.0";
                    Toast.makeText(MainActivity.this, notaUm, Toast.LENGTH_SHORT).show();
                }
                if (notaDois.equals("")){
                    notaDois = "0.0";

                }
                if (notaTres.equals("")){
                    notaTres = "0.0";
                }
                Double Um = Double.parseDouble(notaUm);
                Double Dois = Double.parseDouble(notaDois);
                Double Tres = Double.parseDouble(notaTres);

                Double notinhaUm = ((Um + Dois)/2)* 0.4;
                Double notinhaDois = Tres * 0.6;

                Double resultado = notinhaUm + notinhaDois;
                notaFinal.setText(resultado.toString());

            }
        });

    }
}