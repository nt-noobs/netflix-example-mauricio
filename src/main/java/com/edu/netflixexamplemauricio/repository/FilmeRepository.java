package com.edu.netflixexamplemauricio.repository;

import com.edu.netflixexamplemauricio.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
