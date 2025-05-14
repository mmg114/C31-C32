import Clase3.Persona;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Tipos de datos");

        int entero=3;
        long enteroMasLargo=9999999;
        double puntoFlotante=9999999.0;
        float  puntoFlotantePeque=9.4f;
        char letra='A';
        boolean esBoleano=true;

        var numero=3;
        numero='A';
        System.out.println(numero);

        String texto="Hola Tipos de datos";
        System.out.println(texto);

        Date a = new Date();
        System.out.println(a);

        BigDecimal bd = new BigDecimal(2);
        System.out.println(bd);

           int suma = 2+5;

           boolean esMayor= 9>7;

        System.out.println(esMayor);


    }
}
