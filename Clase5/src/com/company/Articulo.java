package com.company;

public class Articulo {
    private String descripcion;
    private double precioVenta;
    private int stock;

        public Articulo(String descripcion, int cantidad, double precio){
            this.descripcion=descripcion;
            precioVenta=precio;
            stock=cantidad;
        }

        public boolean hayStock(){
            return stock>0;
        }

        public double consultarPrecio(){
            return precioVenta;
        }

    public String getDescripcion(){
            return descripcion;
    }
    public double getPrecioVenta(){
        return precioVenta;
    }
    public int getStock(){
        return stock;
    }
    public void setDescripcion(String description){
            this.descripcion=description;
    }
    public void setPrecioVenta(double precio){
            precioVenta=precio;
    }
    public void setStock(int stock){
            this.stock=stock;
    }
}
