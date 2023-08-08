
package actv4.extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Actv4Extra {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        Map<String, String> codigosPostales = new HashMap<>();

        // Agregar códigos postales iniciales
        codigosPostales.put("28001", "Madrid");
        codigosPostales.put("08001", "Barcelona");
        codigosPostales.put("41001", "Sevilla");
        codigosPostales.put("46001", "Valencia");
        codigosPostales.put("50001", "Zaragoza");
        codigosPostales.put("29001", "Málaga");
        codigosPostales.put("03001", "Alicante");
        codigosPostales.put("15001", "A Coruña");
        codigosPostales.put("20001", "Donostia-San Sebastián");
        codigosPostales.put("23001", "Jaén");

        // Pedir al usuario ingresar 10 códigos postales y ciudades
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el código postal " + i + ": ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Ingrese la ciudad " + i + ": ");
            String ciudad = scanner.nextLine();
            codigosPostales.put(codigoPostal, ciudad);
        }

        // Mostrar datos introducidos
        System.out.println("Datos introducidos:");
        codigosPostales.entrySet().forEach((entry) -> {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        });

        // Buscar ciudad por código postal
        System.out.print("Ingrese un código postal para buscar la ciudad: ");
        String codigoBuscado = scanner.nextLine();
        String ciudadEncontrada = codigosPostales.get(codigoBuscado);
        if (ciudadEncontrada != null) {
            System.out.println("Ciudad encontrada: " + ciudadEncontrada);
        } else {
            System.out.println("Código postal no encontrado.");
        }

        // Agregar una ciudad con su código postal correspondiente
        System.out.print("Ingrese un nuevo código postal: ");
        String nuevoCodigo = scanner.nextLine();
        System.out.print("Ingrese la ciudad correspondiente: ");
        String nuevaCiudad = scanner.nextLine();
        codigosPostales.put(nuevoCodigo, nuevaCiudad);
        System.out.println("Nueva ciudad agregada.");

        // Eliminar 3 ciudades
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese el código postal de la ciudad a eliminar " + i + ": ");
            String codigoEliminar = scanner.nextLine();
            if (codigosPostales.remove(codigoEliminar) != null) {
                System.out.println("Ciudad eliminada correctamente.");
            } else {
                System.out.println("Código postal no encontrado.");
            }
        }

        // Mostrar datos finales
        System.out.println("Datos finales:");
        codigosPostales.entrySet().forEach((entry) -> {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        });
    }
    }
    

