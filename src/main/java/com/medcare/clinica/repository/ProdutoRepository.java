package com.medcare.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medcare.clinica.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}