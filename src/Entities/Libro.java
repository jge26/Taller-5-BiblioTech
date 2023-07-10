package Entities;

public class Libro {

    private String isbm;
    private String titulo;
    private String autor;
    private String categoria;
    private int copias;
    private int precio;

    public Libro(String isbm, String titulo, String autor, String categoria, int copias, int precio) {
        this.isbm = isbm;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.copias = copias;
        this.precio = precio;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}