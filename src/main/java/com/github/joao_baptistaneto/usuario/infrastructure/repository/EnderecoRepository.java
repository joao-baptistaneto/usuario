package com.github.joao_baptistaneto.usuario.infrastructure.repository;

import com.github.joao_baptistaneto.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
