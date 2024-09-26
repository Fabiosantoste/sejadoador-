package com.hemocentro.sejadoador.repository;

import com.hemocentro.sejadoador.model.Agendamento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {

    // O método de busca deve seguir o padrão correto: findBy + NomeDoCampo
    List<Agendamento> findByIdUsuario(String idUsuario);
}
