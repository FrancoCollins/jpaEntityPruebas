package com.example.jpaentity.modelo_extra.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "coches")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    private double precio;

    private String modelo;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Fabrica.class)
    @JoinColumn(name = "fk_id_fabrica", referencedColumnName = "id")
    private Fabrica fabrica;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "lista_concesionaria",
            joinColumns = {@JoinColumn(name = "fk_id_coche", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "fk_id_concesionaria", referencedColumnName = "id")})
    private List<Consecionaria> concecionarias;

    public Coche(Integer id, Cliente cliente, double precio, String modelo, Fabrica fabrica) {
        this.id = id;
        this.cliente = cliente;
        this.precio = precio;
        this.modelo = modelo;
        this.fabrica = fabrica;
    }

    public Coche() {

    }

    public Cliente getAutor() {
        return cliente;
    }

    public void setAutor(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fabrica getEditorial() {
        return fabrica;
    }

    public void setEditorial(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public List<Consecionaria> getConcecionarias() {
        return concecionarias;
    }

    public void setConcecionarias(List<Consecionaria> concecionarias) {
        this.concecionarias = concecionarias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}