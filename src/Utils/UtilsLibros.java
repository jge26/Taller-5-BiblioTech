package Utils;

import Entities.Libro;

import java.io.*;
import java.util.List;

public class UtilsLibros {

    public static void escribirArchivoLibros(List<Libro> libroList) {

        //Escribe el archivo "libros.txt"
        try {
            BufferedWriter escribirLibro = new BufferedWriter(new FileWriter("libros.txt"));

            for (Libro libro : libroList) {
                String linea = libro.getIsbm() + "," + libro.getTitulo() + "," + libro.getAutor() + "," + libro.getCategoria() + "," + libro.getCopias() + "," + libro.getPrecio();
            }
            escribirLibro.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    public static void leerArchivoLibros(List<Libro> libroList) {

        // Leer el archivo "libros.txt"
        try (BufferedReader leerLibro = new BufferedReader(new FileReader("libros.txt"))) {
            String line;
            while ((line = leerLibro.readLine()) != null) {
                String[] chain = line.split(",");
                String isbn = chain[0];
                String titulo = chain[1];
                String autor = chain[2];
                String categoria = chain[3];
                int copias = Integer.parseInt(chain[4]);
                int precio = Integer.parseInt(chain[5]);

                Libro libro = new Libro(isbn, titulo,autor,categoria,copias,precio);
                libroList.add(libro);

            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
