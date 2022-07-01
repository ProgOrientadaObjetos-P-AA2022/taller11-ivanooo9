package taller11;
import Carta.*;

public class MenuNinos extends Menu{
    private double valorPorcionHelada;
    private double valorPorcionPastel;
    public MenuNinos(){
        
    }
    public MenuNinos(String nombrePl, double valorinicialM, double porlado, double porpastel){
        super(nombrePl, valorinicialM);
        valorPorcionHelada=porlado;
        valorPorcionPastel=porpastel;
    }

    public void establecerValorPorcionHelada(double valorPorcionHelada) {
        this.valorPorcionHelada = valorPorcionHelada;
    }

    public void establecerValorPorcionPastel(double valorPorcionPastel) {
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public double obtenerValorPorcionHelada() {
        return valorPorcionHelada;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    

    public void calcularvalorMenuTotal() {
        valorMenu=valorinicialMenu+valorPorcionHelada+valorPorcionPastel;
    }
    public double obtenervalorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu de Ninos\n%s", super.toString());
        cadena=String.format("%s"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerValorPorcionHelada(),
                obtenerValorPorcionPastel(),
                obtenerValorMenu()
                );
        return cadena;
    }

    @Override
    public void calcularvalorcancelartotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}