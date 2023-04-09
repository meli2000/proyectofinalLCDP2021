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

public class categoria_carnes extends AppCompatActivity {
    RecyclerView carnescatRecycler;
    infoalimentosAdapter infoalimentosAdapter;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo> carritoModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_carnes);


        carnescatRecycler=findViewById(R.id.carnes_item);
        infoalimentosModeloList =new ArrayList<>();
        infoalimentosModeloList.add(new infoalimentosModelo("Milanesa de carne","deliciosa milanesa de carne acompañado de papas fritas, arroz, ensalada","3.50","0",R.drawable.milanesadepollo));
        infoalimentosModeloList.add(new infoalimentosModelo("Carne salteada","Carne salteada con verduras estilo oriental, incluye papas fritas, arroz y ensalada","3.50","0",R.drawable.carnesalteada));
        infoalimentosModeloList.add(new infoalimentosModelo("Estofado de cerdo","Estofado de cerdo en salsa agridulce acompañado de papas al vapor,arroz y ensalada","3.50","0",R.drawable.estofadodecerdo));
        infoalimentosModeloList.add(new infoalimentosModelo("Pollo al jugo","Delicioso pollo al jugo, receta clasica acompañado de papas al vapor,arroz y ensalada","3.50","0",R.drawable.polloaljugo));
        infoalimentosModeloList.add(new infoalimentosModelo("Carne al jugo","Deliciosa carne al jugo, receta clasica acompañado de papas al vapor,arroz y ensalada","3.50","0",R.drawable.carnealjugo));
        infoalimentosModeloList.add(new infoalimentosModelo("Pollo frito","Delicioso pollo frito acompañado de papas fritas y ensalada","3.50","0",R.drawable.pollofrito));
        infoalimentosModeloList.add(new infoalimentosModelo("Pollo asado","Pollo asado acompañado de papas al vapor, arroz y ensalada","3.50","0",R.drawable.polloasado));
        infoalimentosModeloList.add(new infoalimentosModelo("Carne frita","deli","4","0",R.drawable.carnefrita));

        setCarnescatRecycler(infoalimentosModeloList,carritoModelList);    }



    private void setCarnescatRecycler(List<infoalimentosModelo> burgercatDataList, List<infoalimentosModelo>carritoModelList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        carnescatRecycler.setLayoutManager(layoutManager);
        infoalimentosAdapter = new infoalimentosAdapter(this,burgercatDataList, carritoModelList);
        carnescatRecycler.setAdapter(infoalimentosAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(carnescatRecycler.getContext(),DividerItemDecoration.VERTICAL);
        carnescatRecycler.addItemDecoration(dividerItemDecoration);
    }

}