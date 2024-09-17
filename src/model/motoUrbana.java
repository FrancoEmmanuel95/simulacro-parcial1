package model;

public class motoUrbana extends vehiculo{
    private Integer autonomia;
    private Integer cilindrada;

    private Integer capTanque;
    public motoUrbana(String nombre, Double precio, model.tipoVehiculo tipoVehiculo, Integer cilindrada,Integer autonomia,Integer capTanque) {
        super(nombre, precio, tipoVehiculo);
        this.cilindrada=cilindrada;
        this.autonomia=autonomia;
        this.capTanque=capTanque;
    }
    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }
    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getCapTanque() {
        return capTanque;
    }

    public void setCapTanque(Integer capTanque) {
        this.capTanque = capTanque;
    }
    @Override
    public String toString(){
        return super.toString()+"\nautonomia: "+this.getAutonomia()+"Kms";
    }
    @Override
    public void cambioPrecio(Integer i) {
        Double porc= Double.valueOf(i);
        porc =this.getPrecio() + (this.getPrecio()*(porc/100));
        setPrecio(porc);
    }
}
