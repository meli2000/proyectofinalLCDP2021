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

public class categoria_hamburguesas extends AppCompatActivity {
    RecyclerView burgercatRecycler;
    infoalimentosAdapter infoalimentosAdapter;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo> carritoModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_hamburguesas);
        burgercatRecycler=findViewById(R.id.burger_item);

        infoalimentosModeloList =new ArrayList<>();
        carritoModelList=new ArrayList<>();
        infoalimentosModeloList.add(new infoalimentosModelo("Miniburger","Deliciosa minihamburguesa, contiene carne, queso, cebolla, lechuga, tomate frescos","1","0",R.drawable.miniburger));
        infoalimentosModeloList.add(new infoalimentosModelo("Hamburguesa simple de carne","Hamburguesa de carne, contiene huevo, lechuga y cebolla fresca","2.25","0",R.drawable.hamburguesasimplecarne));
        infoalimentosModeloList.add(new infoalimentosModelo("Hamburguesa simple de pollo","Hamburguesa de pollo, contiene huevo, lechuga y cebolla fresca","2.25","0",R.drawable.hamburguesasimpledepollo));
        infoalimentosModeloList.add(new infoalimentosModelo("Hamburguesa completa de carne","Hamburguesa de carne, contiene huevo, queso, salchicha, tocino, jamón, tomate, lechuga y cebolla fresca","3.25","0",R.drawable.hamburguesacompletacarne));
        infoalimentosModeloList.add(new infoalimentosModelo("Hamburguesa completa de pollo","Hamburguesa de pollo, contiene huevo, queso, salchicha, tocino, jamón, tomate, lechuga y cebolla fresca","3.25","0",R.drawable.hamburguesacompletapollo));
        infoalimentosModeloList.add(new infoalimentosModelo("Hamburguesa doble de carne","Hamburguesa con doble carne de res, contiene huevo, queso, doble salchicha, doble tocino, doble jamón, tomate, lechuga y cebolla fresca","4","0",R.drawable.hamburguesadoblecarne));
        infoalimentosModeloList.add(new infoalimentosModelo("Hamburguesa doble de pollo","Hamburguesa con doble carne de pollo, contiene huevo, queso, doble salchicha, doble tocino, doble jamón, tomate, lechuga y cebolla fresca","2","0",R.drawable.hamburguesadobledepollo));
        setBurgercatRecycler(infoalimentosModeloList,carritoModelList);
    }
    private void setBurgercatRecycler(List<infoalimentosModelo> infoalimentosModeloList, List<infoalimentosModelo>carritoModelList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        burgercatRecycler.setLayoutManager(layoutManager);
        infoalimentosAdapter = new infoalimentosAdapter(this,infoalimentosModeloList, carritoModelList);
        burgercatRecycler.setAdapter(infoalimentosAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(burgercatRecycler.getContext(),DividerItemDecoration.VERTICAL);
        burgercatRecycler.addItemDecoration(dividerItemDecoration);
    }
}