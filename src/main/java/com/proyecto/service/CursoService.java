package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Curso;

public interface CursoService {
    public List<Curso> listAllCursos();
    public Curso addCurso(Curso curso);
    public int removeCurso(int id);
    public Curso updateCurso(Curso curso);
    public int buscaCurso(int id);
    public List<Curso> listAllCursos2(int id);
    public List<Curso> listAllcusros3(String nombre);
}