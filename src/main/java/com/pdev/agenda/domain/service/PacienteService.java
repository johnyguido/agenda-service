package com.pdev.agenda.domain.service;

import com.pdev.agenda.domain.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {

    Paciente salvar(Paciente paciente);

    Optional<Paciente> buscarPorId(Long id);

    void deletar(Long id);

    List<Paciente> listarTodos();
}
