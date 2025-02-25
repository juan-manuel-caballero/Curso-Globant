package com.egg.biblioteca.entidades;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Libro {

    @Id
    private Long isbn;

    @Column
    private String titulo;

    @Column
    private Integer ejemplares;

    @Column
    @Temporal(TemporalType.DATE)
    private Date alta;

    @JoinColumn(name = "id_autor")
    @ManyToOne
    private Autor autor;

    @JoinColumn(name = "id_editorial")
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
