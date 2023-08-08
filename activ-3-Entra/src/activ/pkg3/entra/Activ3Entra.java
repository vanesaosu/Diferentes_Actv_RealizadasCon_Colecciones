
package activ.pkg3.entra;

import java.util.HashSet;
import java.util.Scanner;


public class Activ3Entra {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        HashSet<Libro> libros = new HashSet<>();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarLibro(libros, scanner);
                    break;
                case 2:
                    mostrarLibros(libros);
                    break;
                case 3:
                    prestarLibro(libros, scanner);
                    break;
                case 4:
                    devolverLibro(libros, scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static void agregarLibro(HashSet<Libro> libros, Scanner scanner) {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de ejemplares: ");
        int numEjemplares = scanner.nextInt();

        libros.add(new Libro(titulo, autor, numEjemplares));
        System.out.println("Libro agregado correctamente.");
    }

    public static void mostrarLibros(HashSet<Libro> libros) {
        System.out.println("Libros en la librería:");
        libros.forEach((libro) -> {
            System.out.println(libro);
        });
    }

    public static void prestarLibro(HashSet<Libro> libros, Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Ingrese el título del libro a prestar: ");
        String titulo = scanner.nextLine();

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void devolverLibro(HashSet<Libro> libros, Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Ingrese el título del libro a devolver: ");
        String titulo = scanner.nextLine();

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }
}







    
    

