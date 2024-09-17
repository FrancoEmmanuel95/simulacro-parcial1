package model;

import model.tipoVehiculo;

public abstract class vehiculo {
private String nombre;
private Double precio;
private tipoVehiculo tipoVehiculo;
public vehiculo(String nombre,Double precio,tipoVehiculo tipoVehiculo){
    this.nombre = nombre;
    this.precio = precio;
    this.tipoVehiculo = tipoVehiculo;
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public tipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(tipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString(){
    return "Modelo: "+this.nombre+"\nPrecio: $"+this.precio+"\nClase: "+this.tipoVehiculo;
    }

    public abstract void cambioPrecio(Integer i);
}
