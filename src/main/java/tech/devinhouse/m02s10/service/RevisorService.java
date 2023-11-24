package tech.devinhouse.m02s10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.m02s10.model.Revisor;
import tech.devinhouse.m02s10.repository.RevisorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RevisorService {
  @Autowired
  RevisorRepository revisorRepository;

  public Revisor save(Revisor revisor){
    return revisorRepository.save(revisor);
  }

  public Optional<Revisor> findById(Long id){
    return revisorRepository.findById(id);
  }

  public List<Revisor> findAll(){
    return revisorRepository.findAll();
  }

  public void delete(Long id){
    revisorRepository.deleteById(id);
  }

}
