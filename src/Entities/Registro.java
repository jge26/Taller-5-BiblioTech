package Entities;

public class Registro {

    private String rut;
    private String nombre;
    private String apellido;
    private String isbn;
    private String titulo;
    private String transaccion;

    public Registro(String rut, String nombre, String apellido, String isbn, String titulo, String transaccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.isbn = isbn;
        this.titulo = titulo;
        this.transaccion = transaccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }



}
