
package activ.pkg3.entra;

public class Libro {
     private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void prestar() {
        if (numEjemplaresPrestados < numEjemplares) {
            numEjemplaresPrestados++;
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("No quedan ejemplares disponibles para prestar.");
        }
    }

    public void devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            System.out.println("Libro devuelto exitosamente.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numEjemplaresPrestados=" + numEjemplaresPrestados +
                '}';
    }
}
