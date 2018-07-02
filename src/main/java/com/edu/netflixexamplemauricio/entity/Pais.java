package com.edu.netflixexamplemauricio.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAIS")
    private Long idPais;

    @Column(name = "NOME_PAIS")
    private String nomePais;

    @OneToMany(mappedBy = "pais")
    private List<FilmePais> filmePais;

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public List<FilmePais> getFilmePais() {
        return filmePais;
    }

    public void setFilmePais(List<FilmePais> filmePais) {
        this.filmePais = filmePais;
    }
}
