package com.joao.cursomc.repositories;

import com.joao.cursomc.domain.Endereco;
import com.joao.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
