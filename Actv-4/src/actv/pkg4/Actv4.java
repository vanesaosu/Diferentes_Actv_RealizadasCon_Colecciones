
package actv.pkg4;

import java.util.Scanner;


public class Actv4 {

   
    public static void main(String[] args) {
        ServicioCine servicio = new ServicioCine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            servicio.cargarPelicula();
            System.out.print("¿Desea cargar otra película? (s/n): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\n--- Acciones después de cargar películas ---");
        System.out.println("Todas las películas:");
        servicio.mostrarPeliculas();

        System.out.println("\nPelículas con duración mayor a 1 hora:");
        servicio.mostrarPeliculasMayor1Hora();

        System.out.println("\nPelículas ordenadas por duración (de mayor a menor):");
        servicio.ordenarPeliculasPorDuracionDesc();

        System.out.println("\nPelículas ordenadas por duración (de menor a mayor):");
        servicio.ordenarPeliculasPorDuracionAsc();

        System.out.println("\nPelículas ordenadas por título:");
        servicio.ordenarPeliculasPorTitulo();

        System.out.println("\nPelículas ordenadas por director:");
        servicio.ordenarPeliculasPorDirector();
    }
    }
    

