package Clases;

import Herencias.SmartPhone;
import Herencias.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Negro", "Pocophone F1", "Mediano", "POCO");
        SmartWatch smartWatch = new SmartWatch("Gris", "Galaxy Watch 4", "Mediano", "SAMSUNG");

        smartPhone.mostrarHora();
        smartWatch.mostrarHora();
        smartWatch.tomarFrecuenciaCardiaca();

        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}
