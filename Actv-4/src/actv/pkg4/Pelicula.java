
package actv.pkg4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Pelicula {
    String titulo;
    String director;
    double duracion;

    Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
}

class ServicioCine {
    List<Pelicula> listaPeliculas;

    ServicioCine() {
        listaPeliculas = new ArrayList<>();
    }

    void cargarPelicula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título de la película: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el director de la película: ");
        String director = scanner.nextLine();
        System.out.print("Ingrese la duración de la película en horas: ");
        double duracion = scanner.nextDouble();
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        listaPeliculas.add(pelicula);
        System.out.println("Película cargada exitosamente.");
    }

    void mostrarPeliculas(List<Pelicula> peliculas) {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas cargadas.");
        } else {
            System.out.println("Lista de películas:");
            peliculas.forEach((pelicula) -> {
                System.out.println("Título: " + pelicula.titulo + ", Director: " + pelicula.director + ", Duración: " + pelicula.duracion + " horas");
            });
        }
    }

    void mostrarPeliculas() {
        mostrarPeliculas(listaPeliculas);
    }

    void mostrarPeliculasMayor1Hora() {
        List<Pelicula> peliculasMayor1Hora = new ArrayList<>();
        listaPeliculas.stream().filter((pelicula) -> (pelicula.duracion > 1)).forEachOrdered((pelicula) -> {
            peliculasMayor1Hora.add(pelicula);
        });
        mostrarPeliculas(peliculasMayor1Hora);
    }

    void ordenarPeliculasPorDuracionDesc() {
        List<Pelicula> peliculasOrdenadas = new ArrayList<>(listaPeliculas);
        Collections.sort(peliculasOrdenadas, Comparator.comparingDouble(pelicula -> pelicula.duracion));
        Collections.reverse(peliculasOrdenadas);
        mostrarPeliculas(peliculasOrdenadas);
    }

    void ordenarPeliculasPorDuracionAsc() {
        List<Pelicula> peliculasOrdenadas = new ArrayList<>(listaPeliculas);
        Collections.sort(peliculasOrdenadas, Comparator.comparingDouble(pelicula -> pelicula.duracion));
        mostrarPeliculas(peliculasOrdenadas);
    }

    void ordenarPeliculasPorTitulo() {
        List<Pelicula> peliculasOrdenadas = new ArrayList<>(listaPeliculas);
        Collections.sort(peliculasOrdenadas, Comparator.comparing(pelicula -> pelicula.titulo));
        mostrarPeliculas(peliculasOrdenadas);
    }

    void ordenarPeliculasPorDirector() {
        List<Pelicula> peliculasOrdenadas = new ArrayList<>(listaPeliculas);
        Collections.sort(peliculasOrdenadas, Comparator.comparing(pelicula -> pelicula.director));
        mostrarPeliculas(peliculasOrdenadas);
    }
}

    
    
    
    
    

