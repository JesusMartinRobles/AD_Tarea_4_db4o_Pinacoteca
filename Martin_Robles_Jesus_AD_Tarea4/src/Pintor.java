/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Pintor que contiene los atributos de un pintor y su constructor
 * @author Jesus
 */
public class Pintor {

    int idPintor; // Identificador del pintor
    String nombre; // Nombre del pintor
    String nacionalidad; // Nacionalidad del pintor
    int anioNacimiento; // Año de nacimiento del pintor
    String estilo; // Estilo del pintor

    // Constructor de la clase Pintor
    public Pintor(int idPintor, String nombre, String nacionalidad, int anioNacimiento, String estilo) {
        this.idPintor = idPintor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
        this.estilo = estilo;
    }

    // Getters y Setters
    public int getIdPintor() {
        return idPintor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setIdPintor(int idPintor) {
        this.idPintor = idPintor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pintor { " + "Nombre=" + nombre + ", Nacionalidad=" + nacionalidad + ", Año Nacimiento=" + anioNacimiento + ", Estilo=" + estilo + " }";
    }

}
