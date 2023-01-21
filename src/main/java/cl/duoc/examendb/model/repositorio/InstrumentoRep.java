package cl.duoc.examendb.model.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.examendb.model.entidades.InstrumentoEnt;

@Repository
public interface InstrumentoRep extends JpaRepository<InstrumentoEnt, Integer> {

}
