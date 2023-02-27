package com.example.jpaentity.modelo.accesoDatos;

import com.example.jpaentity.modelo.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accAutor extends JpaRepository<Autor, Integer> {
}
