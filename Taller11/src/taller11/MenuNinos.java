package taller11;
import Carta.*;

public class MenuNinos extends Menu{
    protected String Plato;
    private double valorPorcionHelada;
    private double valorPorcionPastel;
    private double valorinicialMenu;
    public MenuNinos(){
        
    }
    
      public void establecerNombrePlato(String Plato) {
        this.Plato = Plato;
    }   
    
    public MenuNinos(String nombrePl, double valorinicialM, double porlado, double porpastel){
        super(nombrePl, valorinicialM);
        valorPorcionHelada=porlado;
        valorPorcionPastel=porpastel;
    }
    
     public void establecerValorinicialMenu(double valorinicialMenu) {
        this.valorinicialMenu = valorinicialMenu;
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
    
    public String obtenerPlato() {
        return Plato;
    }
    
    public void calcularvalorMenuTotal() {
        valorMenu=valorinicialMenu+valorPorcionHelada+valorPorcionPastel;
    }
    public double obtenervalorcancelartotal(){
        return valorMenu;
    }
    
     public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu de Ninos\n%s", super.toString());
        cadena=String.format("%s"
                 + "Valor menu inicial:%.2f\n"
                + "Plato Niños:%.2f\n"
                + "Valor Inicial:%.2f\n"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerPlato(),
                obtenerValorinicialMenu(),
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