
package mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioMascota {
     private Scanner leer = new Scanner(System.in);
    private ArrayList<String>mascotas;

    public ServicioMascota(ArrayList<String> mascotas) {
        this.mascotas = new ArrayList();
    }
    
    
    public void crearMascota(){
        System.out.println("Introce nombre");
        String nombre = leer.next();
        
        System.out.println("Introce nombre");
        String apodo = leer.next();
        
        
        System.out.println("Introce nombre");
        String tipo = leer.next();
        
        String mascota = nombre + ""+ apodo+ "" + tipo;
        
        mascota.add(mascota);

    }
    
    
    
    
}
