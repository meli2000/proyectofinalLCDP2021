package com.mlc.proyectofinallcdp2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class menualimentos extends AppCompatActivity {
    private ImageButton btncathamburguesas,btncatcarnes,btncatpastas,btncatsnacks,btncatbebidas,btncatpostres;
    private Context mCont=this;
    public Button btnpedido;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menualimentos);



        btncathamburguesas = (ImageButton) findViewById(R.id.btncategoriahamburguesas);
        btncatcarnes = (ImageButton) findViewById(R.id.btncategoriacarnes);
        btncatpastas = (ImageButton) findViewById(R.id.btncategoriapastas);
        btncatbebidas=(ImageButton) findViewById(R.id.btncategoriabebidas);
        btncatsnacks=(ImageButton) findViewById(R.id.btncategoriasnacks);
        btncatpostres=(ImageButton) findViewById(R.id.btncategoriapostres);



        btncathamburguesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, categoria_hamburguesas.class);
                startActivity(intent);
            }
        });

        btncatcarnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, categoria_carnes.class);
                startActivity(intent);
            }
        });

        btncatpastas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, categoria_pastas.class);
                startActivity(intent);
            }
        });

        btncatbebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, categoria_bebidas.class);
                startActivity(intent);
            }
        });


        btncatpostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, categoria_postres.class);
                startActivity(intent);
            }
        });


        btncatsnacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont, categoria_snacks.class);
                startActivity(intent);
            }
        });
    }
}