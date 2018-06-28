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

    private Long idFilme;
    private String sinopse;
    private double classificacao;
    private Long anoProducao;
    private Long anoLancamento;
    private Long duracao;
    private String produtora;
    private String roteirista;

    private Artista artista;
    private List<Elenco> elenco;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    public Long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Long idFilme) {
        this.idFilme = idFilme;
    }


    @Column(name = "SINOPSE")
    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


    @Column(name = "CLASSIFICACAO")
    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }


    @Column(name = "ANO_PRODUCAO")
    public Long getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(Long anoProducao) {
        this.anoProducao = anoProducao;
    }


    @Column(name = "ANO_LANCAMENTO")
    public Long getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Long anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    @Column(name = "DURACAO")
    public Long getDuracao() {
        return duracao;
    }

    public void setDuracao(Long duracao) {
        this.duracao = duracao;
    }


    @Column(name = "PRODUTORA")
    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }


    @Column(name = "ROTEIRISTA")
    public String getRoteirista() {
        return roteirista;
    }

    public void setRoteirista(String roteirista) {
        this.roteirista = roteirista;
    }


    @ManyToOne
    @JoinColumn(name = "ID_DIRETOR")
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


    @OneToMany (mappedBy = "filme")
    public List<Elenco> getElenco() {
        return elenco;
    }

    public void setElenco(List<Elenco> elenco) {
        this.elenco = elenco;
    }
}