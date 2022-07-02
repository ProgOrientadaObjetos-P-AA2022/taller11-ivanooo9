package Carta;
import taller11.*;

public class MenuCarta extends Menu{
    protected String Plato;
    private double valorporciondeGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;//en relacion del valor inicial del menu
    
    public MenuCarta(){
        
    }
    
    public void establecerNombrePlato(String Plato) {
        this.Plato = Plato;
    }   
    
    
    public MenuCarta(String nombrePl, double valorinicialM,double valorPG, double valorB){
        super(nombrePl, valorinicialM);
        valorporciondeGuarnicion=valorPG;
        valorBebida=valorB;
        
    }

    public void establecerValorporciondeGuarnicion(double valorporciondeGuarnicion) {
        this.valorporciondeGuarnicion = valorporciondeGuarnicion;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void establecerPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = ((porcentajeAdicional*valorinicialMenu))/100;
    }

     public void establecerValorinicialMenu(double valorinicialMenu) {
        this.valorinicialMenu = valorinicialMenu;
    }
    
    public String obtenerPlato() {
      return Plato;
    }
     
    public double obtenerValorporciondeGuarnicion() {
        return valorporciondeGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    
    public void calcularvalorMenuTotal() {
     valorMenu=(valorinicialMenu+valorporciondeGuarnicion+valorBebida)+porcentajeAdicional;
        
    }
    public double obtenervalorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu a la carta\n%s",super.toString());
        cadena=String.format("%s"
                + "Plato%.2f\n"
                + "Valor Inial:%.2f\n"
                + "Valor guarnicion:%.2f\n"
                + "Valor bebida:%.2f\n"
                + "Porcentaje Adicional:%.2f\n"
                + "Valor del menu:%.2f\n", cadena,
                obtenerPlato(), 
                obtenerValorinicialMenu(),
                obtenerValorporciondeGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }

    @Override
    public void calcularvalorcancelartotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
