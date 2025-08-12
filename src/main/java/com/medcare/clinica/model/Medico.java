package com.medcare.clinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column; // Importe para usar @Column
import java.util.Objects; // Importe para usar Objects.equals e Objects.hash

@Entity 
public class Medico {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false, length = 100) 
    private String nome;

    @Column(nullable = false, unique = true, length = 20) 
    private String crm;

    @Column(nullable = false, length = 100) 
    private String especialidade; 

    @Column(length = 20) 
    private String telefone;

    @Column(length = 100) 
    private String email;

   
    public Medico() {
    }

   
    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    
    public Medico(String nome, String crm, String especialidade, String telefone, String email) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.email = email;
    }

 
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Medico{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", crm='" + crm + '\'' +
               ", especialidade='" + especialidade + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               '}';
    }

  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
   
        return Objects.equals(id, medico.id);
    }

    @Override
    public int hashCode() {
  
        return id != null ? Objects.hash(id) : getClass().hashCode();
    }
}
