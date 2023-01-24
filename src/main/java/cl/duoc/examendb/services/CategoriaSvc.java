package cl.duoc.examendb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.examendb.model.entidades.CategoriaEnt;
import cl.duoc.examendb.model.repositorio.CategoriaRep;

@Service
public class CategoriaSvc {

    @Autowired
    CategoriaRep categoriaRep;

    public List<CategoriaEnt> getAll() {
        return categoriaRep.findAll();
    }

    public CategoriaEnt add(CategoriaEnt categoriaEnt){
        return categoriaRep.save(categoriaEnt);
    }
}
