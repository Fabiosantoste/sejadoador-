package com.hemocentro.sejadoador.controller;

import com.hemocentro.sejadoador.model.SituacaoBancoSangue;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/banco-sangue")
public class BancoSangueController {

    @GetMapping("/situacao")
    public List<SituacaoBancoSangue> situacaoBancoSangue() {
        // Simular a situação do banco de sangue
        return Arrays.asList(
                new SituacaoBancoSangue("A+", 30),
                new SituacaoBancoSangue("A-", 40),
                new SituacaoBancoSangue("B+", 20),
                new SituacaoBancoSangue("O-", 50)
        );
    }
}
