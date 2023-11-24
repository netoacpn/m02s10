package tech.devinhouse.m02s10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.m02s10.model.Usuario;
import tech.devinhouse.m02s10.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
  @Autowired
  UsuarioRepository usuarioRepository;

  public Usuario save(Usuario usuario){
    return usuarioRepository.save(usuario);
  }

  public Optional<Usuario> findById(Long id){
    return usuarioRepository.findById(id);
  }

  public List<Usuario> findAll(){
    return usuarioRepository.findAll();
  }

  public void delete(Long id){
    usuarioRepository.deleteById(id);
  }
}
