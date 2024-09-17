import model.autoDeportivo;
import model.autoUrbano;
import model.tipoVehiculo;
import model.utilitario;
import model.motoDeportiva;
import model.motoUrbana;
import model.vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        autoDeportivo a1 = new autoDeportivo("civic", 30000D, tipoVehiculo.autoDeCarreras, 384);
        autoUrbano a2 = new autoUrbano("corsa", 8000D, tipoVehiculo.autoUrbano, 2, 4);
        utilitario u1 = new utilitario(800, 1.80D, "partner", 17000D, tipoVehiculo.utilitario);
        utilitario u2 = new utilitario(3500, 2.10D, "boxer", 27000D, tipoVehiculo.utilitario);
        motoUrbana m1 = new motoUrbana("fz16", 1500D, tipoVehiculo.motoUrbano, 160, 150, 13);
        motoDeportiva m2 = new motoDeportiva("r1", 30000D, 1000, tipoVehiculo.motoDeCarreras, 342);

        ArrayList<vehiculo> array1 = new ArrayList<>(10);
        array1.add(a1);
        array1.add(a2);
        array1.add(u1);
        array1.add(u2);
        array1.add(m1);
        array1.add(m2);

        for (vehiculo v : array1) {
            System.out.printf("////////////////////////////////////////\n");
            System.out.println(v.getNombre() + " " + v.getPrecio());
            if (v.getTipoVehiculo() == tipoVehiculo.autoDeCarreras || v.getTipoVehiculo() == tipoVehiculo.motoDeCarreras) {
                v.cambioPrecio(20);
            } else if (v.getTipoVehiculo() == tipoVehiculo.motoUrbano) {
                v.cambioPrecio(5);
            } else if (v.getTipoVehiculo()==tipoVehiculo.autoUrbano) {
                v.cambioPrecio(15);
            } else if (v.getTipoVehiculo()==tipoVehiculo.utilitario) {
                v.cambioPrecio(10);
            }
            System.out.println(v.getNombre() + " " + v.getPrecio());
        }

      /*  System.out.println(a1);
        System.out.printf("////////////////////////////////////////\n");
        System.out.println(a2);
        System.out.printf("////////////////////////////////////////\n");
        System.out.println(u1);
        System.out.printf("////////////////////////////////////////\n");
        System.out.println(u2);
        System.out.printf("////////////////////////////////////////\n");
        System.out.println(m1);
        System.out.printf("////////////////////////////////////////\n");
        System.out.println(m2);*/


    }
}
