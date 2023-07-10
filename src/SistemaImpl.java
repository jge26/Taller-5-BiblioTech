import Entities.Registro;
import Entities.Usuario;
import Entities.Libro;
import Forms.*;
import Utils.UtilsLibros;
import Utils.UtilsLibrosPrestados;
import Utils.UtilsUsuario;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class SistemaImpl implements Sistema{

    private Form form;
    private List<Usuario> usuarioList = new ArrayList<>();
    private List<Libro> libroList = new ArrayList<>();
    private List<Registro> registroList = new ArrayList<>();

    public SistemaImpl() {

        this.usuarioList = new ArrayList<>();
        UtilsUsuario.leerArchivoUsuario(this.usuarioList);
        this.libroList = new ArrayList<>();
        UtilsLibros.leerArchivoLibros(this.libroList);
    }

    @Override
    public void comenzarPrograma() {
        List<Usuario> lista = new ArrayList<>();
        new Form(lista);

    }
}
