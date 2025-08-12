package com.medcare.clinica.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProdutoDTO {
    private Long id;
    private String nome;
    private BigDecimal preco;

    // Construtor padrão
    public ProdutoDTO() {
    }

    // Construtor com campos
    public ProdutoDTO(Long id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "ProdutoDTO{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", preco=" + preco +
               '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoDTO that = (ProdutoDTO) o;
        return Objects.equals(id, that.id) && 
               Objects.equals(nome, that.nome) && 
               Objects.equals(preco, that.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }
}