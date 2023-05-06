package Herencias;

import Clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    protected int frecuenciaCardiaca;
    public SmartWatch() {
    }

    public SmartWatch(String color, String modelo, String tamaño, String marca){
        super(color, modelo, tamaño, marca);
    }

    @Override
    public void mostrarHora() {
        Hora = "12:00";
    }

    public void tomarFrecuenciaCardiaca() {

        frecuenciaCardiaca = 80;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", marca='" + marca + '\'' +
                ", Hora='" + Hora + '\'' +
                '}';
    }
}
