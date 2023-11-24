package tech.devinhouse.m02s10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.m02s10.model.Noticia;
import tech.devinhouse.m02s10.repository.NoticiaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaService {
  @Autowired
  NoticiaRepository noticiaRepository;

  public Noticia save(Noticia noticia){
    return noticiaRepository.save(noticia);
  }

  public Optional<Noticia> findById(Long id){
    return noticiaRepository.findById(id);
  }

  public List<Noticia> findAll(){
    return noticiaRepository.findAll();
  }

  public void delete(Long id){
    noticiaRepository.deleteById(id);
  }
}
