package com.mlc.proyectofinallcdp2021.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mlc.proyectofinallcdp2021.modelos.infoalimentosModelo;
import com.mlc.proyectofinallcdp2021.R;

import java.util.List;

public class infoalimentosAdapter extends RecyclerView.Adapter<infoalimentosAdapter.infoalimentosViewHolder>   {
    Context context;
    List<infoalimentosModelo> infoalimentosModeloList;
    List<infoalimentosModelo>carritoModelList;

    public infoalimentosAdapter(Context context, List<infoalimentosModelo> infoalimentosModeloList , List<infoalimentosModelo>carritoModelList){
        this.context = context;
        this.infoalimentosModeloList = infoalimentosModeloList;
        this.carritoModelList=carritoModelList;

    }

    @NonNull
    @Override
    public infoalimentosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_alimentos, parent, false);

        return new infoalimentosViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull infoalimentosViewHolder holder, final int position) {
        holder.name.setText(infoalimentosModeloList.get(position).getNombre());
        holder.description.setText(infoalimentosModeloList.get(position).getDescripcion());
        holder.price.setText(infoalimentosModeloList.get(position).getPrecio());
        holder.qty.setText(infoalimentosModeloList.get(position).getCantidad());

        holder.bg.setBackgroundResource(infoalimentosModeloList.get(position).getImagen());





    }

    @Override
    public int getItemCount() {
        return infoalimentosModeloList.size();
    }

    public  static class infoalimentosViewHolder extends RecyclerView.ViewHolder {
        Context context;

        TextView name, description, price, qty, unit;
        ImageView bg;
        Button btnañadir,btnquitar;
        CheckBox cbCarro;
        List<infoalimentosModelo> burgercategoryList;
        List<infoalimentosModelo> cartmodel;


        public infoalimentosViewHolder(@NonNull View itemView ) {
            super(itemView);

            context= itemView.getContext();

            name = itemView.findViewById(R.id.product_name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
            qty = itemView.findViewById(R.id.qty);


            bg = itemView.findViewById(R.id.imagen);


        }




    }








}
