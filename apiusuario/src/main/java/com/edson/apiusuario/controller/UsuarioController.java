package com.edson.apiusuario.controller;

import com.edson.apiusuario.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong();

@GetMapping
public List<Usuario> listarUsuarios(){
    return usuarios;

}

@PostMapping
public Usuario adicionarUsuario(@RequestBody Usuario usuario){
    usuario.setId(idCounter.incrementAndGet());
    usuarios.add(usuario);
    return usuario;
}




}
