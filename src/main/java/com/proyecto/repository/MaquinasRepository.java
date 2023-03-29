package com.proyecto.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Maquinas;

@Repository("MaquinasRepo")
public interface MaquinasRepository extends JpaRepository<Maquinas, Serializable>{

}