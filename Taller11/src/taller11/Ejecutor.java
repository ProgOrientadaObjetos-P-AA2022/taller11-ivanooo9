package taller11;
import java.util.ArrayList;

public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu>listamenu=new ArrayList<>();
        MenuCarta menuCar1= new MenuCarta("Ceviche de pescado", 2, 1, 2);
        menuCar1.establecerPorcentajeAdicional(10);
        menuCar1.calcularvalorcancelartotal();
//        System.out.println(menuCar1);
        MenudelDia menudia1= new MenudelDia("Encebollado", 3, 1, 1);
        menudia1.calcularvalorcancelartotal();
//        System.out.println(menudia1);
        MenuNinos menuninos1= new MenuNinos("Tilapia junior", 2, 1, 1);
        menuninos1.calcularvalorcancelartotal();
//        System.out.println(menuninos1);
        MenuNinos menuninos2= new MenuNinos("Papas con pollo", 3, 1, 1);
        menuninos2.calcularvalorcancelartotal();
//        System.out.println(menuninos2);
        MenuEconomico menuEco1= new MenuEconomico("Parillada ", 4);
        menuEco1.establecerPorcentajeDescuento(10);
        menuEco1.calcularvalorcancelartotal();
//        System.out.println(menuEco1);
        
        listamenu.add(menuCar1);
        listamenu.add(menudia1);
        listamenu.add(menuninos1);
        listamenu.add(menuninos2);
        listamenu.add(menuEco1);
        CuentaMenu cuenta1= new CuentaMenu();
        cuenta1.establecerListamenu(listamenu);
        cuenta1.establecerId(012);
        cuenta1.establecerNombre("Eduardo Iván ");
        cuenta1.calcularvalortotalcancelar();
        System.out.println(cuenta1);
        
        
        
        
    }
    
}