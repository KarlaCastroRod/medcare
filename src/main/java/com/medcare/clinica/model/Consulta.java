package com.medcare.clinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne; 
import jakarta.persistence.JoinColumn; 
import java.time.LocalDateTime; 
import java.math.BigDecimal;
import java.util.Objects; 

@Entity 
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

   
    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false) 
    private Paciente paciente; 

    
    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false) 
    private Medico medico; 

    @Column(nullable = false) 
    private LocalDateTime dataHora; 

    @Column(nullable = false, length = 50) 
    private String status;

    @Column(precision = 10, scale = 2) 
    private BigDecimal valor; 

    @Column(length = 1000) 
    private String observacoes; 


    public Consulta() {
    }


    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String status) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.status = status;
    }


    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String status, BigDecimal valor, String observacoes) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.status = status;
        this.valor = valor;
        this.observacoes = observacoes;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
    @Override
    public String toString() {
        return "Consulta{" +
               "id=" + id +
               ", paciente=" + (paciente != null ? paciente.getNome() : "N/A") + 
               ", medico=" + (medico != null ? medico.getNome() : "N/A") +   
               ", dataHora=" + dataHora +
               ", status='" + status + '\'' +
               ", valor=" + valor +
               ", observacoes='" + observacoes + '\'' +
               '}';
    }

  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(id, consulta.id);
    }

    @Override
    public int hashCode() {
        return id != null ? Objects.hash(id) : getClass().hashCode();
    }
}

