package io.github.develoeprheart.repository.denuncia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.UUID;

public interface DenunciaRepository extends JpaRepository<Denuncia, UUID>, QuerydslPredicateExecutor<Denuncia> {

}
