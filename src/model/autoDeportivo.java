package model;

import com.sun.jdi.DoubleValue;

public class autoDeportivo extends vehiculo{
private Integer vMax;

    public autoDeportivo(String nombre, Double precio, model.tipoVehiculo tipoVehiculo,Integer vMax) {
        super(nombre, precio, tipoVehiculo);
        this.vMax = vMax;
    }

    public Integer getvMax() {
        return vMax;
    }

    public void setvMax(Integer vMax) {
        this.vMax = vMax;
    }

    public String competirEnPista(){
        return "el automovil es apto para competir en pista.";
    }

    public void cambioPrecio(Integer i) {
        Double porc= Double.valueOf(i);
        porc =this.getPrecio() + (this.getPrecio()*(porc/100));
        setPrecio(porc);
    }

    @Override
    public String toString(){
        return super.toString()+"\nVelocidad maxima: "+this.getvMax()+" KPH";
    }
}