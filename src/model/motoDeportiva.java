package model;

public class motoDeportiva extends vehiculo{
    private Integer vMax;
    private Integer cilindrada;

    public motoDeportiva(String nombre, Double precio,Integer cilindrada,model.tipoVehiculo tipoVehiculo,Integer vMax) {
        super(nombre, precio, tipoVehiculo);
        this.cilindrada = cilindrada;
        this.vMax = vMax;
    }

    public Integer getvMax() {
        return vMax;
    }

    public void setvMax(Integer vMax) {
        this.vMax = vMax;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String competirEnPista(){
        return "la motocicleta es apta para competir en pista.";
    }



    @Override
    public String toString(){
        return super.toString()+"\nVelocidad maxima: "+this.getvMax()+" KPH";
    }
    @Override
    public void cambioPrecio(Integer i) {
        Double porc= Double.valueOf(i);
        porc =this.getPrecio() + (this.getPrecio()*(porc/100));
        setPrecio(porc);
    }
}
