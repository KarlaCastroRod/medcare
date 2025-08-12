package com.medcare.clinica.service;

import com.medcare.clinica.model.Medico;
import com.medcare.clinica.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medico criarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public List<Medico> listarTodosMedicos() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> buscarMedicoPorId(Long id) {
        return medicoRepository.findById(id);
    }

    public Medico atualizarMedico(Long id, Medico medico) {
        return medicoRepository.findById(id)
                .map(medicoExistente -> {
                    medico.setId(id); 
                    return medicoRepository.save(medico);
                })
                .orElseThrow(() -> new RuntimeException("Médico não encontrado com ID: " + id));
    }

    public void deletarMedico(Long id) {
        if (medicoRepository.existsById(id)) {
            medicoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Médico não encontrado com ID: " + id);
        }
    }

    public Optional<Medico> buscarMedicoPorCrm(String crm) {
        return medicoRepository.findByCrm(crm);
    }
}
