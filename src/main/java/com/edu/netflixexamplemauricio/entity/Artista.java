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
@Table(name = "ARTISTA")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ARTISTA")
    private Long idArtista;

    @Column(name = "NOME_ARTISTA")
    private String nomeArtista;

    @OneToMany(mappedBy = "diretor")
    private List<Filme> filmes;

    @OneToMany(mappedBy = "artista")
    private List<Elenco> elencos;

    public Long getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Long idArtista) {
        this.idArtista = idArtista;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Elenco> getElencos() {
        return elencos;
    }

    public void setElencos(List<Elenco> elencos) {
        this.elencos = elencos;
    }
}
