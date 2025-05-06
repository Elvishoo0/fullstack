package com.example.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean autenticar(String correo, String contrasenaPlano) {
        Optional<Usuario> usuario = loginRepository.findByCorreo(correo);

        return usuario
                .map(u -> u.getContrasena().equals(contrasenaPlano))
                .orElse(false);
    }
}
