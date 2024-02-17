package com.carlosmaresdev.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private String alfabeto[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gp = (Button) findViewById(R.id.gp);
        gp.setOnClickListener(this);
    }

    public void onClick(View v){
        TextView password = (TextView) findViewById(R.id.textView);
        Random posicion = new Random();
        String letra = "";
        int i;
        for(i = 0; i <= 7; i++){
            int numeroPosicion = posicion.nextInt(61 - 1 + 1 ) + 1 ;
            letra += alfabeto[numeroPosicion];
        }
        password.setText(letra);
    }

}