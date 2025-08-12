package com.medcare.clinica.service;

import com.medcare.clinica.model.Categoria;
import com.medcare.clinica.repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;


    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

 
    public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }


    public Optional<Categoria> buscarCategoriaPorId(Long id) {
        return categoriaRepository.findById(id);
    }


    public Categoria atualizarCategoria(Categoria categoria) {
    
        return categoriaRepository.save(categoria);
    }


    public void deletarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
