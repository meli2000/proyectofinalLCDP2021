package com.mlc.proyectofinallcdp2021;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mlc.proyectofinallcdp2021.adaptadores.infoalimentosAdapter;
import com.mlc.proyectofinallcdp2021.modelos.infoalimentosModelo;

import java.util.ArrayList;
import java.util.List;

public class categoria_snacks extends AppCompatActivity {
    RecyclerView snackscatRecycler;
    infoalimentosAdapter infoalimentosAdapter;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo> carritoModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_snacks);
        snackscatRecycler=findViewById(R.id.snacks_item);
        infoalimentosModeloList =new ArrayList<>();

        infoalimentosModeloList.add(new infoalimentosModelo  ( "Nachos personales con queso","Deliciosas tortillas de maiz acompañadas de queso cheddar y guacamole","3.50","0",R.drawable.nachosconqueso    ));
        infoalimentosModeloList.add(new infoalimentosModelo  (  "Nachos personales con carne y queso","Deliciosas tortillas de maiz acompañadas de queso cheddar y guacamole","3.50","0",R.drawable.nachosconqueso     ));
        infoalimentosModeloList.add(new infoalimentosModelo  (  "Nachos para compartir con queso","Deliciosas tortillas de maiz acompañadas de queso cheddar y guacamole","6.50","0",R.drawable.nachosconcarne    ));
        infoalimentosModeloList.add(new infoalimentosModelo  (  "Nachos para compartir con carne molida y queso","Deliciosas tortillas de maiz acompañadas de queso cheddar y guacamole","6.50","0",R.drawable.nachosconcarne));

        setSnackscatRecycler(infoalimentosModeloList,carritoModelList);

    }

    private void setSnackscatRecycler(List<infoalimentosModelo> snackscatDataList, List<infoalimentosModelo>carritoModelList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        snackscatRecycler.setLayoutManager(layoutManager);
        infoalimentosAdapter = new infoalimentosAdapter(this,snackscatDataList, carritoModelList);
        snackscatRecycler.setAdapter(infoalimentosAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(snackscatRecycler.getContext(),DividerItemDecoration.VERTICAL);
        snackscatRecycler.addItemDecoration(dividerItemDecoration);


    }




}