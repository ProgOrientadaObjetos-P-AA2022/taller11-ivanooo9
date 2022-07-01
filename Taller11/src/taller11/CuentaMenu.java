package taller11;

import java.util.ArrayList;

public class CuentaMenu {

    private String nombre;
    private ArrayList<Menu> listamenu = new ArrayList<>();
    private double valorCan;
    private double subtotal;
    private double iva = 0.12;
    private int id;

    public CuentaMenu() {

    }

    public int obtenerId() {
        return id;
    }

    public void establecerId(int id) {
        this.id = id;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerListamenu(ArrayList<Menu> listamenu) {
        this.listamenu = listamenu;
    }

    public void establecerSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void establecerIva(double iva) {
        this.iva = iva;
    }

    public void calcularvalortotalcancelar() {
        for (int i = 0; i < listamenu.size(); i++) {
            subtotal = subtotal + listamenu.get(i).obtenerValorMenu();

        }
        iva = subtotal * iva;
        valorCan = subtotal + iva;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Menu> obtenerListamenu() {
        return listamenu;
    }

    public double obtenerValorCan() {
        return valorCan;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Cuenta\n"
                + "Nombre cliente:%s\n", obtenerNombre());
        for (int i = 0; i < obtenerListamenu().size(); i++) {
            cadena = String.format("%s"
                    + "%d "
                    + "%s\n", cadena,(i+1),
                    obtenerListamenu().get(i));

        }
        cadena=String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n", cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCan());
        return cadena;
    }

}