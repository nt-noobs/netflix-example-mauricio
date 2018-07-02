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
@Table(name = "FILME_PREMIO")
public class FilmePremio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME_PREMIO")
    private Long idFilmePremio;

    @ManyToOne
    @JoinColumn(name = "ID_FILME", nullable = false)
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "ID_PREMIO", nullable = false)
    private Premio premio;

    public Long getIdFilmePremio() {
        return idFilmePremio;
    }

    public void setIdFilmePremio(Long idFilmePremio) {
        this.idFilmePremio = idFilmePremio;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }
}
