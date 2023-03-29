package com.proyecto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Curso;
import java.util.List;

@Repository("cursoRepo")
public interface CursoRepository extends JpaRepository<Curso, Serializable>{

    public List<Curso> findAllById(int id);
   

    public List<Curso> findByNombre(String nombre);
    

}