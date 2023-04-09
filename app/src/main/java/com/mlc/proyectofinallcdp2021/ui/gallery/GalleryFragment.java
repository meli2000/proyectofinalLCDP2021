package com.mlc.proyectofinallcdp2021.ui.gallery;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.mlc.proyectofinallcdp2021.R;
import com.mlc.proyectofinallcdp2021.databinding.FragmentGalleryBinding;


import org.json.JSONObject;

public class GalleryFragment extends Fragment implements Response.Listener<JSONObject>, Response.ErrorListener {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;
    EditText tnombres,tcelular,tdireccion,tpedido;
    Button btnenviarpedido;
    ProgressDialog progreso;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        tnombres=(EditText)root.findViewById(R.id.txtnombres);
        tcelular=(EditText)root.findViewById(R.id.txtcelular);
        tdireccion=(EditText)root.findViewById(R.id.txtdireccion);
        tpedido=(EditText)root.findViewById(R.id.txtpedido);

        btnenviarpedido=(Button) root.findViewById(R.id.btnenviar);
        request= Volley.newRequestQueue(getContext());

        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        btnenviarpedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarweb();
            }
        });
        return root;
    }
    public void cargarweb(){


        progreso= new ProgressDialog(getContext());
        progreso.setMessage("Cargando");
        progreso.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progreso.show();
        String url= "https://lacocinadepolar.000webhostapp.com/scriptpedidoclientes.php?nombres="+tnombres.getText().toString()
                +"&celular="+tcelular.getText().toString()
                +"&direccion="+tdireccion.getText().toString()
                +"&pedido="+tpedido.getText().toString();
        url= url.replace(" ","%20");
        jsonObjectRequest= new JsonObjectRequest(Request.Method.GET,url,null,this,this);
        request.add(jsonObjectRequest);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        progreso.hide();
        Toast.makeText(getContext(),"Ha ocurrido un error, contáctate al administrador", Toast.LENGTH_SHORT).show();
        Log.i("Error", error.toString());
    }

    @Override
    public void onResponse(JSONObject response) {
        Toast.makeText(getContext(),"Registro guardado", Toast.LENGTH_SHORT).show();
        progreso.hide();
        tnombres.setText("");
        tcelular.setText("");
        tdireccion.setText("");
        tpedido.setText("");

    }
}