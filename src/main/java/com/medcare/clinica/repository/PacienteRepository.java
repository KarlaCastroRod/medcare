package com.medcare.clinica.repository;

import com.medcare.clinica.model.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
   
    Paciente findByCpf(String cpf);
    
    List<Paciente> findByNomeContainingIgnoreCase(String nome);
}