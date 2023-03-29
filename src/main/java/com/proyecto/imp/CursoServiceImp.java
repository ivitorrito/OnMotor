package com.proyecto.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.proyecto.entity.Curso;
import com.proyecto.entity.Maquinas;
import com.proyecto.repository.CursoRepository;
import com.proyecto.service.CursoService;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service("cursoServiceImp")
public class CursoServiceImp implements CursoService {
    private static final Log LOG = LogFactory.getLog(CursoServiceImp.class);
    @Autowired
    @Qualifier("cursoRepo")
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> listAllCursos() {
        LOG.info("Call listAllCursos()");
        return cursoRepository.findAll();
    }

    @Override
    public Curso addCurso(Curso curso) {
        LOG.info("Call addCurso()");
        return cursoRepository.save(curso);
    }

   

    @Override
    public Curso updateCurso(Curso curso) {
        cursoRepository.save(curso);
        return null;
    }

    @Override
    public int removeCurso(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int buscaCurso(int id) {
     
       Curso user = null;
        try {
            user = cursoRepository.findById(id)
                    .orElseThrow(() -> new Exception("UsernotFound in deleteUser -"+this.getClass().getName()));
        } catch (Exception ex) {
            Logger.getLogger(MaquinasServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        }

		cursoRepository.findAll();
        return id;
    }

    @Override
    public List<Curso> listAllCursos2(int id) {
         LOG.info("Call listAllCursos()");
        return cursoRepository.findAllById(id);
    }

    @Override
    public List<Curso> listAllcusros3(String nombre) {
        return cursoRepository.findByNombre(nombre);
    }
    

}
