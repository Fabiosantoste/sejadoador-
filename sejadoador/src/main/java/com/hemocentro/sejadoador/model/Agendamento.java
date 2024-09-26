package com.hemocentro.sejadoador.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "agendamentos")
@Data
public class Agendamento {

    @Id
    private String id;
    private String idUsuario;
    private String idCentroDoacao;
    private String data;
    private String hora;
    private String local;
    private String status;
    private String hemograma;
}
