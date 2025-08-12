package com.medcare.clinica.service;

import org.springframework.stereotype.Service;
import com.medcare.clinica.model.Produto;
import com.medcare.clinica.repository.ProdutoRepository;
import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public void inserirProduto(Produto produto) {
        repository.save(produto);
    }
    
    
    
    public void atualizarProduto(Produto produto) {
    	repository.save(produto);
    	
    	
    }

    public void deletarProduto(int id) {
    	repository.deleteById(id);
    	
    	
    }
   
}