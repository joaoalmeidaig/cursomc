package com.joao.cursomc.repositories;

import com.joao.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
}
