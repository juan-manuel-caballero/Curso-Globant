package com.egg.biblioteca.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
@Entity
public class Libro {
    @Id
    private Long isbn;
    private String titulo;
    private Integer ejemplares;
    
    @Temporal(TemporalType.DATE)
    private Date alta;
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Editorial editorial;
    

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", ejemplares=" + ejemplares + ", alta=" + alta
                + ", autor=" + autor + ", editorial=" + editorial + "]";
    }

}