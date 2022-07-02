package taller11;
import Carta.*;
public class MenuEconomico extends Menu {

    private double Descuento;
    protected String Plato;
    protected double valorinicialMenu;
    
     public void establecerNombrePlato(String Plato) {
        this.Plato = Plato;
    }   
    
    public MenuEconomico() {

    }

    public void establecerValorinicialMenu(double valorinicialMenu) {
        this.valorinicialMenu = valorinicialMenu;
    }

    
    public MenuEconomico(String nombrePl, double valorinicialM) {
        super(nombrePl, valorinicialM);
        

    }

     public String obtenerPlato() {
        return Plato;
    }
     
     public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }
    
    public double obtenerDescuento() {
        return Descuento;
    }

    public void establecerPorcentajeDescuento(double porcentajeDesc) {
        Descuento = ((porcentajeDesc * valorinicialMenu)) / 100;
    }

    public void calcularvalorMenuTotal() {
        valorMenu = valorinicialMenu - Descuento;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s", super.toString());
        cadena = String.format("%s"
                + "Plato%.2f\n"
                + "Valor Inial:%.2f\n"
                + "Porcentaje descuento%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerPlato(),
                obtenerValorinicialMenu(),
                obtenerDescuento(),
                obtenerValorMenu());
        return cadena;
    }

    @Override
    public void calcularvalorcancelartotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

