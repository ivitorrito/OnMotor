package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Maquinas;

public interface MaquinasService {
    public List<Maquinas> listAllMaquinas();
    public Maquinas addMaquinas(Maquinas Maquinas);
    public int removeMaquinas(int id);
    public Maquinas updateMaquinas(Maquinas Maquinas);
}