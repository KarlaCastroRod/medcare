package com.medcare.clinica.controller;

import com.medcare.clinica.model.Consulta;
import com.medcare.clinica.service.ConsultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    private final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @GetMapping("/paciente/{pacienteId}")
    public ResponseEntity<List<Consulta>> listarPorPaciente(@PathVariable Long pacienteId) {
        List<Consulta> consultas = consultaService.listarConsultasPorPaciente(pacienteId);
        return ResponseEntity.ok(consultas);
    }

    @GetMapping("/medico/{medicoId}")
    public ResponseEntity<List<Consulta>> listarPorMedico(@PathVariable Long medicoId) {
        List<Consulta> consultas = consultaService.listarConsultasPorMedico(medicoId);
        return ResponseEntity.ok(consultas);
    }

    @GetMapping("/periodo")
    public ResponseEntity<List<Consulta>> listarPorPeriodo(
            @RequestParam String inicio,
            @RequestParam String fim) {
        LocalDateTime dataInicio = LocalDateTime.parse(inicio);
        LocalDateTime dataFim = LocalDateTime.parse(fim);
        List<Consulta> consultas = consultaService.listarConsultasPorPeriodo(dataInicio, dataFim);
        return ResponseEntity.ok(consultas);
    }
}