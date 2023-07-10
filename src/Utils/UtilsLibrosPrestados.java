package Utils;

import Entities.Registro;
import Entities.Usuario;
import Utils.*;
import Entities.Libro;

import java.io.*;
import java.util.List;

public class UtilsLibrosPrestados {

    public static void escribirLibrosPrestados(List<Registro> registroList, List<Usuario> usuarioList) {

        //Escribe archivos en "registro.txt"
        try {
            BufferedWriter escribirLibroPrestado = new BufferedWriter(new FileWriter("registro.txt"));

            for (Registro libroPrestado: registroList) {
                String linea = libroPrestado.getRut() +","+ libroPrestado.getNombre() +","+ libroPrestado.getApellido() +","+ libroPrestado.getIsbn() +","+ libroPrestado.getTitulo() +","+ libroPrestado.getTransaccion();
            }
            escribirLibroPrestado.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    public static void leerArchivoLibrosPrestados(List<Registro> registroList) {

        //Lee el archivos "registro.txt"
        try (BufferedReader leerRegistro = new BufferedReader(new FileReader("registro.txt"))) {
            String linea;
            while((linea = leerRegistro.readLine()) != null) {
                String[] chain = linea.split("," );
                String rut = chain[0];
                String nombre = chain[1];
                String apellido = chain[2];
                String isbn = chain[3];
                String titulo = chain[4];
                String transaccion = chain[5];

                Registro registro = new Registro(rut,nombre,apellido,isbn,titulo,transaccion);
                registroList.add(registro);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
