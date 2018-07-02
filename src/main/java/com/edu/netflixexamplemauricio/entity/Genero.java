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
@Table(name = "GENERO")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GENERO")
    private Long idGenero;

    @Column(name = "NOME_GENERO")
    private String nomeGenero;

    @OneToMany(mappedBy = "genero")
    private List<FilmeGenero> filmeGeneros;

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }


    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public List<FilmeGenero> getFilmeGeneros() {
        return filmeGeneros;
    }

    public void setFilmeGeneros(List<FilmeGenero> filmeGeneros) {
        this.filmeGeneros = filmeGeneros;
    }
}
