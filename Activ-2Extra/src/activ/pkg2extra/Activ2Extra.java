
package activ.pkg2extra;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Activ2Extra {

    public static void main(String[] args) {
        List<CantanteFamoso> listaCantantes = new ArrayList<>();

        listaCantantes.add(new CantanteFamoso("Cantante1", "Disco1"));
        listaCantantes.add(new CantanteFamoso("Cantante2", "Disco2"));
        listaCantantes.add(new CantanteFamoso("Cantante3", "Disco3"));
        listaCantantes.add(new CantanteFamoso("Cantante4", "Disco4"));
        listaCantantes.add(new CantanteFamoso("Cantante5", "Disco5"));

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del cantante: ");
                        scanner.nextLine();
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el disco con más ventas: ");
                        String disco = scanner.nextLine();
                        listaCantantes.add(new CantanteFamoso(nombre, disco));
                        System.out.println("Cantante agregado.");
                        break;
                    case 2:
                        System.out.println("Cantantes:");
                        listaCantantes.forEach((cantante) -> {
                            System.out.println("Nombre: " + cantante.getNombre() +
                                    ", Disco con más ventas: " + cantante.getDiscoConMasVentas());
                });
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre del cantante a eliminar: ");
                        scanner.nextLine();
                        String nombreEliminar = scanner.nextLine();
                        Iterator<CantanteFamoso> iterator = listaCantantes.iterator();
                        while (iterator.hasNext()) {
                            CantanteFamoso cantante = iterator.next();
                            if (cantante.getNombre().equals(nombreEliminar)) {
                                iterator.remove();
                                System.out.println("Cantante eliminado.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = 0;
            }
        } while (opcion != 4);
    }
    }
    

