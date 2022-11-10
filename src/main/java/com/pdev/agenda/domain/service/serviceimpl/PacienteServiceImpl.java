package com.pdev.agenda.domain.service.serviceimpl;

import com.pdev.agenda.domain.entity.Paciente;
import com.pdev.agenda.domain.repository.PacienteRepository;
import com.pdev.agenda.domain.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    @Override
    public Paciente salvar(Paciente paciente) {

        //TODO: Validar se ja existe CPF e Email

        return pacienteRepository.save(paciente);
    }

    @Override
    public Optional<Paciente> buscarPorId(Long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public void deletar(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }
}
