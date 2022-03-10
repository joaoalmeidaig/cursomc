package com.joao.cursomc.repositories;

import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository <Estado, Integer> {
}
