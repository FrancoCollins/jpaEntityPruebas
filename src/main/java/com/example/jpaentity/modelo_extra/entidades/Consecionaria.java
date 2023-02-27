package com.example.jpaentity.modelo_extra.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Concesionarias")
public class Consecionaria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    private String nombre;
    @Column(name = "nombre_del_dueno")
    private String nombreDueno;

    private String direccion;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Coche> coleccionCoches;

    public Consecionaria(Integer id, String nombre, String nombreDueno, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
        this.direccion = direccion;
    }

    public Consecionaria() {

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

    public List<Coche> getColeccionLibros() {
        return coleccionCoches;
    }

    public void setColeccionLibros(List<Coche> coleccionCoches) {
        this.coleccionCoches = coleccionCoches;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", direccion='" + direccion + '\'' +
                ", coleccionLibros=" + coleccionCoches +
                '}';
    }
}