package Utils;

import Entities.Usuario;

import java.io.*;
import java.util.List;

public class UtilsUsuario {

    public static void escribirArchivoUsuario (List<Usuario> usuarioList) {

        //Escribe el archivo "usuario.txt"
        try {
            BufferedWriter escribirUsuario = new BufferedWriter(new FileWriter("usuarios.txt"));

            for (Usuario usuario : usuarioList) {
                String linea  = usuario.getRut() +","+ usuario.getNombre() +"," + usuario.getApellido() +","+ usuario.getContrasenia();
            }
            escribirUsuario.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    public static void leerArchivoUsuario(List<Usuario> usuarioList) {

        // Leer el archivo "usuarios.txt"
        try (BufferedReader leerUsuario = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = leerUsuario.readLine()) != null) {
                String[] chain = linea.split(",");
                String rut = chain[0];
                String nombre = chain[1];
                String apellido = chain[2];
                String contrasenia = chain[3];

                Usuario usuario = new Usuario(rut,nombre,apellido,contrasenia);
                usuarioList.add(usuario);

            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}