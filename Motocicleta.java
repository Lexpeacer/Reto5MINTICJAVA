package reto5;

public class Motocicleta {

    private int precio;
    private int autonomiaBateria;
    private String fabricanteNombre;
    private int proveedorIdentificacion;

    public Motocicleta(String fabricanteNombre, int precio, int autonomiaBateria, int proveedorIdentificacion) {
        this.precio = precio;
        this.autonomiaBateria = autonomiaBateria;
        this.fabricanteNombre = fabricanteNombre;
        this.proveedorIdentificacion = proveedorIdentificacion;
    }

    public Motocicleta(String fabricanteNombre) {
        this.fabricanteNombre = fabricanteNombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public String getFabricanteNombre() {
        return fabricanteNombre;
    }

    public void setFabricanteNombre(String fabricanteNombre) {
        this.fabricanteNombre = fabricanteNombre;
    }

    public int getProveedorIdentificacion() {
        return proveedorIdentificacion;
    }

    public void setProveedorIdentificacion(int proveedorIdentificacion) {
        this.proveedorIdentificacion = proveedorIdentificacion;
    }

    @Override
    public String toString() {
        return fabricanteNombre;
    }

}