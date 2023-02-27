package com.example.jpaentity.Gestor;

import com.example.jpaentity.modelo.accesoDatos.accAutor;
import com.example.jpaentity.modelo.entidades.Autor;
import com.example.jpaentity.modelo.entidades.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class gestorClases {
    @Autowired
    private accAutor accEditorial;

    public void agregarEditorial(Autor editorial) {
        accEditorial.save(editorial);
    }
}
