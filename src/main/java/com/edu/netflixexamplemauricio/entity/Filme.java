package com.edu.netflixexamplemauricio.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FILME")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    private Long idFilme;

    @Column(name = "NOME_FILME")
    private String nomeFilme;

    @Column(name = "SINOPSE")
    private String sinopse;

    @Column(name = "CLASSIFICACAO")
    private Double classificacao;

    @Column(name = "ANO_PRODUCAO")
    private Long anoProducao;

    @Column(name = "ANO_LANCAMENTO")
    private Long anoLancamento;

    @Column(name = "DURACAO")
    private Long duracao;

    @Column(name = "PRODUTORA")
    private String produtora;

    @Column(name = "ROTEIRISTA")
    private String roteirista;

    @ManyToOne
    @JoinColumn(name = "ID_DIRETOR")
    private Artista diretor;

    @OneToMany(mappedBy = "filme")
    private List<Elenco> elencos;

    @OneToMany(mappedBy = "filme")
    private List<FilmePremio> filmePremios;

    @OneToMany(mappedBy = "filme")
    private List<FilmePais> filmePais;

    @OneToMany(mappedBy = "filme")
    private List<FilmeGenero> filmeGeneros;

    public Long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Long idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Double classificacao) {
        this.classificacao = classificacao;
    }

    public Long getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(Long anoProducao) {
        this.anoProducao = anoProducao;
    }

    public Long getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Long anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Long getDuracao() {
        return duracao;
    }

    public void setDuracao(Long duracao) {
        this.duracao = duracao;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getRoteirista() {
        return roteirista;
    }

    public void setRoteirista(String roteirista) {
        this.roteirista = roteirista;
    }

    public Artista getDiretor() {
        return diretor;
    }

    public void setDiretor(Artista diretor) {
        this.diretor = diretor;
    }

    public List<Elenco> getElencos() {
        return elencos;
    }

    public void setElencos(List<Elenco> elencos) {
        this.elencos = elencos;
    }

    public List<FilmePremio> getFilmePremios() {
        return filmePremios;
    }

    public void setFilmePremios(List<FilmePremio> filmePremios) {
        this.filmePremios = filmePremios;
    }

    public List<FilmePais> getFilmePais() {
        return filmePais;
    }

    public void setFilmePais(List<FilmePais> filmePais) {
        this.filmePais = filmePais;
    }

    public List<FilmeGenero> getFilmeGeneros() {
        return filmeGeneros;
    }

    public void setFilmeGeneros(List<FilmeGenero> filmeGeneros) {
        this.filmeGeneros = filmeGeneros;
    }
}