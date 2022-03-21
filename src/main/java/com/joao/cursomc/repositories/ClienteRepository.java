package com.joao.cursomc.repositories;

import com.joao.cursomc.domain.Cliente;
import com.joao.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
