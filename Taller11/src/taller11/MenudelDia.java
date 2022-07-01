package taller11;
import Carta.*;

public class MenudelDia extends Menu{
    private double valorPostre;
    private double valorBebida;

    public MenudelDia(){
        
    }
    public MenudelDia(String nombrePl, double valorinicialM,double valpostre, double valbebida){
        super(nombrePl, valorinicialM);
        valorPostre=valpostre;
        valorBebida=valbebida;
    }

    public void establecerValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    public void calcularvalorMenuTotal() {
        valorMenu=valorinicialMenu+valorPostre+valorBebida;
    }
    public double obtenerValorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu del dia\n%s",super.toString());
        cadena=String.format("%s"
                + "Valor Postre:%.2f\n"
                + "Valor Bebida:%.2f\n"
                + "Valor Menu:%.2f\n",cadena,
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenerValorMenu());
        return cadena;
    }

    @Override
    public void calcularvalorcancelartotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}