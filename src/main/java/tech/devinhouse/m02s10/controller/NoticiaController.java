package tech.devinhouse.m02s10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m02s10.model.Noticia;
import tech.devinhouse.m02s10.service.NoticiaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/noticia")
public class NoticiaController {
  @Autowired
  NoticiaService noticiaService;

  @PostMapping
  public ResponseEntity<Noticia> save(@RequestBody Noticia noticia){
    Noticia noticiaSalva = noticiaService.save(noticia);
    return new ResponseEntity<>(noticiaSalva, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Noticia> findById(@PathVariable Long id){
    Optional<Noticia> noticia = noticiaService.findById(id);
    return noticia.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping
  public List<Noticia> findAll(){
    return noticiaService.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    noticiaService.delete(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
