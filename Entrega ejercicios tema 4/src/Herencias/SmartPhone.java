package Herencias;

import Clases.SmartDevice;

public class SmartPhone extends SmartDevice {


    public SmartPhone() {
    }

    public SmartPhone(String color, String modelo, String tamaño, String marca) {
        super(color, modelo, tamaño, marca);
    }

    @Override
    public void mostrarHora() {
        Hora = "12:00";
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", marca='" + marca + '\'' +
                ", Hora='" + Hora + '\'' +
                '}';
    }
}
