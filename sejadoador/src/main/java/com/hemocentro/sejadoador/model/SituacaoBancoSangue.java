package com.hemocentro.sejadoador.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SituacaoBancoSangue {
    private String tipoSanguineo;
    private int quantidadeEmPorcentagem;
}
