package com.example.diagnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declaramos las variables que ocuparemos
    private static final Random azar = new Random();
    //con el vector integraremos las imagenes
    private static final Integer[] imgId =
            {R.drawable.img2, R.drawable.img1, R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,
                    R.drawable.img8,R.drawable.img9,R.drawable.img10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// iniciamos las variables
        Integer q = imgId[azar.nextInt(imgId.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);
// Se asigna la funcion al boton
        View nextButton = findViewById(R.id.btnNextImg);
        nextButton.setOnClickListener(new View.OnClickListener() {

//cuando se de click al boton se activara lo Random
            public void onClick(View V) {
                int resource = imgId[azar.nextInt(imgId.length)];
                iv.setImageResource(resource);
            }
        });
    }
}