package com.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.service.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
