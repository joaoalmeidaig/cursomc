package com.joao.cursomc.repositories;

import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository <Cidade, Integer> {
}
