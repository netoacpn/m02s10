package tech.devinhouse.m02s10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.m02s10.model.Revisor;

@Repository
public interface RevisorRepository extends JpaRepository<Revisor, Long> {
}
