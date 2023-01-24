package cl.duoc.examendb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.examendb.model.entidades.CategoriaEnt;
import cl.duoc.examendb.model.repositorio.CategoriaRep;

@Service
public class CategoriaSvc {

    public List<CategoriaEnt> getAll() {
        return CategoriaEnt.findAll();
    }

}
