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

public class categoria_postres extends AppCompatActivity {
    RecyclerView postrescatRecycler;
    infoalimentosAdapter infoalimentosAdapter;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo> carritoModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_postres);
        postrescatRecycler=findViewById(R.id.postres_item);
        infoalimentosModeloList =new ArrayList<>();
        infoalimentosModeloList.add(new infoalimentosModelo  ( "Tres leches","Deliciosa porción personal","2.25","0",R.drawable.postretresleches   ));
        infoalimentosModeloList.add(new infoalimentosModelo  (  "Gelatina Mosaico","Deliciosa porción de cuadritos de gelatina con yogurt natural","2.25","0",R.drawable.postregelatinamosaico     ));
        infoalimentosModeloList.add(new infoalimentosModelo  (  "Mousse de chocolate","Deliciosa porcion de musse con fresas","3.00","0",R.drawable.postremussedechocolate  ));
        infoalimentosModeloList.add(new infoalimentosModelo  (  "Cheese Cake de Maracuyá","Deliciosas porción de cheese cake ","3.00","0",R.drawable.postrecheesecake));

        setPostrescatRecycler(infoalimentosModeloList,carritoModelList);
    }

    private void setPostrescatRecycler(List<infoalimentosModelo> snackscatDataList, List<infoalimentosModelo>carritoModelList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        postrescatRecycler.setLayoutManager(layoutManager);
        infoalimentosAdapter = new infoalimentosAdapter(this,snackscatDataList, carritoModelList);
        postrescatRecycler.setAdapter(infoalimentosAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(postrescatRecycler.getContext(),DividerItemDecoration.VERTICAL);
        postrescatRecycler.addItemDecoration(dividerItemDecoration);


    }





}