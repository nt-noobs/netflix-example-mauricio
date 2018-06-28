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
@Table (name = "ELENCO")
public class Elenco {

    private Long idElenco;
    private String personagem;
    private String categoriapersonagem;

    private Filme filme;
    private Artista artista;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ELENCO")
    public Long getIdElenco() {
        return idElenco;
    }

    public void setIdElenco(Long idElenco) {
        this.idElenco = idElenco;
    }


    @Column (name = "PERSONAGEM")
    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }


    @Column (name = "CATEGORIA_PERSONAGEM")
    public String getCategoriapersonagem() {
        return categoriapersonagem;
    }

    public void setCategoriapersonagem(String categoriapersonagem) {
        this.categoriapersonagem = categoriapersonagem;
    }


    @ManyToOne
    @JoinColumn (name = "ID_FILME")
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


    @ManyToOne
    @JoinColumn (name = "ID_ARTISTA")
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
