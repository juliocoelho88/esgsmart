package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.ColetaDeLixo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColetaDeLixoRepository extends JpaRepository<ColetaDeLixo, Integer> {

    @Override
    List<ColetaDeLixo> findAllById(Iterable<Integer> integers);

    List<ColetaDeLixo> findByLocalizacao(String localizacao);
    @Override
    Page<ColetaDeLixo> findAll(Pageable pageable);

    @Override
    void deleteById(Integer integer);
}
