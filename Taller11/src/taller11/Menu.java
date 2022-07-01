package taller11;

public abstract class Menu {

    protected String Plato;
    protected double valorMenu;
    protected double valorinicialMenu;

    public Menu() {

    }

    public Menu(String nombrePl, double valorinicialM) {
        Plato = nombrePl;

        valorinicialMenu = valorinicialM;
    }

    public void establecerNombrePlato(String Plato) {
        this.Plato = Plato;
    }

    public void establecerValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public void establecerValorinicialMenu(double valorinicialMenu) {
        this.valorinicialMenu = valorinicialMenu;
    }

    public String obtenerPlato() {
        return Plato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }

    public abstract void calcularvalorcancelartotal();

    @Override
    public String toString() {
        String cadena = String.format("Nombre Plato:%s\n"
                + "Valor menu inicial:%.2f\n", obtenerPlato(),
                obtenerValorinicialMenu());
        return cadena;
    }

}