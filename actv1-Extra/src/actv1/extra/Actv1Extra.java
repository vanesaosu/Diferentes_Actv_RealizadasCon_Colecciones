
package actv1.extra;

import java.util.ArrayList;
import java.util.Scanner;


public class Actv1Extra {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese valores numéricos enteros (terminar con -99):");

        int valor;
        do {
            valor = scanner.nextInt();
            if (valor != -99) {
                numeros.add(valor);
            }
        } while (valor != -99);

        int totalValores = numeros.size();
        int suma = 0;
        suma = numeros.stream().map((num) -> num).reduce(suma, Integer::sum);
        double media = (double) suma / totalValores;

        System.out.println("Número de valores leídos: " + totalValores);
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media de los valores: " + media);
    }
    }
    

