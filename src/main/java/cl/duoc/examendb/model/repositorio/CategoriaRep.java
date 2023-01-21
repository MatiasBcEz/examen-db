package cl.duoc.examendb.model.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.examendb.model.entidades.CategoriaEnt;

@Repository
public interface CategoriaRep extends JpaRepository<CategoriaEnt, Integer> {

}
