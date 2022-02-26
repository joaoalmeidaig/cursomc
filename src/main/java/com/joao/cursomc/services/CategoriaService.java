package com.joao.cursomc.services;

import com.joao.cursomc.ObjectNotFountException.ObjectNotFoundException;
import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Obejto não encontrado ID: " + id + "Tipo:" + Categoria.class.getName()));
    }
}
