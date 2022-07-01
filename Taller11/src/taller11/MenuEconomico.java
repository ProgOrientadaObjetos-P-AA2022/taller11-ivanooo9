package taller11;

public class MenuEconomico extends Menu {

    private double Descuento;

    public MenuEconomico() {

    }

    public MenuEconomico(String nombrePl, double valorinicialM) {
        super(nombrePl, valorinicialM);
        

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
                + "Porcentaje descuento%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerDescuento(),
                obtenerValorMenu());
        return cadena;
    }

    @Override
    public void calcularvalorcancelartotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}