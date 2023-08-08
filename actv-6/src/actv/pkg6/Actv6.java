
package actv.pkg6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Actv6 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<String, Double> productos = new HashMap<>();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(productos, scanner);
                    break;
                case 2:
                    modificarPrecio(productos, scanner);
                    break;
                case 3:
                    eliminarProducto(productos, scanner);
                    break;
                case 4:
                    mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static void agregarProducto(Map<String, Double> productos, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        productos.put(nombre, precio);
        System.out.println("Producto agregado correctamente.");
    }

    public static void modificarPrecio(Map<String, Double> productos, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.next();
        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void eliminarProducto(Map<String, Double> productos, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public static void mostrarProductos(Map<String, Double> productos) {
        System.out.println("Productos disponibles:");

        productos.entrySet().forEach((entry) -> {
            System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue());
        });
    }
    }
    

