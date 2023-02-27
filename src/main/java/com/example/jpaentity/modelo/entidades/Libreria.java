package com.example.jpaentity.modelo.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libreria")
public class Libreria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    private String nombre;

    private String nombreDueno;

    private String direccion;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Libro> coleccionLibros;

    public Libreria(Integer id, String nombre, String nombreDueno, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
        this.direccion = direccion;
    }

    public Libreria() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getColeccionLibros() {
        return coleccionLibros;
    }

    public void setColeccionLibros(List<Libro> coleccionLibros) {
        this.coleccionLibros = coleccionLibros;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", direccion='" + direccion + '\'' +
                ", coleccionLibros=" + coleccionLibros +
                '}';
    }
}