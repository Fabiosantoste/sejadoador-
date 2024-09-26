package com.hemocentro.sejadoador.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/exames")
public class ExameController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadExame(@RequestParam("file") MultipartFile file) {
        // Simular o upload do exame e salvá-lo (implementação futura)
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Arquivo não enviado.");
        }
        return ResponseEntity.ok("Exame enviado com sucesso.");
    }
}
