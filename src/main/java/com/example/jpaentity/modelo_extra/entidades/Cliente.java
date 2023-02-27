package com.example.jpaentity.modelo_extra.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    private String nombre;
    private String apellidos;

    @OneToOne
    private Licencia licencia;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cliente")
    private List<Coche> coches;

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Cliente(Integer id, String nombre, String apellidos, Date fecha_nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Cliente() {

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", libros=" + coches +
                '}';
    }
}