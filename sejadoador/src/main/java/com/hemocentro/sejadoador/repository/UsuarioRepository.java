package com.hemocentro.sejadoador.repository;

import com.hemocentro.sejadoador.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByCpf(String cpf); // Adicionar este método
    boolean existsByCpf(String cpf);
}
