package tech.devinhouse.m02s10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m02s10.model.Revisor;
import tech.devinhouse.m02s10.service.RevisorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/revisor")
public class RevisorController {
  @Autowired
  RevisorService revisorService;

  @PostMapping
  public ResponseEntity<Revisor> save(@RequestBody Revisor revisor){
    Revisor revisorSalvo = revisorService.save(revisor);
    return new ResponseEntity<>(revisorSalvo, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Revisor> findById(@PathVariable Long id){
    Optional<Revisor> revisor = revisorService.findById(id);
    return revisor.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping
  public List<Revisor> findAll(){
    return revisorService.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    revisorService.delete(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
