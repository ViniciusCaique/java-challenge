package org.example.controllers;

import jakarta.persistence.EntityManager;
import org.example.models.Usuario;

public class UsuarioController {

    private EntityManager entityManager;

    public Usuario findUsuarioById(int id){
        Usuario usuario = entityManager.find(Usuario.class, id);
        if(usuario == null){
            return null;
        }
        return usuario;
    }
}
