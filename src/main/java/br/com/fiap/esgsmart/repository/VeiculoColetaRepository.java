package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.VeiculoColeta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoColetaRepository extends JpaRepository<VeiculoColeta, Integer> {

    @Override
    List<VeiculoColeta> findAllById(Iterable<Integer> integers);

    @Override
    void deleteById(Integer integer);

    @Override
    Page<VeiculoColeta> findAll(Pageable pageable);
}
