package com.example.jpaentity.modelo.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "editorial")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    private String nombre;

    private String direccion;
    @OneToMany(mappedBy = "editorial", cascade = CascadeType.ALL)
    private List<Libro> librosPublicados;

    public Editorial(Integer id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Editorial() {

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(List<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }


    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", librosPublicados=" + librosPublicados +
                '}';
    }
}