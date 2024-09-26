package com.hemocentro.sejadoador.service;

import com.hemocentro.sejadoador.model.Agendamento;
import com.hemocentro.sejadoador.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento agendarDoacao(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> listarAgendamentosPorUsuario(String idUsuario) {
        return agendamentoRepository.findByIdUsuario(idUsuario);
    }
}
