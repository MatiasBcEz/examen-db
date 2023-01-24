package cl.duoc.examendb.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.duoc.examendb.controller.Instrumento;

import javax.persistence.*;
import java.util.Collection;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class CategoriaEnt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idCategoria;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_categoria", referencedColumnName = "id" , insertable = false, updatable = false)
    @JsonBackReference
    private Collection<Instrumento> instrumentoByIdCategoria;

}
