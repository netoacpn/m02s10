package tech.devinhouse.m02s10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Revisor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long idUsuario;
  private String nome;
  private Float salario;
  private String nivelCargo;
}
