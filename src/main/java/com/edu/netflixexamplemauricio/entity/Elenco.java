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
@Table(name = "ELENCO")
public class Elenco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ELENCO")
    private Long idElenco;

    @Column(name = "PERSONAGEM")
    private String personagem;

    @Column(name = "CATEGORIA_PERSONAGEM")
    private String categoriapersonagem;

    @ManyToOne
    @JoinColumn(name = "ID_FILME")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "ID_ARTISTA")
    private Artista artista;

    public Long getIdElenco() {
        return idElenco;
    }

    public void setIdElenco(Long idElenco) {
        this.idElenco = idElenco;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getCategoriapersonagem() {
        return categoriapersonagem;
    }

    public void setCategoriapersonagem(String categoriapersonagem) {
        this.categoriapersonagem = categoriapersonagem;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
