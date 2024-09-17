package model;

public class utilitario extends vehiculo {
private Integer cargaMax;
private Double altura;
    public utilitario(Integer cargaMax,Double altura,String nombre, Double precio, tipoVehiculo tipoVehiculo) {
        super(nombre, precio, tipoVehiculo);
        this.altura = altura;
        this.cargaMax = cargaMax;
    }

    public Integer getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(Integer cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public String toString(){
        return super.toString()+
                "\nCarga maxima: "+cargaMax+" KG.\n"+
                "Altura: "+altura+" CM.";
    }
    @Override
    public void cambioPrecio(Integer i) {
        Double porc= Double.valueOf(i);
        porc =this.getPrecio() + (this.getPrecio()*(porc/100));
        setPrecio(porc);
    }
}
