package tech.devinhouse.m02s10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m02s10.model.Jornalista;
import tech.devinhouse.m02s10.service.JornalistaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jornalista")
public class JornalistaController {
  @Autowired
  JornalistaService jornalistaService;

  @PostMapping
  public ResponseEntity<Jornalista> save(@RequestBody Jornalista jornalista){
    Jornalista jornalistaSalvo = jornalistaService.save(jornalista);
    return new ResponseEntity<>(jornalistaSalvo, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Jornalista> findById(@PathVariable Long id){
    Optional<Jornalista> jornalista = jornalistaService.findById(id);
    return jornalista.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping
  public List<Jornalista> findAll(){
    return jornalistaService.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    jornalistaService.delete(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
