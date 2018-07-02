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
@Table(name = "PREMIO")
public class Premio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PREMIO")
    private Long idPremio;

    @Column(name = "TIPO_PREMIO")
    private String tipoPremio;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "ANO")
    private Long ano;

    @OneToMany(mappedBy = "premio")
    private List<FilmePremio> filmePremio;

    public Long getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(Long idPremio) {
        this.idPremio = idPremio;
    }

    public String getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(String tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public List<FilmePremio> getFilmePremio() {
        return filmePremio;
    }

    public void setFilmePremio(List<FilmePremio> filmePremio) {
        this.filmePremio = filmePremio;
    }
}