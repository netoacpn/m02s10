package tech.devinhouse.m02s10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.m02s10.model.Jornalista;
import tech.devinhouse.m02s10.repository.JornalistaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JornalistaService {
  @Autowired
  JornalistaRepository jornalistaRepository;

  public Jornalista save(Jornalista jornalista){
    return jornalistaRepository.save(jornalista);
  }

  public Optional<Jornalista> findById(Long id){
    return jornalistaRepository.findById(id);
  }

  public List<Jornalista> findAll(){
    return jornalistaRepository.findAll();
  }

  public void delete(Long id){
    jornalistaRepository.deleteById(id);
  }
}
