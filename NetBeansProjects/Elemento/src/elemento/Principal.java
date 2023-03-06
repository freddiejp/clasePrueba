
package elemento;
import java.util.*;
public class Principal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre,codigo, tipo;
        double precio;
        System.out.println("Ingrese el nombre del producto;");
        nombre=sc.next();
        System.out.println("Ingrese el codigo del producto:");
        codigo=sc.next();
        System.out.println("Ingrese el precio del producto");
        precio=sc.nextDouble();
        System.out.println("Ingrese el tipo de producto:");
        tipo=sc.next();
        Producto pr = new Producto(codigo, nombre, precio,tipo);
        pr.imprimir();
    }
    
}
