/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Cuadro que contiene los atributos de un cuadro y su constructor
 * @author Jesus
 */
public class Cuadro {

    int numCatalogo; // Número de catálogo
    String titulo; // Título del cuadro
    double precio; // Precio del cuadro
    String estado; // Estado del cuadro
    String tipo; // Tipo de cuadro
    Pintor pintor; // Pintor del cuadro

    // Constructor de la clase Cuadro
    public Cuadro(int numCatalogo, String titulo, double precio, String estado, String tipo, Pintor pintor) {
        this.numCatalogo = numCatalogo;
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        this.tipo = tipo;
        this.pintor = pintor;
    }

    // Getters y Setters
    public int getNumCatalogo() {
        return numCatalogo;
    }

    public void setNumCatalogo(int numCatalogo) {
        this.numCatalogo = numCatalogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pintor getPintor() {
        return pintor;
    }

    public void setPintor(Pintor pintor) {
        this.pintor = pintor;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuadro {\n"
                + "  Nº Catálogo: " + numCatalogo + ",\n"
                + "  Título: " + titulo + ",\n"
                + "  Precio: " + precio + ",\n"
                + "  Estado: " + estado + ",\n"
                + "  Tipo: " + tipo + ",\n"
                + "  Pintor: " + pintor + "\n"
                + "}";
    }

}
