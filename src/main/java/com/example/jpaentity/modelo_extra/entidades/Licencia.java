package com.example.jpaentity.modelo_extra.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "licencia")
public class Licencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Long numeroLicencia;

    @OneToOne
    private Cliente cliente;

    public Long getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(Long numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}