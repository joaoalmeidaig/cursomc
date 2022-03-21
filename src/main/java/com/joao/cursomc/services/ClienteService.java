package com.joao.cursomc.services;

import com.joao.cursomc.ObjectNotFountException.ObjectNotFoundException;
import com.joao.cursomc.domain.Cliente;
import com.joao.cursomc.domain.Cliente;
import com.joao.cursomc.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Obejto não encontrado ID: " + id + "Tipo:" + Cliente.class.getName()));
    }
}
