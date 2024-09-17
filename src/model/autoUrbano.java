package model;

public class autoUrbano extends vehiculo{
    private Integer airbag;
    private Integer ocupantes;
    public autoUrbano(String nombre, Double precio, model.tipoVehiculo tipoVehiculo, Integer cantAirbag, Integer ocupantes) {
        super(nombre, precio, tipoVehiculo);
        this.airbag=cantAirbag;
        this.ocupantes=ocupantes;
    }

    public Integer getAirbag() {
        return airbag;
    }

    public Integer getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(Integer ocupantes) {
        this.ocupantes = ocupantes;
    }

    public void setAirbag(Integer airbag) {
        this.airbag = airbag;
    }

    @Override
    public String toString(){
        return super.toString()+"\nCantidad de airbags: "+airbag+"\nMaximo de ocupantes: "+ocupantes;
    }
    public void cambioPrecio(Integer i) {
        Double porc= Double.valueOf(i);
        porc =this.getPrecio() + (this.getPrecio()*(porc/100));
        setPrecio(porc);
    }
}
