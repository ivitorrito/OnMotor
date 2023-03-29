
package com.proyecto.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



import com.proyecto.entity.Maquinas;
import com.proyecto.repository.MaquinasRepository;
import com.proyecto.service.MaquinasService;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service("MaquinasServiceImp")
public class MaquinasServiceImp implements MaquinasService {
    private static final Log LOG = LogFactory.getLog(MaquinasServiceImp.class);
    @Autowired
    @Qualifier("MaquinasRepo")
    private MaquinasRepository MaquinasRepository;

    @Override
    public List<Maquinas> listAllMaquinas() {
        LOG.info("Call listAllMaquinas()");
        return MaquinasRepository.findAll();
    }

    @Override
    public Maquinas addMaquinas(Maquinas Maquinas) {
        LOG.info("Call addMaquinas()");
        return MaquinasRepository.save(Maquinas);
    }

   

    @Override
    public Maquinas updateMaquinas(Maquinas Maquinas) {
        MaquinasRepository.save(Maquinas);
        return null;
    }

    @Override
    public int removeMaquinas(int id) {
       Maquinas user = null;
        try {
            user = MaquinasRepository.findById(id)
                    .orElseThrow(() -> new Exception("UsernotFound in deleteUser -"+this.getClass().getName()));
        } catch (Exception ex) {
            Logger.getLogger(MaquinasServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        }

		MaquinasRepository.delete(user);
        return id;
    }
    
}