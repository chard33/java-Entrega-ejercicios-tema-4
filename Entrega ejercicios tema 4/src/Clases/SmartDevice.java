package Clases;

public abstract class SmartDevice {

    protected String color;
    protected String modelo;
    protected String tamaño;
    protected String marca;
    protected String Hora = "00:00";

    public SmartDevice(){};
    public SmartDevice(String color, String modelo, String tamaño, String marca){
        this.color = color;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public abstract void mostrarHora();

    @Override
    public abstract String toString();
}
