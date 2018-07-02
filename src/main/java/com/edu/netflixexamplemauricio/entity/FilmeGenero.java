package com.edu.netflixexamplemauricio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FILME_GENERO")
public class FilmeGenero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idFilmeGenero;

    @ManyToOne
    @JoinColumn(name = "ID_FILME")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "ID_GENERO")
    private Genero genero;


    public Long getIdFilmeGenero() {
        return idFilmeGenero;
    }

    public void setIdFilmeGenero(Long idFilmeGenero) {
        this.idFilmeGenero = idFilmeGenero;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
