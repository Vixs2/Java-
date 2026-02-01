import java.util.Scanner;

public class eje2Condicional {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int totalCompra = 0;
        int productosMayor100 = 0;
        int totalProductos = 0;
        double precio;

        do {
            System.out.println("Ingrese los precios de su compra:");
            System.out.println("->");
            precio = sc.nextDouble();

            if(precio > 0 && precio < 100 ){
                totalCompra += precio;
                totalProductos++;
                
            }else if(precio > 100){
                totalCompra += precio;
                productosMayor100++;
                totalProductos++;
            }

        } while (precio > 0);

        System.out.println("El total de la compra fue de: " + totalCompra);
        System.out.println("La cantidad de productos mayores a 100$ es de: " + productosMayor100);
        System.out.println("El total de productos fue de: " + totalProductos);
        sc.close();
    }
}