package com.mlc.proyectofinallcdp2021;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mlc.proyectofinallcdp2021.adaptadores.infoalimentosAdapter;
import com.mlc.proyectofinallcdp2021.modelos.infoalimentosModelo;

import java.util.ArrayList;
import java.util.List;

public class categoria_bebidas extends AppCompatActivity {
    RecyclerView bebidascatRecycler;
    Button btnvercarrito;
    infoalimentosAdapter infoalimentosAdapter;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo> carritoModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_bebidas);
        bebidascatRecycler=findViewById(R.id.bebidas_item);

        infoalimentosModeloList =new ArrayList<>();
        infoalimentosModeloList.add(new infoalimentosModelo  ("Coca cola personal 500 ml","Bebida personal","0.50","0",R.drawable.cocacola500ml));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Sprite personal 500 ml","Bebida personal","0.50",   "0",R.drawable.colasprite500ml));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Fioravanti personal 500 ml","Bebida personal","0.50","0",R.drawable.colafioravanti500ml));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Fuze Tea personal 500 ml","Bebida personal refrescante","0.50","0",R.drawable.colafuzetea500ml));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Coca cola de 1 litro","Bebida tamaño familiar","1.30","0",R.drawable.cocacola1l));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Sprite 1 litro","Bebida tamaño familiar","1.30","0",R.drawable.colasprite1l));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Fioravanti de 1 litro","Bebida tamaño familiar, eligela en tu sabor favorito","1.30","0",R.drawable.colafioravanti1l));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Fuze Tea 1 litro","Bebida tamaño familiar","1.15","0",R.drawable.colafuzetea1l));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Tropical de naranja","Bebida tamaño familiar","1.25","0",R.drawable.colatropical1l));


        setBebidascatRecycler(infoalimentosModeloList,carritoModelList);
    }

    private void setBebidascatRecycler(List<infoalimentosModelo> bebidascatDataList, List<infoalimentosModelo>carritoModelList) {
       RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
                     bebidascatRecycler.setLayoutManager(layoutManager);
                     infoalimentosAdapter = new infoalimentosAdapter(this,bebidascatDataList, carritoModelList);
                     bebidascatRecycler.setAdapter(infoalimentosAdapter);


                     DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(bebidascatRecycler.getContext(),DividerItemDecoration.VERTICAL);
                     bebidascatRecycler.addItemDecoration(dividerItemDecoration);
    }

}