package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.VeiculoColeta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VeiculoColetaRepository extends JpaRepository<VeiculoColeta, Long> {

    @Override
    List<VeiculoColeta> findAllById(Iterable<Long> longs);

    @Override
    void deleteById(Long integer);

    @Override
    Page<VeiculoColeta> findAll(Pageable pageable);


}
