package Forms;

import Entities.Libro;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;

public class buscarLibro extends JFrame {

    private JPanel buscarLibroForm;

    private JTextField isbnbuscarField;
    private JButton isbnBuscarButton;
    private JTextArea datosLibrosArea;
    private JLabel isbnLabel;

    private List<Libro> libroList;

    public buscarLibro(List<Libro> libroList) {
        this.libroList = libroList;

        String isbnBuscar = this.isbnbuscarField.getText();
        Iterator variable = this.libroList.iterator();

        while(variable.hasNext()) {
            Libro libro = (Libro)variable.next();
            if (libro.getIsbm().equalsIgnoreCase(isbnBuscar)) {
                this.datosLibrosArea.append(libro.toString() + "\n");
            }
        }

    }
}
