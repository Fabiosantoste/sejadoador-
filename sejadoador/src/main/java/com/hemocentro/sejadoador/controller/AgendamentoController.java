package com.hemocentro.sejadoador.controller;

import com.hemocentro.sejadoador.model.Agendamento;
import com.hemocentro.sejadoador.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping("/agendar")
    public ResponseEntity<Agendamento> agendar(@RequestBody Agendamento agendamento) {
        return ResponseEntity.ok(agendamentoService.agendarDoacao(agendamento));
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<List<Agendamento>> listar(@PathVariable String idUsuario) {
        return ResponseEntity.ok(agendamentoService.listarAgendamentosPorUsuario(idUsuario));
    }

    @GetMapping("/acompanhar/{idUsuario}")
    public ResponseEntity<List<Agendamento>> acompanharAgendamentos(@PathVariable String idUsuario) {
        List<Agendamento> agendamentos = agendamentoService.listarAgendamentosPorUsuario(idUsuario);
        if (agendamentos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(agendamentos);
    }
}

