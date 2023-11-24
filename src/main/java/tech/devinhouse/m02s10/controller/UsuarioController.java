package tech.devinhouse.m02s10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m02s10.model.Usuario;
import tech.devinhouse.m02s10.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
  @Autowired
  UsuarioService usuarioService;

  @PostMapping
  public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
    Usuario usuarioSalvo = usuarioService.save(usuario);
    return new ResponseEntity<>(usuarioSalvo, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Usuario> findById(@PathVariable Long id){
    Optional<Usuario> usuario = usuarioService.findById(id);
    return usuario.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping
  public List<Usuario> findAll(){
    return usuarioService.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    usuarioService.delete(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
