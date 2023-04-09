package com.mlc.proyectofinallcdp2021.modelos;

public class infoalimentosModelo {
    String nombre;
    String descripcion;
    String precio;
    String cantidad;

    int imagen;


    public infoalimentosModelo(String nombre, String descripcion, String precio, String cantidad, int
            imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;

        this.imagen = imagen;

    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }



    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
