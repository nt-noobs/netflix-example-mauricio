package com.edu.netflixexamplemauricio.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String sinopse;
    private String diretor;
    private List<String> nacionalidade;
    private List<String> elenco;
    private double classificacao;
    private List<String> genero;
    private int anoProducao;
    private int anoLancamento;
    private int duracao;
    private List<String> premios;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(List<String> nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> genero) {
        this.genero = genero;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<String> getPremios() {
        return premios;
    }

    public void setPremios(List<String> premios) {
        this.premios = premios;
    }

    @Override
    public String toString() {
        return "Filme{"
                + "id=" + id
                + ", Sinopse='" + sinopse + '\''
                + ", diretor='" + diretor + '\''
                + ", nacionalidade=" + nacionalidade
                + ", elenco=" + elenco
                + ", classificacao=" + classificacao
                + ", genero=" + genero
                + ", anoProducao=" + anoProducao
                + ", anoLancamento=" + anoLancamento
                + ", duracao=" + duracao
                + ", premios=" + premios
                + '}';
    }
}
