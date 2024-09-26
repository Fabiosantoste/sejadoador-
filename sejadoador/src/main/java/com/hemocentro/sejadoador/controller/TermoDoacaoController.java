package com.hemocentro.sejadoador.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/termo")
public class TermoDoacaoController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadTermo(@RequestParam("file") MultipartFile file) {
        // Simular o upload do arquivo e salvá-lo (implementação de upload será feita no futuro)
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Arquivo não enviado.");
        }
        return ResponseEntity.ok("Termo de doação enviado com sucesso.");
    }
}
