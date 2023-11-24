package tech.devinhouse.m02s10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Noticia {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String titulo;
  private String textoNoticia;
  private Long idRevisor;
  private Long idJornalista;
  private LocalDate dataCriacao;
  private LocalDate dataAtualizacao;

}
