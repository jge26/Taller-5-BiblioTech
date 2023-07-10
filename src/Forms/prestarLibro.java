package Forms;

import Entities.Libro;
import Entities.Registro;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class prestarLibro extends JPanel{

    private JPanel prestarLibroForm;

    private JTextField isbnPrestarLibro;
    private JButton arrendarButton;

    private List<Libro> libroList;


    private void prestarLibro(List<Libro> libroList,List<Registro> registroList) {
        try {
            String isbnPrestamo = isbnPrestarLibro.getText();
            if (!isbnPrestamo.isEmpty()) {
                for (Libro aux: libroList) {
                    if (aux.getIsbm().equalsIgnoreCase(isbnPrestamo) && aux.getCopias() >= 1) {


                    }
                    if (aux.getIsbm().equalsIgnoreCase(isbnPrestamo) && aux.getCopias() <= 0) {
                        JOptionPane.showMessageDialog(prestarLibroForm, "No se encuentran copias disponibles ");
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

