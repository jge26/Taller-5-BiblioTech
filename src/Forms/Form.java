package Forms;

import Entities.Libro;
import Entities.Usuario;
import Forms.Menu.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

public class Form extends JFrame{

    private JPanel registerForm;

    private JTextField rutField;
    private JLabel rutLabel;
    private JPasswordField contraseniaField;
    private JLabel contraseniaLabel;
    private JButton iniciarSesionButton;

    private List<Usuario> usuarioList;
    private List<Libro> libroList;

    public Form(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;

        this.setContentPane(this.registerForm);
        this.setTitle("Inicio de sesión");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);

    }

private void inicioSesion(List<Usuario> usuarioList) {
        try {
            String rut = rutField.getText();
            char[] contrasenia = contraseniaField.getPassword();

            if(!rut.isEmpty() && contrasenia.length != 0) {
                for (Usuario aux: usuarioList) {
                    if (aux.getRut().equalsIgnoreCase(rut)) {
                        iniciarSesionButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (iniciarSesionButton.isSelected()) {
                                    dispose();

                                    // Deberia poder cerrar la ventana actual y abrir la siguiente que seria menu pero no supe como :(

                                }
                            }
                        });
                    }


                }
            } else {
                JOptionPane.showMessageDialog(registerForm, "Por favor, ingrese datos en todos los campos. ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
