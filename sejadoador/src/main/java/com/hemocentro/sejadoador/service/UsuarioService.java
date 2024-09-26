package com.hemocentro.sejadoador.service;

import com.hemocentro.sejadoador.model.Usuario;
import com.hemocentro.sejadoador.repository.UsuarioRepository;
import com.hemocentro.sejadoador.exception.UsuarioExistenteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método para cadastrar um novo usuário
    public Usuario cadastrarUsuario(Usuario usuario) {
        if (usuarioRepository.existsByCpf(usuario.getCpf())) {
            throw new UsuarioExistenteException("Já existe um usuário com esse CPF.");
        }
        // A senha é armazenada sem criptografia por enquanto.
        return usuarioRepository.save(usuario);
    }

    // Método para realizar o login
    public Optional<Usuario> login(String email, String senha) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(email);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            // Valida se a senha informada bate com a armazenada (sem criptografia).
            if (senha.equals(usuario.getSenha())) {
                return Optional.of(usuario);
            }
        }
        return Optional.empty();  // Retorna Optional vazio se a senha for inválida
    }
    public boolean recuperarSenha(String cpf, String novaSenha) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByCpf(cpf);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.setSenha(novaSenha); // Aqui ainda sem criptografia
            usuarioRepository.save(usuario);
            return true;
        }
        return false;
    }
}

