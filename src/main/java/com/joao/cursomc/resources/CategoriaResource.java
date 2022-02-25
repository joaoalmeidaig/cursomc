package com.joao.cursomc.resources;

import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar() {
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        return lista;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> buscar(@PathVariable Integer id) {
        return ResponseEntity.ok().body(service.buscar(id));
    }
}
