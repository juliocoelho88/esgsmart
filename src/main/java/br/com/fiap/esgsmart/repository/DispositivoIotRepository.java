package br.com.fiap.esgsmart.repository;

import br.com.fiap.esgsmart.model.DispositivoIoT;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DispositivoIotRepository extends JpaRepository<DispositivoIoT, Integer> {

    @Override
    List<DispositivoIoT> findAllById(Iterable<Integer> integers);

    @Override
    Page<DispositivoIoT> findAll(Pageable pageable);


    List<DispositivoIoT> findByLocalizacao(String localizacao);

    List<DispositivoIoT> findByDataInstalacao(String dataInstalacao);

    @Override
    void deleteById(Integer integer);
}
