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

public class categoria_pastas extends AppCompatActivity {
    RecyclerView pastascatRecycler;
   infoalimentosAdapter infoalimentosAdapter;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo> carritoModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_pastas);
        pastascatRecycler=findViewById(R.id.pastas_item);
        infoalimentosModeloList =new ArrayList<>();
        infoalimentosModeloList.add(new infoalimentosModelo  ("Espaggetti carbonara","Delicioso spaggeti acompañado con salsa carbonara, contiene leche","1","0",R.drawable.spageticarbonara));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Tallarin oriental","Tallarin con verduras en salsa de soya","4.00","0",R.drawable.tallarinoriental));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Canelones de carne picada","Rollitos de pasta acompañada con carne molida, queso mozzarella, vienen 5 unidades","4","0",R.drawable.canelones));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Espaggetti al ajillo","Spaggeti acompañado con salsa en base de ajo","4","0",R.drawable.spagetiajillo));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Macarrones con queso","Fideos macarrones acompañados con salsa de queso cheddar","3","0",R.drawable.macarronesconqueso));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Macarrones con queso y carne picada","Fideos macarrones acompañados con salsa de queso cheddar y carne molida","3.50","0",R.drawable.macarronescarne));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Lasagna personal de carne","Deliciosa lasagna tamaño personal, acompañado de carne, crema, queso mozzarella gratinado","4.99","0",R.drawable.lasanacarne));
        infoalimentosModeloList.add(new infoalimentosModelo  ("Lasagna personal de pollo","Deliciosa lasagna tamaño personal, acompañado de pollo, crema, queso mozzarella gratinado","4.99","0",R.drawable.lasanapollo));
    setPastascatRecycler(infoalimentosModeloList,carritoModelList);

    }
           private void setPastascatRecycler(List<infoalimentosModelo> pastascatDataList, List<infoalimentosModelo>carritoModelList) {

         RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
               pastascatRecycler.setLayoutManager(layoutManager);
               infoalimentosAdapter = new infoalimentosAdapter(this,pastascatDataList, carritoModelList);
               pastascatRecycler.setAdapter(infoalimentosAdapter);

               DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(pastascatRecycler.getContext(),DividerItemDecoration.VERTICAL);
               pastascatRecycler.addItemDecoration(dividerItemDecoration);


    }
}
