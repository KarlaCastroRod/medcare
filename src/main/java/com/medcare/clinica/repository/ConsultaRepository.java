package com.medcare.clinica.repository;

import com.medcare.clinica.model.Consulta;
import com.medcare.clinica.model.Medico;
import com.medcare.clinica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    

    List<Consulta> findByPaciente(Paciente paciente);
    

    List<Consulta> findByMedico(Medico medico);
    
  
    List<Consulta> findByPacienteId(Long pacienteId);
    

    List<Consulta> findByMedicoId(Long medicoId);
    
    List<Consulta> findByDataHoraBetween(LocalDateTime inicio, LocalDateTime fim);
    

    List<Consulta> findByStatus(String status);
}