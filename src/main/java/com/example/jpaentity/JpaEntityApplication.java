package com.example.jpaentity;

import com.example.jpaentity.Gestor.gestorClases;
import com.example.jpaentity.modelo.accesoDatos.accAutor;
import com.example.jpaentity.modelo.entidades.Autor;
import com.example.jpaentity.modelo.entidades.Editorial;
import com.example.jpaentity.modelo.entidades.Libreria;
import com.example.jpaentity.modelo.entidades.Libro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Calendar;
import static java.util.Arrays.asList;

@SpringBootApplication
public class JpaEntityApplication {

    public static void main(String[] args) {
        ApplicationContext c = SpringApplication.run(JpaEntityApplication.class, args);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1995);
        cal.set(Calendar.MONTH, 7);
        cal.set(Calendar.DAY_OF_MONTH, 8);
        Autor autorUno = new Autor(null, "Franco", "Collins", cal.getTime());
        cal.set(Calendar.YEAR, 1999);
        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DAY_OF_MONTH, 2);
        Autor autorDos = new Autor(null, "Jeffer", "Mogollon", cal.getTime());
        cal.set(Calendar.YEAR, 1989);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        Autor autorTres = new Autor(null, "Pablo", "Cantalapiedra", cal.getTime());

        Editorial editorialUno = new Editorial(null, "La casa del diario", "Paseo de Granada, 100");
        Editorial editorialDos = new Editorial(null, "La casa de la revista", "Paseo de Sevilla, 120");

        Libro libroUno = new Libro(null, autorUno, 10.2, "Speak louder", editorialUno);
        Libro libroDos = new Libro(null, autorDos, 10.2, "Graniza en la tierra", editorialDos);
        Libro libroTres = new Libro(null, autorTres, 10.2, "Mas alla", editorialUno);
        Libro libroCuatro = new Libro(null, autorUno, 10.2, "Breaking rules", editorialDos);
        Libro libroCinco = new Libro(null, autorDos, 10.2, "El siberiano", editorialUno);
        Libro libroSeis = new Libro(null, autorTres, 10.2, "Canalla", editorialDos);
        Libro libroSiete = new Libro(null, autorUno, 10.2, "Pensando en mi", editorialUno);
        Libro libroOcho = new Libro(null, autorDos, 10.2, "Sexo para dummies", editorialDos);

        autorUno.setLibros(asList(libroUno,libroCuatro,libroSiete));
        autorDos.setLibros(asList(libroTres,libroSeis));
        autorTres.setLibros(asList(libroSeis,libroSiete,libroOcho));

        editorialUno.setLibrosPublicados(asList(libroUno,libroTres,libroCinco,libroSiete));
        editorialDos.setLibrosPublicados(asList(libroDos,libroCuatro,libroSeis,libroOcho));


        Libreria libreriaUno = new Libreria(null,"Los libros de Pedro","Pedro", "Calle alcachofa 123");
        Libreria libreriaDos = new Libreria(null,"Los libros de Sandro","Sandro", "Calle croqueta 321");

        libreriaUno.setColeccionLibros(asList(libroCinco,libroDos,libroCuatro,libroTres));
        libroUno.setLibreriaList(asList(libreriaUno,libreriaDos));
        libroDos.setLibreriaList(asList(libreriaUno,libreriaDos));
        libroTres.setLibreriaList(asList(libreriaUno,libreriaDos));
        libroCuatro.setLibreriaList(asList(libreriaUno,libreriaDos));



        libreriaDos.setColeccionLibros(asList(libroUno,libroSeis,libroSiete,libroOcho));
        libroCinco.setLibreriaList(asList(libreriaDos));
        libroSeis.setLibreriaList(asList(libreriaUno));
        libroSiete.setLibreriaList(asList(libreriaDos));
        libroOcho.setLibreriaList(asList(libreriaUno));


        System.out.println("==============================================");
        gestorClases g = (gestorClases) c.getBean("gestorClases");
        g.agregarEditorial(autorTres);
        g.agregarEditorial(autorDos);


    }

}
