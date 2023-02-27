package com.example.jpaentity.modelo_extra.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "editorial")
public class Fabrica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    private String nombre;

    private String direccion;
    @OneToMany(mappedBy = "fabrica", cascade = CascadeType.ALL)
    private List<Coche> cochesFabricados;

    public Fabrica(Integer id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Fabrica() {

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

    public List<Coche> getCochesFabricados() {
        return cochesFabricados;
    }

    public void setCochesFabricados(List<Coche> cochesFabricados) {
        this.cochesFabricados = cochesFabricados;
    }


    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", librosPublicados=" + cochesFabricados +
                '}';
    }
}