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
@Table(name = "FILME_PAIS")
public class FilmePais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAIS_FILME")
    private Long idFilmePais;

    @ManyToOne
    @JoinColumn(name = "ID_FILME")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "ID_PAIS")
    private Pais pais;

    public Long getIdFilmePais() {
        return idFilmePais;
    }

    public void setIdFilmePais(Long idFilmePais) {
        this.idFilmePais = idFilmePais;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
