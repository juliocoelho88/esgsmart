package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.Motorista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotoristaRepository extends JpaRepository<Motorista, Integer> {

    @Override
    void deleteById(Integer integer);

    @Override
    List<Motorista> findAllById(Iterable<Integer> integers);

    @Override
    Page<Motorista> findAll(Pageable pageable);

    List<Motorista> findByNome(String nome);


}
