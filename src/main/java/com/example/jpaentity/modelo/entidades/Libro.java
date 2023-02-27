package com.example.jpaentity.modelo.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_autor", referencedColumnName = "id")
    private Autor autor;

    private double precio;

    private String titulo;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Editorial.class)
    @JoinColumn(name = "fk_id_editorial", referencedColumnName = "id")
    private Editorial editorial;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "libros_en_librerias",
            joinColumns = {@JoinColumn(name = "fk_id_libro", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "fk_id_librerias", referencedColumnName = "id")})
    private List<Libreria> libreriaList;

    public Libro(Integer id, Autor autor, double precio, String titulo, Editorial editorial) {
        this.id = id;
        this.autor = autor;
        this.precio = precio;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Libro() {

    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Libreria> getLibreriaList() {
        return libreriaList;
    }

    public void setLibreriaList(List<Libreria> libreriaList) {
        this.libreriaList = libreriaList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}