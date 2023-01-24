package cl.duoc.examendb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.examendb.model.entidades.CategoriaEnt;

import cl.duoc.examendb.services.CategoriaSvc;

@RestController
@RequestMapping("/instrumentos")

public class CategoriaCtrl {

    @Autowired
    CategoriaSvc categoriaSvc;

    @GetMapping(path = "/categoria", produces = { "application/json" })
    public List<CategoriaEnt> getAll() {
        return categoriaSvc.getAll();

    }

    @PostMapping(path = "/categoria", consumes = { "application/json" }, produces = { "application/json" })
    public CategoriaEnt add(@RequestBody CategoriaEnt categoria) {
        return categoriaSvc.add(categoria);
    }

}
