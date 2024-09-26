package com.hemocentro.sejadoador.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
@Data
public class Usuario {

    @Id
    private String id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private double peso;
    private String sexo;
    private Endereco endereco;
    private String tipoSanguineo;
    private boolean termoAssinado;

    // Classe interna para Endereço
    @Data
    public static class Endereco {
        private String rua;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;
    }
}
